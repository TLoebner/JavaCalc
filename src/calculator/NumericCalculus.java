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
    
    public void set_function1_type(cahr[] type)
    {
        this.function1_type = type;
    }
    
    public void set_function2_type(cahr[] type)
    {
        this.function2_type = type;
    }
    
    public double[][] get_function1_points()
    {
        return this.function1_points;
    }
    
    public double[][] get_function2_points()
    {
        return this.function2_points;
    }
    
    public double[] get_function1_exp()
    {
        return this.function1_exp;
    }
    
    public double[] get_function2_exp()
    {
        return this.function2_exp;
    }
    
    public char[] get_function1_type()
    {
        return this.function1_type;
    }
    
    public char[] get_function2_type()
    {
        return this.function2_type;
    }
    
    public double get_numa_error()
    {
        return this.numa_error;
    }
    
    public double get_max_error()
    {
        return this.max_error;
    }
    
}
