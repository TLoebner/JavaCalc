
package calculator;

/**
 *
 * <p>Java class for basic math.
 * @author Torsten Loebner <loebnert@gmail.com>
 */
interface IntegralCalculusInterface {
    
    void Rectangular(double max_error);
    void NewtonCotes(double max_error);
    void GaussChristofel(double max_error);
    void Romberg(double max_error);
    void AdaptivRomberg(double max_error);
    void AdaptiveMultigrid(double max_error);
    void MonteCarlo(double max_error);
}