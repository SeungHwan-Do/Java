class Circle3{
	int radius;
	
	public Circle3(int radius) {
		this.radius = radius;
	}
	
	public Circle3() {this(3);}
	double calcArea() {
		return 3.14*radius*radius;
	}
}
public class CircleTest2 {
	public static void main(String[] args) {
		Circle3 cc = new Circle3();
		System.out.printf("żřŔÇ ¸éŔűŔş %.2f", cc.calcArea());
	}
}
