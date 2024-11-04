package p2;

public class Triangle extends Shape{
	
	private double base;
	private double height;
	
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
		
	}

	@Override
	public double area() {
		
		return 0.5 * base * height;
	}
	
	public static void main(String[] args) {
		Circle circle = new Circle(5);
		System.out.println("Circle Area:" + circle.area());
		
		
		Rectangle rectangle = new Rectangle(5, 6);
		System.out.println("Rectangle Area:" + rectangle.area());
		
		
		Triangle triangle = new Triangle(5, 5);
		System.out.println("Triangle Area:" + triangle.area());
	}

}
