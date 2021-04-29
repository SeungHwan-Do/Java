
public class MathTest {

	public static void main(String[] args) {
		System.out.printf("원주율 : %.2f\n",Math.PI);
		System.out.printf("반지름 3인 원의 넓이는 %.2f\n",Math.PI*3*3);
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.out.printf("2의 제곱근 : %.2f\n",Math.sqrt(2));
		int a=1, b=4, c=3;
		System.out.printf("이차 방정식 판별식 %.2f\n",Math.sqrt(b*b-4*a*c));
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		double radian30 = Math.toRadians(30);
		System.out.printf("싸인 30: %.2f \n", Math.sin(radian30));
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.out.printf("3의 5승: %.2f\n,",Math.pow(3, 5));
		System.out.printf("이차 방정식 판별식 %.2f \n",Math.sqrt(Math.pow(b, 2)-4*a*c));

	}

}
