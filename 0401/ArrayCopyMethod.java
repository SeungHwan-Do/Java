import java.util.Arrays;

public class ArrayCopyMethod {

	public static void main(String[] args) {
		int[] att = new int[5];
		int[] report = new int[5];
		
		Arrays.fill(att,  10);
		System.arraycopy(att, 0, report, 0, att.length);
		System.out.print("출석 :");
		for(int i = 0; i<att.length; i++)
			System.out.print(att[1]+" ");
		System.out.print("\n과제: ");
		
		for(int i = 0;i < report.length;i++)
			System.out.print(report[i]+" ");
	}

}
