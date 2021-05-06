package asd;
class Car{
	int speed;
	public void setSpeed(int speed) {
		this.speed = speed;
	}
}
class SportsCar extends Car{
	boolean turbo;
	
	public void setTurbo(boolean flag) {
		turbo = flag;
	}
}
public class sportsCarTest {

	public static void main(String[] args) {
		SportsCar obj = new SportsCar();
		obj.speed = 10;
		obj.setSpeed(60);
		obj.setTurbo(true);

	}

}
