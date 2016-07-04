package algorithm;

public class PolymorphismDemo {
	public static void main(String[] args) {
		displayObject(new Circle(1,"red",false));
		displayObject(new Rectangle(1,1,"red",false));
	}
	public static void displayObject(GeometricObject object) {
		System.out.println("created on " + object.getCreatedDate() +
				".Color is " + object.getColor());
	}
}
