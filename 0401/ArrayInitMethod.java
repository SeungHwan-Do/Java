import java.util.Arrays;

public class ArrayInitMethod {

	public static void main(String[] args) {
		
		double[] mats = new double[10];
		
		Arrays.fill(mats,  90);
		
		for(int i = 0; i <mats.length; i++) {
			if(i !=0 && i%5==0)
				System.out.println();
			System.out.print(mats[i]+" ");
		}
		System.out.println();
	}

}
