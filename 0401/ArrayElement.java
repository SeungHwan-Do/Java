import java.util.Arrays;
public class ArrayElement {

	public static void main(String[] args) {
		
		int[] mat = {90, 80, 70, 60, 100};
		int i = 0;
		
		for( int m : mat) {
			System.out.println("mat["+ (i++)+"]="+m);
			
		}
		System.out.println(Arrays.toString(mat));
	}

}
