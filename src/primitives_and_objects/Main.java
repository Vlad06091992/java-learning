package primitives_and_objects;

import classes_objects.src.Cat;
import classes_objects.src.Processor;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class Main {

    //объект
    Cat cat = new Cat("Федя", 4450.0, 900, 90000);



    //примитивы

    //принимает значения true или false. Используется для логических выражений и условий.
    private boolean flag;

    // byte: 8-битное целое число. Применяется для экономии памяти,
    // когда диапазона от -128 до 127 достаточно.
    private byte b;

    //16-битное целое число. Используется, когда нужно хранить целые числа в меньшем диапазоне по
    // сравнению с int, от -32 768 до 32 767.
    private short number;

    //32-битное целое число. Это наиболее часто используемый тип для хранения целых значений,
    //диапазон от -2 147 483 648 до 2 147 483 647.
    private int count;


    // 64-битное целое число. Применяется для хранения больших значений, когда диапазона int
    // недостаточно.
    private long bigNumber;


    // 64-битное число с плавающей точкой. Используется для более точных вычислений с дробными
    // числами.
    private double value;


    // 32-битное число с плавающей точкой. Используется для представления дробных чисел,
    // когда необходима высокая производительность и экономия памяти.
    private float level;


    // 16-битный символ, представляющий один символ Unicode. Используется для хранения символов,
    // таких как буквы и знаки препинания.
    private char symbol;


    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.parseInt("234534"));
    }
}
