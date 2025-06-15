package Expirements;

public class Main {

    public static void main(String[] args) {
        showManAndAddress();
    }

    public static void showManAndAddress() {
        Man Vlad = new Man("Vlad", 32, "63", "Воронова");

        System.out.println(Vlad.age);
        System.out.println(Vlad.name);
        System.out.println(Vlad.address.flat);
        System.out.println(Vlad.address.street);

    }
}
