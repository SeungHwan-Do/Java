
public class MathTest {

	public static void main(String[] args) {
		System.out.printf("������ : %.2f\n",Math.PI);
		System.out.printf("������ 3�� ���� ���̴� %.2f\n",Math.PI*3*3);
		System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
		System.out.printf("2�� ������ : %.2f\n",Math.sqrt(2));
		int a=1, b=4, c=3;
		System.out.printf("���� ������ �Ǻ��� %.2f\n",Math.sqrt(b*b-4*a*c));
		System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
		double radian30 = Math.toRadians(30);
		System.out.printf("���� 30: %.2f \n", Math.sin(radian30));
		System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
		System.out.printf("3�� 5��: %.2f\n,",Math.pow(3, 5));
		System.out.printf("���� ������ �Ǻ��� %.2f \n",Math.sqrt(Math.pow(b, 2)-4*a*c));

	}

}
