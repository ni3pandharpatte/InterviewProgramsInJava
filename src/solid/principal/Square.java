package solid.principal;

public class Square extends Shape {
	float side;
	public Square(float side) {
		this.side = side;
		this.area = side * side;
	}
}
