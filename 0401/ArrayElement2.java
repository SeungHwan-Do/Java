
public class ArrayElement2 {

	public static void main(String[] args) {
		int[][] scores = { {100, 90, 80}, {98, 76, 90} };
		
		for(int[] is : scores) {
			for(int i : is) {
				System.out.print(i+",\t");
			}
			System.out.println();
		}

	}

}
