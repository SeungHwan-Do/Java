class Pizza2{
	int radius;
	Pizza2(int r){	radius = r;}
	Pizza2 whosLargest(Pizza2 p2) {
		if(radius > p2.radius)
			return this;
		else
			return p2;
	}
}
public class PizzaTest3 {

	public static void main(String[] args) {
		Pizza2 obj1 = new Pizza2(14);
		Pizza2 obj2 = new Pizza2(18);
		
		Pizza2 largest = obj1.whosLargest(obj2);
		System.out.println(largest.radius+"인치 피자가 더 큼.");

	}

}
