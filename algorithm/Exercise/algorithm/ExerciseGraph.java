package algorithm;

public interface ExerciseGraph<V> {
	public int getSize();
	public java.util.List<V> getVertices();
	public V getVertex(int index);
	public int getIndex(V v);
	public java.util.List<Integer> getNeighbors(int index);
	public int getDegree(int v);
	public int[][] getAdjacencyMatrix();
	public  void printAdjacencyMatrix();
	public void printEdges();
	public ExerciseAbstractGraph<V>.Tree dfs(int v);
	public ExerciseAbstractGraph<V>.Tree bfs(int v);
}
