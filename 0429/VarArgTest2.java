class VarArg2{
	void print(int a, String...arg) {
		//�������� �μ��� �Ű����� �������� ��ġ
		System.out.print(a+"�г�,");
		for(String num : arg)
			System.out.print(num+ ",");
		
		System.out.println();
	}
}
public class VarArgTest2 {

	public static void main(String[] args) {
		VarArg2 c = new VarArg2();
		c.print(3,  "ȫ�浿");
		c.print(4, "�̸���","���ڰ��к�","�ΰ�����");
		c.print(1, "BTSS","��ǻ�Ͱ��к�");
		

	}

}
