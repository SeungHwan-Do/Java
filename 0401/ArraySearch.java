import java.util.Arrays;
public class ArraySearch {

	public static void main(String[] args) {
		int[] java_score = {90,80, 100, 70, 95};
		int idx;
		
		Arrays.sort(java_score);
		System.out.println(Arrays.toString(java_score));
		idx = Arrays.binarySearch(java_score,100);
		System.out.println("100¿« ¿Œµ¶Ω∫ = "+idx);
		idx = Arrays.binarySearch(java_score, 101);
		System.out.println("85¿« ¿Œµ¶Ω∫ ="+idx);

	}

}
