package asd;
class People{
	public String name;
	protected int RRN;
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public int getRRN() {
		return RRN;
	}
}
class Student extends People{
	private int Sno;
	public void setSnoRRN(int Sno, int rrn) {
		this.Sno = Sno;
		RRN=rrn;
	}
	public int getSno() {
		return Sno;
	}
}
public class StudentTest {

	public static void main(String[] args) {
		Student s = new Student();
		s.setName("홍길동");
		System.out.println("이름은 "+s.getName());
		s.setSnoRRN(2019001, 991225);
		System.out.println("학번은 "+s.getSno());
		System.out.println("주민번호는 "+s.getRRN());

	}

}
