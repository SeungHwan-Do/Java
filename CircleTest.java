class Circle2{
	int radius;
	
	public Circle2(int radius) {
		this.radius = radius;
		//  �ν��Ͻ� ������ �Ű������� ������ ��� ���� ������ ���� this ���
	}
	double calcArea() {
		return 3.14*radius*radius;
	}
}
public class CircleTest {

	public static void main(String[] args) {
		Circle2 c = new Circle2(5);
		System.out.printf("���� ������"+ c.calcArea());

	}

}
