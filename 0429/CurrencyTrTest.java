import java.util.Scanner;
class CurrencyTr{
	private static double rate;
	public static double toDollar(double won) {
		return won/rate;
	}
	public static double toKWR(double dollar) {
		return dollar * rate;
	}
	public static void setRate(double r) {rate = r; }
	
}
public class CurrencyTrTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ȯ��(1�޷�) : ");
		double rate = sc.nextDouble();
		CurrencyTr.setRate(rate);
		System.out.printf("�鸸���� $%.2f�Դϴ�\n", CurrencyTr.toDollar(1000000));
		System.out.printf("$100�� %.2f���Դϴ�.\n",CurrencyTr.toKWR(100));
		sc.close();
	}

}
