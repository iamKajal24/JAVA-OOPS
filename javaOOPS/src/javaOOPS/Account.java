package javaOOPS;

class Accou {
	int acc_no;
	String name;
	float amount;

	// method initialize obj
	void insert(int ac, String n, float amt) {
		acc_no = ac;
		name = n;
		amount = amt;
	}

	// void diposite
	void diposit(float amt) {
		amount = amount + amt;
		System.out.println(amt + " deposite ");
	}

	// widthdraw method
	void widthdraw(float amt) {
		if (amount < amt) {
			System.out.println("Insufficient Balance");
		} else {
			amount = amount - amt;
			System.out.println(amt + " widthdrawn ");
		}
	}

	// method to check the balance of the amount
	void checkBalance() {
		System.out.println(acc_no + " " + name + " " + amount);
	}

	void display() {
		System.out.println(acc_no + " " + name + " " + amount);
	}
}

public class Account {

	public static void main(String[] args) {
		Accou a1 = new Accou();
		a1.insert(410001509, "kajal", 10000);
		a1.display();
		a1.checkBalance();
		a1.diposit(5000);
		a1.checkBalance();
		a1.widthdraw(15000);
		a1.checkBalance();
	}
}

