package OOPSInterview;

class Account {
    private long acc_no;
    private String name, email;
    private float amount;

    public long getAcc_no() {
        return acc_no;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public float getAmount() {
        return amount;
    }

    public void setAcc_no(long acc_no) {
        this.acc_no = acc_no;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        // Basic email validation
//        if (email.contains("@") && email.contains(".")) {
//            this.email = email;
//        } else {
//            System.out.println("Invalid email format!");
//        }
    	this.email=email;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public void bankName() {
        System.out.println("Bank Name: Punjab National Bank");
    }

    public void showFullDetails() {
        System.out.println("Account Number: " + acc_no);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        // Format amount as currency
        System.out.printf("Amount: $%.2f%n", amount);
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Account ac = new Account();
        ac.setAcc_no(41630015000045678L);
        ac.setName("Kajal");
        ac.setEmail("Kajal@12344");
        ac.setAmount(560000f);
        ac.bankName();
        ac.showFullDetails();
    }
}
