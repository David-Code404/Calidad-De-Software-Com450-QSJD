package com.conversor;

/**
 *
 * @author David-Code
 */


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Pruebas para el Conversor de Temperatura")
class ConversorTemperaturaTest {

    private ConversorTemperatura conversor;

    
    @BeforeEach
    void setUp() {
        conversor = new ConversorTemperatura();
    }

    @Test
    @DisplayName("Prueba 1: Convierte temperatura positiva (25°C a 77°F)")
    void testConvertirPositivo() {
        assertEquals(77.0, conversor.celsiusAFahrenheit(25));
    }

    @Test
    @DisplayName("Prueba 2: Convierte temperatura negativa (-10°C a 14°F)")
    void testConvertirNegativo() {
        assertEquals(14.0, conversor.celsiusAFahrenheit(-10));
    }

    @Test
    @DisplayName("Prueba 3: Convierte cero grados (0°C a 32°F)")
    void testConvertirCero() {
        assertEquals(32.0, conversor.celsiusAFahrenheit(0));
    }

    @Test
    @DisplayName("Prueba 4: Convierte temperatura decimal (36.6°C a 97.88°F)")
    void testConvertirDecimal() {
        
        assertEquals(97.88, conversor.celsiusAFahrenheit(36.6), 0.001);
    }

    @Test
    @DisplayName("Prueba 5: Convierte una temperatura grande (1000°C a 1832°F)")
    void testConvertirTemperaturaGrande() {
        assertEquals(1832.0, conversor.celsiusAFahrenheit(1000));
    }
}