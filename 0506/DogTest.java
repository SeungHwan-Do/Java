package asd;
class Animal{
	public void eat() {
		System.out.println("������ �԰� �ֽ��ϴ�.");
	}
}
class Dog extends Animal{
	public void eat() {
		super.eat();
		System.out.println("�������� �԰� �ֽ��ϴ�.");
	}
}
public class DogTest {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.eat();
	}
}
