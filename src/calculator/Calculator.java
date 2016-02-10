
package calculator;

/**
 *
 * <p>Java class for basic math.
 * @author Torsten Loebner <loebnert@gmail.com>
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        calculator.basicCalc calculator = new calculator.basicCalc();
        calculator.basicCalc integer_calculator = new calculator.basicCalc(5,9);
        calculator.basicCalc float_calculator = new calculator.basicCalc(5L,9L);
        calculator.basicCalc long_calculator = new calculator.basicCalc(5.0f,9.0f);
        calculator.basicCalc double_calculator = new calculator.basicCalc(5.0d,9.0d);


        integer_calculator.add();
        System.out.println(integer_calculator.get_IErg() + " :: " + integer_calculator.get_LErg() + " :: " + integer_calculator.get_FErg() + " :: " + integer_calculator.get_DErg());
        integer_calculator.sub();
        System.out.println(integer_calculator.get_IErg() + " :: " + integer_calculator.get_LErg() + " :: " + integer_calculator.get_FErg() + " :: " + integer_calculator.get_DErg());
        integer_calculator.mul();
        System.out.println(integer_calculator.get_IErg() + " :: " + integer_calculator.get_LErg() + " :: " + integer_calculator.get_FErg() + " :: " + integer_calculator.get_DErg());
        integer_calculator.div();
        System.out.println(integer_calculator.get_IErg() + " :: " + integer_calculator.get_LErg() + " :: " + integer_calculator.get_FErg() + " :: " + integer_calculator.get_DErg());

        float_calculator.add();
        System.out.println(float_calculator.get_IErg() + " :: " + float_calculator.get_LErg() + " :: " + float_calculator.get_FErg() + " :: " + float_calculator.get_DErg());
        float_calculator.sub();
        System.out.println(float_calculator.get_IErg() + " :: " + float_calculator.get_LErg() + " :: " + float_calculator.get_FErg() + " :: " + float_calculator.get_DErg());
        float_calculator.mul();
        System.out.println(float_calculator.get_IErg() + " :: " + float_calculator.get_LErg() + " :: " + float_calculator.get_FErg() + " :: " + float_calculator.get_DErg());
        float_calculator.div();
        System.out.println(float_calculator.get_IErg() + " :: " + float_calculator.get_LErg() + " :: " + float_calculator.get_FErg() + " :: " + float_calculator.get_DErg());

        long_calculator.add();
        System.out.println(long_calculator.get_IErg() + " :: " + long_calculator.get_LErg() + " :: " + long_calculator.get_FErg() + " :: " + long_calculator.get_DErg());
        long_calculator.sub();
        System.out.println(long_calculator.get_IErg() + " :: " + long_calculator.get_LErg() + " :: " + long_calculator.get_FErg() + " :: " + long_calculator.get_DErg());
        long_calculator.mul();
        System.out.println(long_calculator.get_IErg() + " :: " + long_calculator.get_LErg() + " :: " + long_calculator.get_FErg() + " :: " + long_calculator.get_DErg());
        long_calculator.div();
        System.out.println(long_calculator.get_IErg() + " :: " + long_calculator.get_LErg() + " :: " + long_calculator.get_FErg() + " :: " + long_calculator.get_DErg());

        double_calculator.add();
        System.out.println(double_calculator.get_IErg() + " :: " + double_calculator.get_LErg() + " :: " + double_calculator.get_FErg() + " :: " + double_calculator.get_DErg());
        double_calculator.sub();
        System.out.println(double_calculator.get_IErg() + " :: " + double_calculator.get_LErg() + " :: " + double_calculator.get_FErg() + " :: " + double_calculator.get_DErg());
        double_calculator.mul();
        System.out.println(double_calculator.get_IErg() + " :: " + double_calculator.get_LErg() + " :: " + double_calculator.get_FErg() + " :: " + double_calculator.get_DErg());
        double_calculator.div();
        System.out.println(double_calculator.get_IErg() + " :: " + double_calculator.get_LErg() + " :: " + double_calculator.get_FErg() + " :: " + double_calculator.get_DErg());


    }
    
}
