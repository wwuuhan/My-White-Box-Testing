package com.test.jacoco.test;

import static org.junit.Assert.assertEquals;
/**
 * Created by superZh on 2019/10/1.
 */

import org.junit.Test;
import com.test.jacoco.HelloWorld;

public class HelloWorldTest {
    @Test
    public void testMethod1() {
        HelloWorld hw = new HelloWorld();
        String a = hw.Method1();
        assertEquals("Hello World", a);
    }

    @Test
    public void testMethod2() {
        HelloWorld hw = new HelloWorld();
        int a = hw.Method2(2, 1);
        assertEquals(3, a);
    }
    
    @Test
    public void testMethod3() {
    	/**
    	 * TODO：finish the test function
    	 */
    	HelloWorld hw = new HelloWorld();
    	int a = hw.Method3(6, -1, 1);
    	a=hw.Method3(6,-1,-1);
    	a=hw.Method3(6,0,1);
    	a=hw.Method3(6,0,-1);
    	a=hw.Method3(5,0,1);
    	a=hw.Method3(5,0,-1);
    	a=hw.Method3(4,0,1);
    	a=hw.Method3(4,0,-3);
    	a=hw.Method3(4,0,-1);
    }
    /**
     * TODO: add the test function of other methods in HelloWorld.java
     */
    @Test
    public void testBug(){
        HelloWorld hw = new HelloWorld();
        boolean b = hw.bug(5);
        assertEquals(true,b);
        b = hw.bug(4);
        assertEquals(false,b);
    }

    @Test
    public void testMethod4(){
        HelloWorld hw = new HelloWorld();
        int a = hw.Method4(0,1,2,3,0);
        a=hw.Method4(1,1,2,3,0);
        //a=hw.Method4(1,2,3,3,0);//
        a=hw.Method4(5,4,3,3,0);
        //a=hw.Method4(5,4,1,2,1.5f);
        //a=hw.Method4(5,4,3,4,0);//
        //a=hw.Method4(5,5,2,3,0);
        //a=hw.Method4(5,5,3,3,0);
    }
    @Test
    public void testisTriangle(){
        HelloWorld hw = new HelloWorld();
        boolean b = hw.isTriangle(-1,1,2);
        assertEquals(false,b);
        b = hw.isTriangle(1,0,2);
        assertEquals(false,b);
        b = hw.isTriangle(1,1,-2);
        assertEquals(false,b);
        b = hw.isTriangle(3,4,7);
        assertEquals(false,b);
        b = hw.isTriangle(3,7,4);
        assertEquals(false,b);
        b = hw.isTriangle(7,3,4);
        assertEquals(false,b);
        b = hw.isTriangle(2,3,4);
        assertEquals(true,b);
    }

    @Test
    public void testminiCalculation(){
        HelloWorld hw = new HelloWorld();
        double res = hw.miniCalculator(1.23,2.34,'+');
        assertEquals(3.57,res,0.01);
        res = hw.miniCalculator(1.23,2.34,'-');
        assertEquals(-1.11,res,0.01);
        res = hw.miniCalculator(1.23,2.34,'*');
        assertEquals(1.23*2.34,res,0.01);
        res = hw.miniCalculator(1.23,2.34,'/');
        assertEquals(1.23/2.34,res,0.01);
        res = hw.miniCalculator(1.23,2.34,'%');
        assertEquals(0,res,0.01);
    }
    @Test
    public void testisBirthday(){
        HelloWorld hw = new HelloWorld();
        boolean b = hw.isBirthday(1989,1,1);
        assertEquals(false,b);
        b = hw.isBirthday(2020,1,1);
        assertEquals(false,b);
        b = hw.isBirthday(2000,-1,1);
        assertEquals(false,b);
        b = hw.isBirthday(2000,13,1);
        assertEquals(false,b);
        b = hw.isBirthday(2000,10,-1);
        assertEquals(false,b);
        b = hw.isBirthday(2000,10,32);
        assertEquals(false,b);

        b = hw.isBirthday(2019,11,1);
        assertEquals(false,b);
        b = hw.isBirthday(2019,10,2);
        assertEquals(false,b);
        b = hw.isBirthday(2019,10,1);
        assertEquals(true,b);

        b = hw.isBirthday(2000,4,31);
        assertEquals(false,b);
        b = hw.isBirthday(2000,4,30);
        assertEquals(true,b);
        b = hw.isBirthday(2000,6,31);
        assertEquals(false,b);
        b = hw.isBirthday(2000,6,30);
        assertEquals(true,b);
        b = hw.isBirthday(2000,9,31);
        assertEquals(false,b);
        b = hw.isBirthday(2000,9,30);
        assertEquals(true,b);
        b = hw.isBirthday(2000,11,31);
        assertEquals(false,b);
        b = hw.isBirthday(2000,11,30);
        assertEquals(true,b);

        b = hw.isBirthday(2000,2,30);
        assertEquals(false,b);
        b = hw.isBirthday(2000,2,29);
        assertEquals(true,b);
        b = hw.isBirthday(1992,2,30);
        assertEquals(false,b);
        b = hw.isBirthday(1992,2,29);
        assertEquals(true,b);
        b = hw.isBirthday(1996,2,30);
        assertEquals(false,b);
        b = hw.isBirthday(1996,2,29);
        assertEquals(true,b);
        b = hw.isBirthday(2004,2,30);
        assertEquals(false,b);
        b = hw.isBirthday(2004,2,29);
        assertEquals(true,b);
        b = hw.isBirthday(2008,2,30);
        assertEquals(false,b);
        b = hw.isBirthday(2008,2,29);
        assertEquals(true,b);
        b = hw.isBirthday(2012,2,30);
        assertEquals(false,b);
        b = hw.isBirthday(2012,2,29);
        assertEquals(true,b);
        b = hw.isBirthday(2016,2,30);
        assertEquals(false,b);
        b = hw.isBirthday(2016,2,29);
        assertEquals(true,b);

        b = hw.isBirthday(2001,2,29);
        assertEquals(false,b);
        b = hw.isBirthday(2001,2,28);
        assertEquals(true,b);
        b = hw.isBirthday(2019,3,20);
        assertEquals(true,b);


    }
}
