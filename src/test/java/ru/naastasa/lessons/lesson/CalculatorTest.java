package ru.naastasa.lessons.lesson;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by naastasa on 10.05.16.
 * this is test for add2 method from Calculator
 * add2 is realization for adding two arguments
 */
public class CalculatorTest {
    @Test
    public void add2() throws Exception {
        Calculator calculator = new Calculator();
        calculator.add2(33,33);
        Assert.assertEquals(66, calculator.getResult());

    }

}