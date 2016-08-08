package algorithm;
import java.util.*;

public class ExerciseMSTAndShortestPath<T> {
	private List<PriorityQueue<WeightedEdge1>> queues;
	private List<T> vertices;
	public ExerciseMSTAndShortestPath(T[] vertices, int[][] edges){
		queues = new ArrayList<PriorityQueue<WeightedEdge1>>();
		this.vertices = new ArrayList<T>();
		for(int i = 0; i < vertices.length; i++) {
			queues.add(new PriorityQueue<WeightedEdge1>());
			this.vertices.add(vertices[i]);
			
		}
		
		for(int i = 0; i < edges.length; i++){
			int u = edges[i][0];
			int v = edges[i][1];
			int w = edges[i][2];
			queues.get(u).offer(new WeightedEdge1(u, v, w));
		}
	}
	public void getMST(int verticesIndex) {
		int numberOfVertices = vertices.size();
		int[] parent = new int[numberOfVertices];
		for(int i = 0; i < numberOfVertices; i++)
			parent[i] = -1;
		List<Integer> T = new ArrayList<Integer>();
		T.add(verticesIndex);
		int totalWeight = 0;
		List<PriorityQueue<WeightedEdge1>> queues = deepClone(this.queues);
		while(T.size() < numberOfVertices) {
			double minWeight = Double.MAX_VALUE;
			int v = -1;
			for(int u : T){
				while(!queues.get(u).isEmpty() &&
						T.contains(queues.get(u).peek().v))
					queues.get(u).remove();
				if(queues.get(u).isEmpty())
					continue;
				WeightedEdge1 edge = queues.get(u).peek();
				
				if(edge.w < minWeight) {
					v = edge.v; 
					minWeight = edge.w;
					parent[v] = u;
					
				}
			}
			
			totalWeight += minWeight;
			T.add(v);
			
		}
		System.out.println("The start index is:" +
				vertices.get(verticesIndex));
		System.out.println("The total weight is:" +
				totalWeight);
		System.out.println("The MST is:");
		for(int i = 0; i < parent.length; i++ ){
			if(parent[i] != -1){
				System.out.print("(" + vertices.get(parent[i])
				+ ", " + vertices.get(i) + ") ");
			}
		}
		System.out.println();
		
	}
	private List<PriorityQueue<WeightedEdge1>> deepClone(
			List<PriorityQueue<WeightedEdge1>> queues){
		List<PriorityQueue<WeightedEdge1>> copiedQueue = 
				new ArrayList<PriorityQueue<WeightedEdge1>>();
		for(int i = 0; i < queues.size(); i++){
			copiedQueue.add(new PriorityQueue<WeightedEdge1>());
			for(WeightedEdge1 e: queues.get(i))
				copiedQueue.get(i).offer(e);
		}
		return copiedQueue;
	}
	public void getShortestPath(int startIndex) {
		List<Integer> T = new ArrayList<Integer>(); 
		int numberOfVertices = vertices.size();
		int[] parent = new int[numberOfVertices];
		int[] costs = new int[numberOfVertices];
		parent[startIndex] = -1;
		costs[startIndex] = 0;
		T.add(startIndex);
		List<PriorityQueue<WeightedEdge1>> queues =
				deepClone(this.queues);
		while(T.size() < numberOfVertices) {
			int smallestCost = Integer.MAX_VALUE;
			int v = -1;
			for(int u: T) {
				while(!queues.get(u).isEmpty() && 
						T.contains(queues.get(u).peek().v)) {
					queues.get(u).remove();
				}
				if(queues.get(u).isEmpty())
					continue;
				WeightedEdge1 edge = queues.get(u).peek();
				if(costs[u] + edge.w < smallestCost) {
					v = edge.v;
					smallestCost = costs[u] + edge.w;
					parent[v] = u;
				}
			}
			T.add(v);
			costs[v] = smallestCost;
		}
		System.out.println();
		int index = startIndex;
		
		for(int i = 0; i < numberOfVertices; i++){
			List<T> path = new ArrayList<T>();
			index = i;
			while(index != -1) {
				path.add(vertices.get(index));
				index = parent[index];
				
			}
			System.out.print("Path from " + path.get(path.size() - 1) +
					" to " + path.get(0) + " is:");
			for(int j = path.size() - 1; j >= 0; j--)
				System.out.print(path.get(j) + " ");
			System.out.println();
		}

	}
	
	public static class WeightedEdge1 implements Comparable<WeightedEdge1>{
		int u;
		int v;
		int w;
		public  WeightedEdge1(int u, int v, int w){
			this.u = u;
			this.v = v;
			this.w = w;
		}
		public int compareTo(WeightedEdge1 o){
			
			return w - o.w;
		}
	}
	
	
}

