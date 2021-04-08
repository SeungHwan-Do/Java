class Account{
	
	int balance = 0;
	
	int id = 0;
	static int cnt = 1;
	
	public Account() {
		System.out.println("새로운 계좌가 만들어졌습니다.");
		id = cnt++;
	}
	
	void withdraw(int amount) {
		balance -= amount;
		System.out.println(amount+"원 인출");
	}
	void deposit(int amount) {
		balance += amount;
		System.out.println(amount+"원 저축");
	}
	void print() {
		System.out.println("고객 #" +id + " 계좌 잔고=" + balance);
	}
	
}

public class Pe5 {
	public static void main(String[] args) {
		Account acc1 = new Account();
		acc1.deposit(50000);
		Account acc2 = new Account();
		acc2.deposit(100000);
		
		acc1.print();
		acc2.print();
	}

}
