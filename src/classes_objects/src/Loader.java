
public class Loader {
    public static void main(String[] args) {
        Cat cat = new Cat();

        System.out.println(cat.getStatus());

        Cat murka = new Cat("Мурка");

        System.out.println("имя кошки: " + murka.getName());
        murka.setTransportType(Transport.BUS);

        System.out.println("murka.transport:" + murka.transport);

        System.out.println("Количество кошек:" + Cat.count);

        double weight = murka.getWeight();
        murka.showArgumentString("аргумент");
        System.out.println("murka weight:" + weight);
        System.out.println(murka.age);

        Computer computer = new Computer();
        computer.processor.frequency = 3000.2;
        computer.processor.numberOfCores = 4.0;

        // использование стоковых классов языка
        String string = "";
        String newString = new String("newString");

        System.out.println("Длина newString: " + newString.length());


        murka.drink(murka.getWeight() / 1000);


        //вызов статического метода
        System.out.println(Cat.getTotalWeight());

        //вызов не статического метода для обращения к статическому свойству
        System.out.println(Cat.getTotalWeightNoStatic());

//статические методы должны использовать статические переменные

    }
}