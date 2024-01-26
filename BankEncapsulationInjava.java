package OOPS;

class Bank98 {
	private String Name, Email;
	private long Acc_No;
	private float Amount;

	public String getName() {
		return Name;
	}

	public String getEmail() {
		return Email;
	}

	public long getAcc_No() {
		return Acc_No;
	}

	public float getAmount() {
		return Amount;
	}

	public void setName(String Name) {
		this.Name = Name;
	}

	public void setEmail(String Email) {
		this.Email = Email;
	}

	public void setAcc_No(long Acc_No) {
		this.Acc_No = Acc_No;
	}

	public void setAmount(float Amount) {
		this.Amount = Amount;
	}
}

public class BankEncapsulationInjava {

	public static void main(String[] args) {
		Bank98 B = new Bank98();
		B.setName("Kajal");
		B.setEmail("Kajal123@gmail.com");
		B.setAcc_No(120983973);
		B.setAmount(567789.9f);

		System.out.println(B.getName() + " " + B.getEmail() + " " + B.getAcc_No() + " " + B.getAmount());

	}
}
