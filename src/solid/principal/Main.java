package solid.principal;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(5, 10);
		Square square = new Square(3);
		
		displayArea(rectangle);
		displayArea(square);
		
		List<Shape> list = new ArrayList<>();
		list.add(square);
		list.add(rectangle);
		
		printTotal(list);
	}
	public static void displayArea(Shape shape) {
		System.out.println(shape.getArea());
	}
	public static void printTotal(List<Shape> list) {
		float total = 0;
		for(Shape s: list) {
			total = total + s.getArea();
		}
		System.out.println(total);
	}
}
