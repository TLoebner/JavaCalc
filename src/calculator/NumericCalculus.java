
package calculator;

/**
 *
 * <p>Java class for basic math.
 * @author Torsten Loebner <loebnert@gmail.com>
 */
public class NumericCalculus implements NumaInterface {
    double[][] function1_points;
    double[][] function2_points;
    double[] function1_exp;
    double[] function2_exp;
    double[][] equation1_exp;
    double[][] equation2_exp;
    char[] function1_type;
    char[] function2_type;
    double[] numa_error;
    double max_error;
        
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
    }
    
    public void set_function2_type(char[] type)
    {
        this.function2_type = type;
    }
    
    public void set_equation1_exp(double[][] exp)
    {
        this.equation1_exp = exp;
    }
    
    public void set_equation2_exp(double[][] exp)
    {
        this.equation2_exp = exp;
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
    
    public double[] get_numa_error()
    {
        return this.numa_error;
    }
    
    public double get_max_error()
    {
        return this.max_error;
    }
    
    public double[][] get_equation1_exp()
    {
        return this.equation1_exp;
    }
    
    public double[][] get_equation2_exp()
    {
        return this.equation2_exp;
    }
    
}
