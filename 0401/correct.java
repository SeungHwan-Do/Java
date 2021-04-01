import java.util.ArrayList;
public class correct {
	public static void main(String[] args) {
		ArrayList<Integer> age = new ArrayList<>();
		age.add(20);
		age.add(25);
		age.add(19);
		for(int i =0; i<age.size(); i++)
			System.out.print(age.get(i)+"\t");
	}
}
