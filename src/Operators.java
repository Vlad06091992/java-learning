public class Operators {
    public static void main(String[] args) {
        int moneyAmount = 1000;

        int cappuccinoPrice = 180;
        int lattePrice = 120;
        int espressoPrice = 80;
        int waterPrice = 20;


        boolean canBuyAnything = false;
        boolean isMilkEnough = false;

        if (moneyAmount >= cappuccinoPrice && isMilkEnough == true) {
            System.out.println("Вы можете купить капучино");
            canBuyAnything = true;
        }

        boolean moneyEnoughForLatte = moneyAmount >= lattePrice;

        if (moneyEnoughForLatte && isMilkEnough == true) {
            System.out.println("Вы можете купить латте");
            canBuyAnything = true;
        }

        if (moneyAmount >= espressoPrice) {
            System.out.println("Вы можете купить эспрессо");
            canBuyAnything = true;
        }

        if (moneyAmount >= waterPrice) {
            System.out.println("Вы можете купить воду");
            canBuyAnything = true;
        }

        if (!canBuyAnything || false) {
            System.out.println("У вас недостаточно денег для покупки любого напитка");
        } else {
            System.out.println("вы можете что-то купить");
        }
    }


//    Операторы сравнения чисел
// >,<, ==, >=,<=, !=
}
