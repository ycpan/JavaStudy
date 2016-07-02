package algorithm;
import java.util.Comparator;

public class ExerciseComparator implements 
	Comparator<GeometricObject>, java.io.Serializable {
	private static final long serialVersionUID = 1L;

	public int compare(GeometricObject o1,GeometricObject o2) {
		if(o1.getArea() > o2.getArea())
			return 1;
		if(o1.getArea() == o2.getArea())
			return 0;
		else
			return -1;
	}
}
