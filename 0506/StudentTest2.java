package asd;
class People2{
	protected String name;
	protected int RRN;
	public People2(String name, int RRN) {
		this.name = name;
		this.RRN = RRN;
	}
	public void PeopleInfo() {
		System.out.println("이름은 "+name+"이고 주민번호는 " +RRN);
	}
}
class Student2 extends People2{
	private int Sno;
	public Student2(String name, int rrn, int Sno) {
		super(name, rrn);	this.Sno = Sno;
	}
	public void StudentInfo() {
		System.out.println("학번은 "+Sno);
	}
}
public class StudentTest2 {

	public static void main(String[] args) {
		Student2 s = new Student2("홍길동", 991225, 2019001);
		s.PeopleInfo();
		s.StudentInfo();
	}

}
