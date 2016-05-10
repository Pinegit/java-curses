package ru.naastasa.lessons.lesson;

/**
 * Created by pinegit 6.05.2015
 *
 * This is very stupid calculator
 * the only thing that this "calculator" can do - adding
 * May be it should have other name, like "additator" but for me calculator is ok
 * If someone read it - have a happy day =)
 * P.S.  I sure you have more interesting and useful things to do ;)
 *
 */
public class Calculator {
    /**
     * @result is the result of th calculation
     */
    private int result;

    /**
     * Adding two arguments
     */
    public void add2(int argument1, int argument2){
        result = argument1 + argument2;
    }
    /**
     * Adding many arguments (I know that add2 is useless, but i like it )
     */
    public void add(int ... arguments){
       for (int arg : arguments){
            this.result += arg;
        }
    }
    /**
     * returning the result of calculation
     */
    public int getResult(){
        return this.result;
    }


}
