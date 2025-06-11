public class Variables {
    public static void main(String[] args) {
        int one = 1;
        double someValue = 2.4343;
        String string = "Какая-то строка";
        Boolean isCool = true;
        //динамическая переменная
        var some = true;

        if (!some) {
            System.out.println("Сюда не попадем");
        } else {
            System.out.println("Сюда попадем");
        }
    }
}