package OOPS;

class Acc {
	int acc_no;
	String Name;
	float amount;

	// method to initialize Method
	void insert(int a, String n, float am) {
		acc_no = a;
		Name = n;
		amount = am;
	}

	// deposite Method

	void deposit(float am) {
		amount = amount + am;
		System.out.println(am + " deposited");
	}

	// withdraw Method

	void withdraw(float am) {
		if (amount < am) {
			System.out.println("Insufficient Balance");
		} else {
			amount = amount - am;
			System.out.println(am + "Widthdrawn");
		}
	}

	// check Balance;
	void CheckBalance() {
		System.out.println("Balance is :" + amount);
	}

	// method to display the values of an object

	void display() {
		System.out
				.println("Account Number : " + acc_no + " " + "Name :" + " " + Name + " " + "Amount : " + " " + amount);
	}

}

public class Account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Acc a1 = new Acc();

		a1.insert(897654, "Kajal", 86000);
		a1.display();
		a1.CheckBalance();
		a1.deposit(4000);
		a1.CheckBalance();
		a1.withdraw(10000);
		a1.CheckBalance();
	}
}
