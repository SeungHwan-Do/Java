class Circle1{
	int radius;
	String color;
	void setRadius(int r) {radius = r;}
	
	double calcArea(){
		return 3.14*radius*radius;}
	void print() {
		System.out.println("원의 반지름: "+radius);
		System.out.println("원의 면적: "+calcArea());
		}
	}
	

public class Circle {

	public static void main(String[] args) {
		Circle1 obj;
		obj = new Circle1();
		obj.setRadius(100);
		obj.print();
		
		Circle1 obj2 = new Circle1();
		obj2.setRadius(20);
		obj2.print();
	}

}
