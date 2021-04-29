class VarArg{
	void print(int...v) {
		System.out.print("인수의 개수: "+v.length+"개, ");
		System.out.print("값들: ");
		for ( int x : v)
			System.out.print(x+" ");
		
		System.out.println();
	}
}
public class VarArgTest {

	public static void main(String[] args) {
		VarArg c = new VarArg();
		c.print(3,7);
		c.print(9, 5, 4 , 7 ,6);
		c.print();
		

	}

}
