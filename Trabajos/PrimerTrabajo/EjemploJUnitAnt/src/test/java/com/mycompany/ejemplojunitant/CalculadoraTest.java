/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.ejemplojunitant; // Asegúrate que el paquete coincida con el tuyo

//--  David-Code
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {
    
    private Calculadora calc;
    
    // 2. @Before se convierte en @BeforeEach en JUnit 5
    @BeforeEach
    public void setUp() {
        System.out.println("Iniciando una nueva prueba...");
        calc = new Calculadora();
    }
    
    // 3. @After se convierte en @AfterEach en JUnit 5
    @AfterEach
    public void tearDown() {
        System.out.println("Finalizando la prueba.");
        calc = null;
    }
    
    @Test
    public void testSumar() {
        System.out.println("  -> Ejecutando testSumar");
        int resultado = calc.sumar(5, 3);
        assertEquals(8, resultado);
    }

    @Test
    public void testRestar() {
        System.out.println("  -> Ejecutando testRestar");
        int resultado = calc.restar(10, 4);
        assertEquals(6, resultado);
    }

    // 4. La prueba de excepciones cambia radicalmente.
    // Ya no se usa 'expected'. Ahora se usa el método assertThrows().
    @Test
    public void testDividirPorCeroLanzaExcepcion() {
        System.out.println("  -> Ejecutando testDividirPorCero");
        
        // Esta es la nueva forma de verificar que se lanza una excepción.
        // Le decimos: "Espero que se lance una IllegalArgumentException cuando ejecutes este código".
        assertThrows(IllegalArgumentException.class, () -> {
            calc.dividir(5, 0);
        });
    }
}