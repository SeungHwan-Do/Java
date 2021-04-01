import java.util.ArrayList;
public class ArrayListTest3 {

	public static void main(String[] args) {
		ArrayList<String> subject = new ArrayList<>();
		
		subject.add("JAVA");
		subject.add("C");
		subject.add("C++");
		subject.add("English");
		
		for(int i = 0; i<subject.size(); i++)
			System.out.print(subject.get(i)+'\t');
		System.out.println();
		
		subject.remove(2);
		
		for(int i =0; i < subject.size(); i++)
			System.out.print(subject.get(i)+'\t');
		System.out.println();

	}

}
