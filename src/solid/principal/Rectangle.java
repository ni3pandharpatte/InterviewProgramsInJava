package solid.principal;

public class Rectangle extends Shape {
	float len;
	float height;
	public Rectangle(float len, float height) {
		this.len = len;
		this.height = height;
		this.area = len * height;
	}
}
