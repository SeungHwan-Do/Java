class Student{
	String name;
	int rollno;
	int age;
	public Student(String n, int a, int b) {name = n ; rollno = a; age = b;}
	}
public class PE1 {
	public static void main (String[] args) {
		Student Std1 = new Student("Kim", 20180001, 20);
		System.out.println("�л��� �̸�:"+Std1.name);
		System.out.println("�л��� �й�:"+Std1.rollno);
		System.out.println("�л��� ����:"+Std1.age);
	}
}
