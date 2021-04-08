class MyMath{
	int square(int i) {return i*i;}
	
	double square(double i) {return i*i;}
}
public class MyMathTest {

	public static void main(String[] args) {
		MyMath obj = new MyMath();
		System.out.println("정사각형의 넓이는"+obj.square(10));
		System.out.println("정사각형의 넓이는"+obj.square(3.14));
	}

}
