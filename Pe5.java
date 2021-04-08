class Account{
	int balance=0;
	void withdraw(int amount) {
		balance -= amount;
		System.out.print(amount+"원 인출");
	}
	void deposit(int amount) {
		balance += amount;
		System.out.print(amount+"원 저축");}
	void account() {System.out.print(balance);
	}
	void Account() {System.out.print("새로운 계좌가 만들어졌습니다.");}
	
}
public class Pe5 {

	public static void main(String[] args) {
		Account acc1 = new Account();
		Account acc2 = new Account();
		acc1.deposit(50000);
		acc2.deposit(100000);
	}

}
