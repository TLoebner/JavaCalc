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
interface IntegralCalculusInterface {
    
    void Rectangular(double max_error);
    void NewtonCotes(double max_error);
    void GaussChristofel(double max_error);
    void Romberg(double max_error);
    void AdaptivRomberg(double max_error);
    void AdaptiveMultigrid(double max_error);
    void MonteCarlo(double max_error);
}