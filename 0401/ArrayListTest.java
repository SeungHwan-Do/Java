import java.util.ArrayList;
public class ArrayListTest {
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		list.add("ö��");
		list.add("����");
		list.add("����");
		list.add("�ڿ�");
		
		for(String obj : list)
			System.out.print(obj+" ");
	}
}
