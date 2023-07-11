
abstract class Shape{
	
	public abstract double calculateArea();
	
}
class Rectangle extends Shape{
	
	private long length;
	private long width;
	
	public Rectangle(long width, long length) {
		this.length = length;
		this.width = width;
	}
	
	@Override
	public double calculateArea() {
		return width * length;
	}
}
class Circle extends Shape{
	
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double calculateArea() {
		return 3.14 * radius * radius;
	}
}
class Triangle extends Shape{
	
	private long base;
	private long height;
	
	public Triangle(long base, long height) {
		this.base = base;
		this.height = height;
	}
	
	@Override
	public double calculateArea() {
		return 1/2 * base * height;
	}
}
class ShapeCalculator{
	
	public void printArea(Shape shape) {
		System.out.println("The area of the "+shape.getClass().getName()+" is " +shape.calculateArea());
	}
}

public class Problem2 {
	public static void main(String[] args) {
		
		Shape rectangle = new Rectangle(2,4);
		Shape circle = new Circle(12.8);
		Shape triangle = new Triangle(4,6);
		
		ShapeCalculator calculateArea = new ShapeCalculator();
		calculateArea.printArea(rectangle);
		calculateArea.printArea(circle);
		calculateArea.printArea(triangle);
	}
}
