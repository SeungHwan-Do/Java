package asd;
class Shape3{
	public Shape3(String msg) {
		System.out.println("Shape ������() "+msg);
	}
}
class Rectangle2 extends Shape3{
	public Rectangle2() {
		super("from Rectangle");
		System.out.println("Rectangle ������()");
	}
}
public class ShapeTest2 {

	public static void main(String[] args) {
		Rectangle2 r = new Rectangle2();

	}

}
