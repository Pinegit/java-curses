package ru.naastasa.lessons.lesson;

/**
 * Created by naastasa on 10.05.16.
 */
public class Calculate {
    public static void main(String[] args){
        System.out.println("Calculate . . .");
        int firstAgrument=Integer.valueOf(args[0]);
        int secAgrument=Integer.valueOf(args[1]);
        int sum=firstAgrument+secAgrument;
        System.out.println("Sum: " + sum);
    }
}
