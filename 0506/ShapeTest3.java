package asd;

class Shape4{
	protected double area;
	public void calcArea(double w, double h) {area = 0;}
	
	public void printArea(Shape4 obj) {
		if(obj instanceof Rect2)
			System.out.println("�簢���� ���̴�"+area+"�Դϴ�.");
		else
			System.out.println("�ﰢ���� ���̴�"+area+"�Դϴ�.");
	}
}
class Rect2 extends Shape4{
	public void calcArea(double w, double h) {
		area = w*h;
	}
}
class Triangle2 extends Shape4{
	public void calcArea(double w, double h) {
		area = w*h/2.0;
	}
}
public class ShapeTest3 {

	public static void main(String[] args) {
		int w=5, h =10;
		
		Shape4 s = new Rect2();
		s.calcArea(w, h);
		s.printArea(s);
		
		s = new Triangle2();
		s.calcArea(w,h);
		s.printArea(s);

	}

}
