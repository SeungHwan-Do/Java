class Tv{
	private int channel, volume;
	private boolean onOff;
	
	Tv(int c, int v, boolean o){
		channel = c; volume = v; onOff = o;}

	void print() {
		System.out.println("ä��"+channel+"�̰� ����"+volume+"�Դϴ�");}
	
	}
public class TvTest {

	public static void main(String[] args) {
		Tv myTv = new Tv(7,10,true);
	//	myTv.channel = 9;
		myTv.print();
		Tv yourTv = new Tv(11, 20, true);
		yourTv.print();

	}

}
