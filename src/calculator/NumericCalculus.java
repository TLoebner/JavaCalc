/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author user
 */
public class NumericCalculus {
    double[][] function1_points;
    double[][] function2_points;
    double[] function1_exp;
    double[] function2_exp;
    double[] error;
    char[] function1_type;
    char[] function2_type;
    
    NumericCalculus(double[][] points)
    {
        this.function1_points = points;
    }
    
    NumericCalculus(double[] exp)
    {
        this.function1_exp = exp;
    }
    
    NumericCalculus(char[] type)
    {
        this.function1_type = type;
    }
    
}
