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
interface DiferentialCalculusInterface {
    
    void Simple(double max_error);
    void LinearInterpolated(double max_error);
    void CubicSplineInterpolated(double max_error);
    void UndeterminedCoefficients(double max_error);
    void RichardsonExtrapolation(double max_error);
}