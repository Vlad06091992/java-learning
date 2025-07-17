package nine_files.HW9_9;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        double incomes = 0;
        double expenses = 0;
        Set<String> expenseItems = new HashSet<>();



        try {
            List<String> lines = Files.readAllLines(Paths.get("src/nine_files/HW9_9/movementList.csv"));

            List<String> columnHeaders = List.of(lines.get(0).split(","));

            System.out.println(columnHeaders);

            //5 - операция
            //6 - приход
            //7 - расход

            for (int i = 1; i < lines.size() ; i++) {
                List<String> rowList = List.of(lines.get(i).split(","));

                double expense = Double.parseDouble((String) rowList.get(7));
                double income = Double.parseDouble((String) rowList.get(6));
                String operation =  rowList.get(5);
                expenses += expense;
                incomes += income;
                expenseItems.add(operation);
                System.out.println(income);

            }
        } catch (Exception e){

        }

        System.out.println("Расходы:" + expenses);
        System.out.println("Доходы:" + incomes);
        System.out.println("Операции:" + expenseItems);

    }
}
