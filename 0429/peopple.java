class Pizza{
	private String toppings;
	static int count = 0;
	
	public Pizza(String toppings) {
		this.toppings = toppings;
		count++;
	}
}
public class peopple {
	public static void main(String Args[]) {
		Pizza p1 = new Pizza("Super Supreme");
		Pizza p2 = new Pizza("Cheese");
		System.out.println(Pizza.count);
	}
}
