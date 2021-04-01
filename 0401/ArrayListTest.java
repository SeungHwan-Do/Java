import java.util.ArrayList;
public class ArrayListTest {
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		list.add("Ã¶¼ö");
		list.add("¿µÈñ");
		list.add("¼ø½Å");
		list.add("ÀÚ¿µ");
		
		for(String obj : list)
			System.out.print(obj+" ");
	}
}
