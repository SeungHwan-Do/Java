class Circle2{
	class Point{
		int x, y ;
		public Point(int x, int y) {this.x = x;this.y = y;}
	}
	int radius;
	Point center;
	
	public Circle2(int radius, int x, int y) {
		this.radius = radius;
		this.center = new Point(x, y);
	}
	double calcArea() {return 3.14*radius*radius;}
}
public class InnerTest2 {

	public static void main(String[] args) {
		Circle2 obj = new Circle2(10,0,0);
		System.out.println("원의 면적="+obj.calcArea());
		System.out.println("원의중심("+obj.center.x+","+obj.center.y+")");
		

	}

}
