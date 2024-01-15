package OOPS;

class Address {
    String city, state, country;

    public Address(String city, String state, String country) {
        this.city = city;
        this.state = state;
        this.country = country;
    }
}

class employee11 {
    int id;
    String name;
    Address address;

    public employee11(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address; // Corrected the parameter name here
    }

    void display() {
        System.out.println(id + " " + name);
        System.out.println(address.city + " " + address.state + " " + address.country);
    }
}

public class Aggregation {

    public static void main(String[] args) {

        Address address1 = new Address("Haridwar", "Uttrakhand", "India");
        Address address2 = new Address("Garhwal", "Uttrakhand", "India");

        employee11 em = new employee11(101, "kajal", address1);
        employee11 em1 = new employee11(102, "Riya", address2);

        em.display();
        em1.display();
    }
}