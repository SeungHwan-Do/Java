import java.util.Arrays;
public class ArraySort {

	public static void main(String[] args) {
		
		int[] mat = {1010, 100, 95, 70, 86, 90};
		
		Arrays.sort(mat, 1, 3); // 오름차순으로 sort
		System.out.println(Arrays.toString(mat));

	}

}
