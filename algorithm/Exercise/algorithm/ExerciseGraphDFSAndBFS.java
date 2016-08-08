package algorithm;
import java.util.*;

public class ExerciseGraphDFSAndBFS<T> {
	private List<T> vertices;
	private List<ArrayList<Edge>> neighbors;
	public ExerciseGraphDFSAndBFS(int[][] edges, T[] vertices ) {
		this.vertices = new ArrayList<T>();
		neighbors = new ArrayList<ArrayList<Edge>>();
		int numberOfVertices = vertices.length;
		for(int i = 0; i < numberOfVertices; i++)
			this.vertices.add(vertices[i]);
		for(int i = 0; i < numberOfVertices; i++)
			neighbors.add(new ArrayList<Edge>());
		for(int i = 0; i < edges.length; i++) {
			int u = edges[i][0];
			int v = edges[i][1];
			neighbors.get(u).add(new Edge(u, v));
			
		}
	}
	public void getGraphDFS(int v) {
		int numberOfVertices = vertices.size();
		boolean[] isVisited = new boolean[numberOfVertices];
		List<T> searchOrders = new ArrayList<T>();
		
		
		getGraphDFS(v, isVisited, searchOrders);
		System.out.println(searchOrders);
	}
	private void getGraphDFS(int v, boolean[] isVisited,
		List<T> searchOrders) {
		searchOrders.add(vertices.get(v));
		isVisited[v] = true;
			
		for(Edge u: neighbors.get(v)) {
			if(!isVisited[u.v]) {
				getGraphDFS(u.v, isVisited,
						searchOrders);
			}
		}
		
	}
	public void getGraphBFS(int v) {
		List<T> searchOrders = new ArrayList<T>();
		boolean[] isVisited = new boolean[vertices.size()];
		Queue<Integer> queue = new LinkedList<Integer>();
		isVisited[v] = true;
		queue.offer(v);
		while(!queue.isEmpty()) {
			int u = queue.poll();
			searchOrders.add(vertices.get(u));
			
			for(Edge e : neighbors.get(u)) {
				if(!isVisited[e.v]) {
					queue.offer(e.v);
					isVisited[e.v] = true;
					
				}
			}
		}
		System.out.println(searchOrders);
	}
	class Edge {
		private int u;
		private int v;
		public Edge(int u, int v){
			this.u = u;
			this.v = v;
		}
	}
}
