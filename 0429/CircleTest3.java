class Circle{
	static final double PI = 3.1415;
	private double radius;
	
	Circle(double rad){radius = rad;}
	void showPerimeter() {
		double peri = (radius*2 )*PI;
		System.out.printf("µ—∑π: %.2f", peri);
	}
	void showArea() {
		double area = (radius * radius)*PI;
		System.out.printf("≥–¿Ã: %.2f",  area);
	}
}
public class CircleTest3 {
	public static void main(String[] args) {
		Circle c1 = new Circle(3);
		c1.showPerimeter();
		c1.showArea();
		System.out.println();
		Circle c2 = new Circle(5);
		c2.showPerimeter();
		c2.showArea();

	}

}
