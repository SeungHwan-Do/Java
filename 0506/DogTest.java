package asd;
class Animal{
	public void eat() {
		System.out.println("동물이 먹고 있습니다.");
	}
}
class Dog extends Animal{
	public void eat() {
		super.eat();
		System.out.println("강아지가 먹고 있습니다.");
	}
}
public class DogTest {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.eat();
	}
}
