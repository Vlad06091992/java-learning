
public class Cat {

    //статическая переменная, константаы
    public static final int LEGS_COUNT = 4;

    //статическая переменная
    public static double totalWeight = 10000;
    public static int count = 0;
    //статическая метод
    public static double getTotalWeight (){
        return totalWeight;
    }

    public static void updateCount (){
        count++;
    }

    //переменные
    private double originWeight;
    private double weight;
    public Transport transport;

    private double minWeight;
    private double maxWeight;
    private String name;
    public int age = 0;
    // неизменяемая переменна(типа const в JS)
    private final int typenimal = 1;


    public static double getTotalWeightNoStatic (){
        return totalWeight;
    }

    //конструктор класса
    public Cat() {
        updateCount();
        this.weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;

    }

    //второй конструктор
    public Cat(String name) {
        //вызов первого конструктора
        this();
        this.name = name;

    }

    public void meow() {
        weight = weight - 1;
        System.out.println("Meow");
    }

    public void setTransportType (Transport transport){
        this.transport = transport;
    }

    public void feed(Double amount) {
        weight = weight + amount;
    }

    public void drink(Double amount) {
        weight = weight + amount;
    }

    public Double getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public void showArgumentString(String arg) {
        System.out.println(arg);
    }

    public void showArgumentStrings(String arg1, String arg2, String arg3) {
        System.out.println(arg1);
        System.out.println(arg2);
        System.out.println(arg3);
    }


    public String getStatus() {
        if (weight < minWeight) {
            return "Dead";
        } else if (weight > maxWeight) {
            return "Exploded";
        } else if (weight > originWeight) {
            return "Sleeping";
        } else {
            return "Playing";
        }
    }
}