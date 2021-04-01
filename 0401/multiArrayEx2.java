
public class multiArrayEx2 {

	public static void main(String[] args) {
		int[][] num = { {90}, {80, 70}, {100, 60, 85} };
		
		for(int i = 0; i < num.length; i++) {
			for(int j=0; j<num[i].length; j++) {
				System.out.print(num[i][j]+ "\t");
			}
			System.out.println();
		}

	}

}
