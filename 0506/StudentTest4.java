package asd;
class People4{
	protected String name;
	protected int RRN;
	public People4() {
		name = "ȫ�浿";
		RRN = 1999;
	}
	public void PeopleInfo() {
		System.out.println("�̸��� "+name+"�̰� �ֹι�ȣ�� " +RRN);
	}
}
class Student4 extends People4{
	private int Sno;
	public Student4() {
		Sno = 2019;
	}
	public void StudentInfo() {
		System.out.println("�й��� "+Sno);
	}
}
public class StudentTest4 {

	public static void main(String[] args) {
		People4 p = new Student4();
		if(p instanceof Student4)
			System.out.println("Student Ÿ��");
		else
			System.out.println("People Ÿ��");
	}

}
