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
		System.out.print("환율(1달러) : ");
		double rate = sc.nextDouble();
		CurrencyTr.setRate(rate);
		System.out.printf("백만원은 $%.2f입니다\n", CurrencyTr.toDollar(1000000));
		System.out.printf("$100는 %.2f원입니다.\n",CurrencyTr.toKWR(100));
		sc.close();
	}

}
