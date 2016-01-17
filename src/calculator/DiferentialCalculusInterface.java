
package calculator;

/**
 *
 * <p>Java class for basic math.
 * @author Torsten Loebner <loebnert@gmail.com>
 */
interface DiferentialCalculusInterface {
    
    void Simple(double max_error);
    void LinearInterpolated(double max_error);
    void CubicSplineInterpolated(double max_error);
    void UndeterminedCoefficients(double max_error);
    void RichardsonExtrapolation(double max_error);
}