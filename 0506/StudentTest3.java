package asd;
class People3{
	protected String name;
	protected int RRN;
	public People3(String name, int RRN) {
		this.name = name;
		this.RRN = RRN;
	}
	public void PeopleInfo() {
		System.out.println("이름은 "+name+"이고 주민번호는 " +RRN);
	}
}
class Student3 extends People3{
	private int Sno;
	public Student3(String name, int rrn, int Sno) {
		super(name, rrn);	this.Sno = Sno;
	}
	public void StudentInfo() {
		System.out.println("학번은 "+Sno);
	}
}
public class StudentTest3 {

	public static void main(String[] args) {
		People3 p = new People3("홍길동", 991225);
		p.PeopleInfo();
//		p.StudentInfo(); //오류
		
	}

}
