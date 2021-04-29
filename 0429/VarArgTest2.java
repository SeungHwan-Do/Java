class VarArg2{
	void print(int a, String...arg) {
		//가변길이 인수는 매개변수 마지막에 배치
		System.out.print(a+"학년,");
		for(String num : arg)
			System.out.print(num+ ",");
		
		System.out.println();
	}
}
public class VarArgTest2 {

	public static void main(String[] args) {
		VarArg2 c = new VarArg2();
		c.print(3,  "홍길동");
		c.print(4, "이몽룡","전자공학부","인공지능");
		c.print(1, "BTSS","컴퓨터공학부");
		

	}

}
