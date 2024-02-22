package OOPS1;

// Enacapsulation
class Employee {
	private String name;
	private int age;
	private double salary;

	// Constructor

	public Employee(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	// getter methods
	public String getname() {
		return name;
	}

	public int getage() {
		return age;
	}

	public double salary() {
		return salary;
	}

	// setter methods
	public void setname(String name) {
		this.name = name;
	}

	public void setage(int age) {
		this.age = age;
	}

	public void setsalary(double salary) {
		this.salary = salary;
	}

	// Polymorphism : method overring
	// @Override

	public String toString() {
		return "Name : " + name + ", age : " + age + ", salary : $ " + salary;
	}
}

//Inheritance : Manager class Inheriting from Employee

class Manager extends Employee {
	private String department;

	public Manager(String name, int age, double salary, String department) {
		super(name, age, salary);
		this.department = department;
	}

	// getter methods

	public String getdepartment() {
		return department;
	}

	// setter methods

	public void setdpartment(String department) {
		this.department = department;
	}

//polymorphism 

	public String toString() {
		return super.toString() + " , Department : " + department;
	}

}

public class ProgramOOPS1 {

	public static void main(String[] args) {
		Employee em = new Employee("Kajal", 25, 600000);
		Manager manager = new Manager("Riya", 30, 7000000, "Java Devloper");

		// Printing employee and Manager details using polymorphism

		System.out.println("Employee Details : " + em);
		System.out.println("Manager Details : " + manager);
	}
}
