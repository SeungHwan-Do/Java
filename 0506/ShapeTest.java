package asd;
class Shape2{
	protected double area;
	
	public void printArea() {
		System.out.println("도형의 넓이는"+area+"입니다.");
	}
}
class Rect extends Shape2{
	public void calcRectangle(double w, double h) {
		area = w*h;
	}
}
class Triangle extends Shape2{
	public void calcTriangle(double w, double h) {
		area = w*h/2.0;
	}
}
public class ShapeTest {

	public static void main(String[] args) {
		int w = 5, h = 10;
		
		Rect rec = new Rect();
		rec.calcRectangle(w, h);
		rec.printArea();
		
		Triangle tri = new Triangle();
		tri.calcTriangle(w, h);
		tri.printArea();

	}

}
