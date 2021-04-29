class Rect{
	int width, height;
	public Rect(int w, int h) {
		width = w; height = h;
	}
	double calcArea() {return (double)width*height;}
}
public class RectTest {

	public static void main(String[] args) {
		Rect[] sq = new Rect[5];
		
		for(int i=0; i < sq.length;i++)
			sq[i] = new Rect(i,i);
		
		for(int i = 0; i <sq.length;i++)
			System.out.println((i+1)+"번째 사각형의 면적="+sq[i].calcArea());

	}

}
