package asd;
class People4{
	protected String name;
	protected int RRN;
	public People4() {
		name = "홍길동";
		RRN = 1999;
	}
	public void PeopleInfo() {
		System.out.println("이름은 "+name+"이고 주민번호는 " +RRN);
	}
}
class Student4 extends People4{
	private int Sno;
	public Student4() {
		Sno = 2019;
	}
	public void StudentInfo() {
		System.out.println("학번은 "+Sno);
	}
}
public class StudentTest4 {

	public static void main(String[] args) {
		People4 p = new Student4();
		if(p instanceof Student4)
			System.out.println("Student 타입");
		else
			System.out.println("People 타입");
	}

}
