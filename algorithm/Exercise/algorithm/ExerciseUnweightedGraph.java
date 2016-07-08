package algorithm;
import java.util.*;

public class ExerciseUnweightedGraph<V> extends ExerciseAbstractGraph<V> {
	public ExerciseUnweightedGraph(int[][] edges, V[] vertices) {
		super(edges, vertices);
	}
	public ExerciseUnweightedGraph(List<Edge> edges, List<V> vertices) {
		super(edges, vertices);
	}
	public ExerciseUnweightedGraph(List<Edge> edges, int numberOfVertices) {
		super(edges, numberOfVertices);
	}
	public ExerciseUnweightedGraph(int[][] edges, int numberOfVertices) {
		super(edges, numberOfVertices);
	}
}
