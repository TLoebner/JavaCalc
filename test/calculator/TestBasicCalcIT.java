/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author user
 */
public class TestBasicCalcIT {
    
    public TestBasicCalcIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

 
    /**
     * Test of integer Adder.
     */
    @Test
    public void test_Integer_Adder() {
        System.out.println("Test of integer Adder");
        basicCalc instance = new basicCalc();
        int expResult = 14;
        instance.set_Var1(5);
        instance.set_Var2(9);
        instance.add();
        int result1 = instance.get_IErg();
        long result2 = instance.get_LErg();
        float result3 = instance.get_FErg();
        double result4 = instance.get_DErg();
        assertEquals(expResult, result1);
        assertEquals(0L, result2);
        assertEquals(0.0f, result3, 0.0f);
        assertEquals(0.0d, result4, 0.0d);
    }

    /**
     * Test of long Adder.
     */
    @Test
    public void test_Long_Adder() {
        System.out.println("Test of long Adder");
        basicCalc instance = new basicCalc();
        long expResult = 14L;
        instance.set_Var1(5L);
        instance.set_Var2(9L);
        instance.add();
        int result1 = instance.get_IErg();
        long result2 = instance.get_LErg();
        float result3 = instance.get_FErg();
        double result4 = instance.get_DErg();
        assertEquals(0, result1);
        assertEquals(expResult, result2);
        assertEquals(0.0f, result3, 0.0f);
        assertEquals(0.0d, result4, 0.0d);
    }


    /**
     * Test of float Adder.
     */
    @Test
    public void test_float_Adder() {
        System.out.println("Test of float Adder");
        basicCalc instance = new basicCalc();
        float expResult = 14.0f;
        instance.set_Var1(5.0f);
        instance.set_Var2(9.0f);
        instance.add();
        int result1 = instance.get_IErg();
        long result2 = instance.get_LErg();
        float result3 = instance.get_FErg();
        double result4 = instance.get_DErg();
        assertEquals(0, result1);
        assertEquals(0L, result2);
        assertEquals(expResult, result3, 0.0f);
        assertEquals(0.0d, result4, 0.0d);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }


