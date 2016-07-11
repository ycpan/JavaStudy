package algorithm;

public interface Graph<V> {
	public int getSize();
	public java.util.List<V> getVertices();
	public int getIndex(V v);
	public java.util.List<Integer> getNeighbors(int index);
	public int getDegree(int v);
	public int[][] getAdjacencyMatrix();
	public  void printAdjacencyMatrix();
	public void printEdges();
	public V getVertex(int index);
	public AbstractGraph<V>.Tree dfs(int v);
	public AbstractGraph<V>.Tree bfs(int v);
	
}
