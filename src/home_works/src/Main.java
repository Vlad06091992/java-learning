package home_works.src;

public class Main {
    public static void main(String[] args) {
        Container container = new Container();
        container.count += 7843;

        System.out.println(sumDigits(567));

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
}