    /**
     * Test of double Adder.
     */
    @Test
    public void test_double_Adder() {
        System.out.println("Test of double Adder");
        basicCalc instance = new basicCalc();
        double expResult = 14.0d;
        instance.set_Var1(5.0d);
        instance.set_Var2(9.0d);
        instance.add();
        int result1 = instance.get_IErg();
        long result2 = instance.get_LErg();
        float result3 = instance.get_FErg();
        double result4 = instance.get_DErg();
        assertEquals(0, result1);
        assertEquals(0L, result2);
        assertEquals(0.0f, result3, 0.0f);
        assertEquals(expResult, result4, 0.0d);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
     
    /**
     * Test of integer Sub.
     */
    @Test
    public void test_Integer_Sub() {
        System.out.println("Test of integer Sub");
        basicCalc instance = new basicCalc();
        int expResult = -4;
        instance.set_Var1(5);
        instance.set_Var2(9);
        instance.sub();
        int result1 = instance.get_IErg();
        long result2 = instance.get_LErg();
        float result3 = instance.get_FErg();
        double result4 = instance.get_DErg();
        assertEquals(expResult, result1);
        assertEquals(0L, result2);
        assertEquals(0.0f, result3, 0.0f);
        assertEquals(0.0d, result4, 0.0d);
    }

    /**
     * Test of long Sub.
     */
    @Test
    public void test_Long_Sub() {
        System.out.println("Test of long Sub");
        basicCalc instance = new basicCalc();
        long expResult = -4L;
        instance.set_Var1(5L);
        instance.set_Var2(9L);
        instance.sub();
        int result1 = instance.get_IErg();
        long result2 = instance.get_LErg();
        float result3 = instance.get_FErg();
        double result4 = instance.get_DErg();
        assertEquals(0, result1);
        assertEquals(expResult, result2);
        assertEquals(0.0f, result3, 0.0f);
        assertEquals(0.0d, result4, 0.0d);
    }


    /**
     * Test of float Sub.
     */
    @Test
    public void test_float_Sub() {
        System.out.println("Test of float Sub");
        basicCalc instance = new basicCalc();
        float expResult = -4.0f;
        instance.set_Var1(5.0f);
        instance.set_Var2(9.0f);
        instance.sub();
        int result1 = instance.get_IErg();
        long result2 = instance.get_LErg();
        float result3 = instance.get_FErg();
        double result4 = instance.get_DErg();
        assertEquals(0, result1);
        assertEquals(0L, result2);
        assertEquals(expResult, result3, 0.0f);
        assertEquals(0.0d, result4, 0.0d);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }


    /**
     * Test of double Sub.
     */
    @Test
    public void test_double_Sub() {
        System.out.println("Test of double Sub");
        basicCalc instance = new basicCalc();
        double expResult = -4.0d;
        instance.set_Var1(5.0d);
        instance.set_Var2(9.0d);
        instance.sub();
        int result1 = instance.get_IErg();
        long result2 = instance.get_LErg();
        float result3 = instance.get_FErg();
        double result4 = instance.get_DErg();
        assertEquals(0, result1);
        assertEquals(0L, result2);
        assertEquals(0.0f, result3, 0.0f);
        assertEquals(expResult, result4, 0.0d);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
   
    /**
     * Test of integer Mul.
     */
    @Test
    public void test_Integer_Mul() {
        System.out.println("Test of integer Mul");
        basicCalc instance = new basicCalc();
        int expResult = 45;
        instance.set_Var1(5);
        instance.set_Var2(9);
        instance.mul();
        int result1 = instance.get_IErg();
        long result2 = instance.get_LErg();
        float result3 = instance.get_FErg();
        double result4 = instance.get_DErg();
        assertEquals(expResult, result1);
        assertEquals(0L, result2);
        assertEquals(0.0f, result3, 0.0f);
        assertEquals(0.0d, result4, 0.0d);
    }

    /**
     * Test of long Mul.
     */
    @Test
    public void test_Long_Mul() {
        System.out.println("Test of long Mul");
        basicCalc instance = new basicCalc();
        long expResult = 45L;
        instance.set_Var1(5L);
        instance.set_Var2(9L);
        instance.mul();
        int result1 = instance.get_IErg();
        long result2 = instance.get_LErg();
        float result3 = instance.get_FErg();
        double result4 = instance.get_DErg();
        assertEquals(0, result1);
        assertEquals(expResult, result2);
        assertEquals(0.0f, result3, 0.0f);
        assertEquals(0.0d, result4, 0.0d);
    }


    /**
     * Test of float Mul.
     */
    @Test
    public void test_float_Mul() {
        System.out.println("Test of float Mul");
        basicCalc instance = new basicCalc();
        float expResult = 45.0f;
        instance.set_Var1(5.0f);
        instance.set_Var2(9.0f);
        instance.mul();
        int result1 = instance.get_IErg();
        long result2 = instance.get_LErg();
        float result3 = instance.get_FErg();
        double result4 = instance.get_DErg();
        assertEquals(0, result1);
        assertEquals(0L, result2);
        assertEquals(expResult, result3, 0.0f);
        assertEquals(0.0d, result4, 0.0d);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }


    /**
     * Test of double Mul.
     */
    @Test
    public void test_double_Mul() {
        System.out.println("Test of double Mul");
        basicCalc instance = new basicCalc();
        double expResult = 45.0d;
        instance.set_Var1(5.0d);
        instance.set_Var2(9.0d);
        instance.mul();
        int result1 = instance.get_IErg();
        long result2 = instance.get_LErg();
        float result3 = instance.get_FErg();
        double result4 = instance.get_DErg();
        assertEquals(0, result1);
        assertEquals(0L, result2);
        assertEquals(0.0f, result3, 0.0f);
        assertEquals(expResult, result4, 0.0d);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }


    /**
     * Test of integer Div.
     */
    @Test
    public void test_Integer_Div() {
        System.out.println("Test of integer Div");
        basicCalc instance = new basicCalc();
        int expResult = 0;
        instance.set_Var1(5);
        instance.set_Var2(9);
        instance.div();
        int result1 = instance.get_IErg();
        long result2 = instance.get_LErg();
        float result3 = instance.get_FErg();
        double result4 = instance.get_DErg();
        assertEquals(expResult, result1);
        assertEquals(0L, result2);
        assertEquals(0.0f, result3, 0.0f);
        assertEquals(0.0d, result4, 0.0d);
    }

    /**
     * Test of long Div.
     */
    @Test
    public void test_Long_Div() {
        System.out.println("Test of long Div");
        basicCalc instance = new basicCalc();
        long expResult = 0L;
        instance.set_Var1(5L);
        instance.set_Var2(9L);
        instance.div();
        int result1 = instance.get_IErg();
        long result2 = instance.get_LErg();
        float result3 = instance.get_FErg();
        double result4 = instance.get_DErg();
        assertEquals(0, result1);
        assertEquals(expResult, result2);
        assertEquals(0.0f, result3, 0.0f);
        assertEquals(0.0d, result4, 0.0d);
    }


    /**
     * Test of float Div.
     */
    @Test
    public void test_float_Div() {
        System.out.println("Test of float Div");
        basicCalc instance = new basicCalc();
        float expResult = 0.5555f;
        instance.set_Var1(5.0f);
        instance.set_Var2(9.0f);
        instance.div();
        int result1 = instance.get_IErg();
        long result2 = instance.get_LErg();
        float result3 = instance.get_FErg();
        double result4 = instance.get_DErg();
        assertEquals(0, result1);
        assertEquals(0L, result2);
        assertEquals(expResult, result3, 0.0001f);
        assertEquals(0.0d, result4, 0.0d);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }


    /**
     * Test of double Div.
     */
    @Test
    public void test_double_Div() {
        System.out.println("Test of double Div");
        basicCalc instance = new basicCalc();
        double expResult = 0.5555d;
        instance.set_Var1(5.0d);
        instance.set_Var2(9.0d);
        instance.div();
        int result1 = instance.get_IErg();
        long result2 = instance.get_LErg();
        float result3 = instance.get_FErg();
        double result4 = instance.get_DErg();
        assertEquals(0, result1);
        assertEquals(0L, result2);
        assertEquals(0.0f, result3, 0.0f);
        assertEquals(expResult, result4, 0.0001d);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Complex Test
     */
    @Test
    public void test_complex_result() {
        System.out.println("Complex Test");
        basicCalc instance = new basicCalc();
        instance.set_Var1(5);
        instance.set_Var2(9);
        instance.set_Var1(5L);
        instance.set_Var2(9L);
        instance.set_Var1(5.0f);
        instance.set_Var2(9.0f);
        instance.set_Var1(5.0d);
        instance.set_Var2(9.0d);
        instance.add();
        assertEquals(14, instance.get_IErg());
        assertEquals(14L, instance.get_LErg());
        assertEquals(14.0f, instance.get_FErg(), 0.0f);
        assertEquals(14.0d, instance.get_DErg(), 0.0d);
        instance.sub();
        assertEquals(-4, instance.get_IErg());
        assertEquals(-4L, instance.get_LErg());
        assertEquals(-4.0f, instance.get_FErg(), 0.0f);
        assertEquals(-4.0d, instance.get_DErg(), 0.0d);
        instance.mul();
        assertEquals(45, instance.get_IErg());
        assertEquals(45L, instance.get_LErg());
        assertEquals(45.0f, instance.get_FErg(), 0.0f);
        assertEquals(45.0d, instance.get_DErg(), 0.0d);
        instance.div();
        assertEquals(0, instance.get_IErg());
        assertEquals(0L, instance.get_LErg());
        assertEquals(0.5555f, instance.get_FErg(), 0.0001f);
        assertEquals(0.5555d, instance.get_DErg(), 0.0001d);
    }

}
