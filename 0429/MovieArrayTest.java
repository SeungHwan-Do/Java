import java.util.Scanner;
class Movie{
	String title, director;
	public Movie(String title, String director) {
		this.title = title;
		this.director = director;
	}
}
public class MovieArrayTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("��ȭ��ǰ��: ");
		Movie [] list = new Movie[sc.nextInt()];
		sc.nextLine();
		
		for(int i = 0;i<list.length;i++) {
			System.out.print("��ȭ���� : ");
			String title = sc.nextLine();
			System.out.print("��ȭ����: ");
			String director = sc.nextLine();
			list[i] = new Movie(title,director);
		}
		for(int i = 0 ;i<list.length;i++) {
			System.out.print("{"+list[i].title+", "+list[i].director+"}");
		}
		sc.close();
	}

}
