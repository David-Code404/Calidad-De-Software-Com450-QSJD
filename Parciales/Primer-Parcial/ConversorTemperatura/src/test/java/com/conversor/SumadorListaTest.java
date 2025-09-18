package com.conversor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Pruebas del Sumador de Listas")
class SumadorListaTest {

    private SumadorLista sumador;

    
    @BeforeEach
    void setUp() {
        sumador = new SumadorLista();
    }

    @Test
    @DisplayName("Caso 1: Suma una lista con varios números positivos")
    void testSumaListaPositivos() {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
        assertEquals(15, sumador.sumar(numeros));
    }

    @Test
    @DisplayName("Caso 2: Suma una lista de números negativos")
    void testSumaListaNegativos() {
        List<Integer> numeros = Arrays.asList(-1, -2, -3, -4, -5);
        assertEquals(-15, sumador.sumar(numeros));
    }

    @Test
    @DisplayName("Caso 3: Suma una lista vacía")
    void testSumaListaVacia() {
        List<Integer> numeros = Collections.emptyList(); // Forma correcta de crear una lista vacía
        assertEquals(0, sumador.sumar(numeros));
    }

    @Test
    @DisplayName("Caso 4: Suma una lista con números positivos y negativos")
    void testSumaListaMezclada() {
        List<Integer> numeros = Arrays.asList(-1, 2, -3, 4, 5);
        assertEquals(7, sumador.sumar(numeros));
    }

    @Test
    @DisplayName("Caso 5: Suma una lista con un solo elemento")
    void testSumaUnSoloElemento() {
        List<Integer> numeros = Arrays.asList(10);
        assertEquals(10, sumador.sumar(numeros));
    }
}