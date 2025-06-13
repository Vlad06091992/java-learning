package home_works.src;

public class Main {
    public static void main(String[] args) {
        Container container = new Container();
        container.count += 7843;

//        System.out.println(sumDigits(567));
//        System.out.println(maxMinValue());
        maxMinValue();

    }

    public static int sumDigits(Integer number) {
        int result = 0;

        String str = Integer.toString(number);
        for (int i = 0; i < str.length(); i++) {
            int curr = str.charAt(i) - '0';

            result += curr;
        }

        return result;
    }

    public static void maxMinValue() {

        Byte a = 10;
        System.out.println(a instanceof Byte);

        Integer b = 10;
        System.out.println(b instanceof Integer);

        Short c = 10;
        System.out.println(c instanceof Short);

        Long d = 10L;
        System.out.println(d instanceof Long);

        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);

        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);

        Float e = 10f;
        System.out.println(e instanceof Float);

        Double f = 10.0;
        System.out.println(f instanceof Double);

        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);

        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);

    }
}
