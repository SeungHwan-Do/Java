class Account{
	int balance=0;
	void withdraw(int amount) {
		balance -= amount;
		System.out.print(amount+"�� ����");
	}
	void deposit(int amount) {
		balance += amount;
		System.out.print(amount+"�� ����");}
	void account() {System.out.print(balance);
	}
	void Account() {System.out.print("���ο� ���°� ����������ϴ�.");}
	
}
public class Pe5 {

	public static void main(String[] args) {
		Account acc1 = new Account();
		Account acc2 = new Account();
		acc1.deposit(50000);
		acc2.deposit(100000);
	}

}
