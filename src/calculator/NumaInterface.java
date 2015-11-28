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
 interface NumaInterface
 {
    void set_function1_points(double[][] points);
    void set_function2_points(double[][] points);
    void set_function1_exp(double[] points);
    void set_function2_exp(double[] points);
    void set_function1_type(char[] type);
    void set_function2_type(char[] type);
    void set_equation1_exp(double[][] exp);
    void set_equation2_exp(double[][] exp);
    double[][] get_function1_points();
    double[][] get_function2_points();
    double[] get_function1_exp();
    double[] get_function2_exp();
    char[] get_function1_type();
    char[] get_function2_type();
    double[] get_numa_error();
    double get_max_error();
    double[][] get_equation1_exp();
    double[][] get_equation2_exp();
 }