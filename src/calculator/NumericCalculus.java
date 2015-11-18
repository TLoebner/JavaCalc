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
    char[] function1_type;
    char[] function2_type;
    double[] numa_error, max_error;
    /*
    public NumericCalculus(double[][] points)
    {
        //this.function1_points = points;
    }
    
    public NumericCalculus(double[] exp)
    {
        //this.function1_exp = exp;
    }
    
    public NumericCalculus(char[] type)
    {
        //this.function1_type = type;
    }
    */
    
    public void set_function1_points(double[][] points)
    {
        this.function1_points = points;
    }
    
    public void set_function2_points(double[][] points)
    {
        this.function2_points = points;
    }
    
    public void set_function1_exp(double[] points)
    {
        this.function1_exp = points;
    }
    
    public void set_function2_exp(double[] points)
    {
        this.function2_exp = points;
    }
    
    public void set_function1_type(char[] type)
    {
        this.function1_type = type;
    {
        return this.max_error;
    }
    
}
