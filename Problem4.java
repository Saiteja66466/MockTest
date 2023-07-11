
interface Drawable{
	void draw();
}
class Circle implements Drawable{
	
	@Override
	public void draw() {
		System.out.println("Circle method implementation");
	}
}
class Rectangle implements Drawable{
	
	@Override
	public void draw() {
		System.out.println("Rectangle method implementation");
	}
}
public class Problem4 {
	public static void main(String[] args) {
		
		Drawable circle = new Circle();
		Drawable rectangle = new Rectangle();
		
		circle.draw();
		rectangle.draw();
	}
}
