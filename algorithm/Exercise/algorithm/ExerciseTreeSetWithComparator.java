package algorithm;
import java.util.*;

public class ExerciseTreeSetWithComparator {
	public static void main(String[] args) {
		Set<GeometricObject> set = 
			new TreeSet<GeometricObject>(new ExerciseComparator());
		set.add(new Rectangle(4,5));
		set.add(new Circle(40));
		set.add(new Circle(40));
		set.add(new Rectangle(4,1));
		set.add(new Rectangle(4,2));
		for(GeometricObject e: set)
			System.out.println(e.getArea());
		
	}
}
