
public class methodTest1 {

	public static void main(String[] args) {
		int x = 10,result;
		result = inc(x);
		System.out.printf(", result="+result);

	}
	public static int inc(int a) {
		a +=1;
		System.out.printf("a="+a);
		return a;
	}
}
