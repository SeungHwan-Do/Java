package asd;
class People2{
	protected String name;
	protected int RRN;
	public People2(String name, int RRN) {
		this.name = name;
		this.RRN = RRN;
	}
	public void PeopleInfo() {
		System.out.println("�̸��� "+name+"�̰� �ֹι�ȣ�� " +RRN);
	}
}
class Student2 extends People2{
	private int Sno;
	public Student2(String name, int rrn, int Sno) {
		super(name, rrn);	this.Sno = Sno;
	}
	public void StudentInfo() {
		System.out.println("�й��� "+Sno);
	}
}
public class StudentTest2 {

	public static void main(String[] args) {
		Student2 s = new Student2("ȫ�浿", 991225, 2019001);
		s.PeopleInfo();
		s.StudentInfo();
	}

}
