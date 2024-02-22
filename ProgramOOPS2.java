package OOPS1;

class circle{
	private double radius;
	
	//constructor
	
	public circle(double radius) {
		this.radius=radius;
	}
	
	//getter methods for radius
	
	public double getredius() {
		return radius;
	}
	
	//setter methods for redius
	
	public void setradius(double radius) {
		this.radius = radius;
	}
	
	//Abstraction method to calculate Area
	
	public double calculateArea() {
		return Math.PI*radius*radius;
	}
}

//Inheritance : cylinder class inherting from circle class

class cylinder extends circle{
   private double height;
	public cylinder(double radius, double height) {
		super(radius);
		this.height=height;
	}
	//getter methods
	public double getheight() {
		return height;
	}
	
	//setter methods
	public void setheight(double height) {
		this.height=height;
	}
	
	//Abstration method to calculateVolume
	
	public double calculateVolume() {
		return calculateArea()*height;
	}
	
	//polymorphism 
	
	public String toString() {
		return "Cylinder with Radius : " + getredius() + " , Height :" + height;
	}
	
}
public class ProgramOOPS2 {

	private static char[] circle;

	public static void main(String[] args) {
		
      circle ci = new circle(5);
      cylinder cy = new cylinder(3, 7);
      
      System.out.println("Circle details : ");
      System.out.println("Radius : " + ci.getredius());
      System.out.println("Area : " + ci.calculateArea());
      System.out.println(ci);
      
      System.out.println("cylinder details : ");
      System.out.println("Radius  :" +cy.getredius());
      System.out.println("Height : " + cy.getheight());
      System.out.println("Volume  :" + cy.calculateVolume());
      System.out.println(cy);
      
	}
}
