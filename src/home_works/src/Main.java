package home_works.src;

public class Main {
    public static void main(String[] args) {

        printLogisticsInfo(800);
    }

    public static void printLogisticsInfo(Integer boxes) {
        final int truckContainerCapacity = 12;
        final int boxCapacityInContainer = 27;
        double trucks = Math.ceil(800 / 324.);
        final int trucksCount = (int) Math.max(trucks, 1);

        boolean isExit = false;

        int containerNumber = 0;
        int boxNumber = 0;

        for (int i = 1; i <= trucksCount; i++) {
            System.out.println("Грузовик номер:" + i);

            for (int j = 1; j <= truckContainerCapacity; j++) {
                System.out.println("     Контейнер номер:" + (containerNumber + j));

                if (isExit) break;

                if (j == truckContainerCapacity) {
                    containerNumber = j + containerNumber;
                }


                for (int k = 1; k <= boxCapacityInContainer; k++) {
                    System.out.println("          Ящик номер:" + (boxNumber + k));

                    if (boxNumber + k == boxes) {
                        isExit = true;
                        break;
                    }

                    if (k == boxCapacityInContainer) {
                        boxNumber = k + boxNumber;
                        break;
                    }

                }

            }

        }
    }


}
