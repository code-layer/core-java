
public class Circle {
	private double radius;
	
	public void setRadius(double rad) {
		radius = rad;
	}
	
	public double circumference() {
		return 2 * 3.14 * radius;
	}
	
	public double area( ) {
		return 3.14 * radius * radius;
	}
	
	public static void main(String[] args) {
		Circle c1 = new Circle();
		c1.setRadius(3.0);
		System.out.println("Circumference of a circle with Radius 3.0 is: " + c1.circumference());
		System.out.println(" Area of a circle with Radius 3.0 is : "  + c1.area());
	}

}