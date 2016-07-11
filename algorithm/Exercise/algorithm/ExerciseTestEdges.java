package algorithm;

public class ExerciseTestEdges {
	public static void main(String[] args) {
		int[][] edges = {
				{0, 1}, {0, 3}, {0, 5, 7},
				{1, 0}, {1, 2}, {1, 3}, 
				{2, 1}, {2, 3}, {2, 4}, {2, 10},
				{3, 0}, {3, 1}, {3, 2}, {3, 4}, {3, 5},
				{4, 2}, {4, 3}, {4, 5}, {4, 7}, {4, 8}, {4, 10},
				{5, 0}, {5, 3}, {5, 4}, {5, 6}, {5, 7},
				{6, 5}, {6, 7},
				{7, 4}, {7, 5}, {7, 6}, {7, 8},
				{8, 4}, {8, 7}, {8, 9}, {8, 10}, {8, 11},
				{9, 8}, {9, 11},
				{10, 2}, {10, 4}, {10, 8}, {10, 11},
				{11, 8}, {11, 9}, {11, 10}
		};
		System.out.println("The length of edges is:" + edges.length);
		int last = -1;
		for (int i = 0; i < edges.length; i++){
			int u = edges[i][0];
			int v = edges[i][1];
			if(u != last){
				System.out.println();
				last = u;
			}
			System.out.print("{" + u + "," + v + "}" + " ");
		}
			
	}
}
