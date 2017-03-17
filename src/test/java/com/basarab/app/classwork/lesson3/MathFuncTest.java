package com.basarab.app.classwork.lesson3;

import com.tetianitta.app.classwork.lesson3.MathFunc;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Tetiana on 15.03.2017.
 */
public class MathFuncTest {

    @Test // JUnit framework annotation
    public void multiplyTest (){
        int a = 3;
        int b = 2;
        MathFunc mathFunc = new MathFunc();
        int actualResult = mathFunc.multiply(a, b);
        int expectedResult = 6;
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test //JUnit framework anotation
    public void sumTest () {
        int a = 3;
        int b = 2;
        MathFunc mathFunc = new MathFunc();
        int actualResult = mathFunc.sum(a, b);
        int expectedResult = 5;
        Assert.assertEquals(expectedResult, actualResult);
    }
}
