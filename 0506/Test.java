package asd;
class Shape1{
	protected int x, y;
	void print(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
class Rectangle extends Shape1{
	int width, height;
	double calcArea(int w, int h) {
		width = w;height = h;
		System.out.println("가로:"+width+" 세로:"+height);
		return width*height;
	}
	void draw(int xx,int yy) {
		print(xx,yy);
		System.out.println("("+x+","+y+") 위치에");
	}
}
public class Test {

	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.draw(3, 5);
		System.out.print("면적:"+r.calcArea(2,6));

	}

}
