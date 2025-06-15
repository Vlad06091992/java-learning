package Expirements;

public class Man {

    public String name;
    public int age;
    public Address address;

    public Man(String name, int age, String flat, String street) {
        this.name = name;
        this.age = age;
        this.address = new Address(flat,street);
    }


}
