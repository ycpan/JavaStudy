package algorithm;

public class CastingDemo {
	public static void main(String[] args) {
		Object object1 = new Circle(1);
		Object object2 = new Rectangle(1,2);
		displayObject(object1);
		displayObject(object2);
	}
	public static void displayObject(Object object) {//这样的好处是
		//能够进行通用的程序设计
		if(object instanceof Circle){
			System.out.println("the circle area is:" + 
					((Circle)object).getArea());
			System.out.println("the circle diameter is:" + 
					((Circle)object).getDiameter());
		}
		else if(object instanceof Rectangle){
			System.out.println("the rectangle area is:" + 
					((Rectangle)object).getArea());
		}
	}
}
