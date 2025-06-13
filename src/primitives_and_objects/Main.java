package primitives_and_objects;

public class Main {
    public static void main(String[] args) {
//     int a = 3;
//     int b = 2;
//
//     //1
//     int c = a / b;
//     System.out.println(c);

//        double a = 3;
//        double b = 2;
//
//        //1.5
//        double c = a / b;

        int a = 3;
        int b = 2;

        //1.5, приведение a к double
        double c = (double) a / b;

        System.out.println(c);

//
//        //пример неверного приведения так как число не помещается в int
//        long time = System.currentTimeMillis();
//        System.out.println(time);
//        System.out.println((int) time);

        //пример верного приведения так как число помещается в int
        long timeLong = System.currentTimeMillis();
        long time = System.currentTimeMillis() / 1000;
        System.out.println(timeLong);
        System.out.println(time);
        System.out.println((int) time);


    }
}
