package primitives_and_objects;

import classes_objects.src.Cat;
import classes_objects.src.Processor;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class Main {
    public static void main(String[] args) {

        Integer age = 5;
        int age2 = 6;


        //свойство у объекта
        System.out.println(age.byteValue());


        //анбоксинг при сравнении
        System.out.println(age == age2);

        System.out.println(compareIntegers(3,5));

    }

    private static boolean compareIntegers(Integer int1, Integer int2){
        return  int1.equals(int2);
    }
}
