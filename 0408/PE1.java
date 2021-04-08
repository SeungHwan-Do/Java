class Student{
	String name;
	int rollno;
	int age;
	public Student(String n, int a, int b) {name = n ; rollno = a; age = b;}
	}
public class PE1 {
	public static void main (String[] args) {
		Student Std1 = new Student("Kim", 20180001, 20);
		System.out.println("학생의 이름:"+Std1.name);
		System.out.println("학생의 학번:"+Std1.rollno);
		System.out.println("학생의 나이:"+Std1.age);
	}
}
