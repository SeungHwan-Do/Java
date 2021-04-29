import java.util.Scanner;
public class ArrayEx4 {

	public static void main(String[] args) {
		int cnt = 5, total = 0;
		Scanner scan = new Scanner(System.in);
		int[] scores = new int[cnt];
		for(int i = 0 ; i<cnt; i++) {
			System.out.print("성적을 입력하시오:");
			scores[i] = scan.nextInt();
		}
		for (int i =0; i<cnt;i++)
			total +=scores[i];
		System.out.println("평균 성적은"+total / cnt +"입니다");

	}

}
