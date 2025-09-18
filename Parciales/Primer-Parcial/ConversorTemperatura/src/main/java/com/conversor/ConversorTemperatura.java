package com.conversor;

/**
 *
 * @author David-Code
 */


public class ConversorTemperatura {

    
     
    public double celsiusAFahrenheit(double celsius) {
        // Esta es la fórmula correcta que pusimos en el paso de Refactorizar
        return (celsius * 9.0 / 5.0) + 32;
    }
}