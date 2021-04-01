import java.util.Arrays;
import java.util.Collections;

public class ArrayRSort {
	public static void main(String[] args) {
		
		Integer[] java_s = { 90, 80, 100, 70, 85};
		
		Arrays.sort(java_s, Collections.reverseOrder());
		
		for( int i=0; i<java_s.length; i++)
			System.out.print(java_s[i]+" ");

	}

}
