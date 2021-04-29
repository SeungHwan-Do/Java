
public class methodTest2 {

	public static void main(String[] args) {
		System.out.printf("1에서 10까지의 합은"+inc());
		
	}
	public static int inc() {
		int n = 10, tot = 0;
		for(int i = 1; i<=n; i++)
			tot += i;
		return tot;
		}
	}

