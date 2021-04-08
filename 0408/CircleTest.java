class Circle2{
	int radius;
	
	public Circle2(int radius) {
		this.radius = radius;
		//  인스턴스 변수와 매개변수가 동일할 경우 변수 구별을 위해 this 사용
	}
	double calcArea() {
		return 3.14*radius*radius;
	}
}
public class CircleTest {

	public static void main(String[] args) {
		Circle2 c = new Circle2(5);
		System.out.printf("원의 면적은"+ c.calcArea());

	}

}
