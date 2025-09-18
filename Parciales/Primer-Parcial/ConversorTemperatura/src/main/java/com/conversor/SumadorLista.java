/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.conversor;

/**
 *
 * @author David-Code
 */
import java.util.List;

public class SumadorLista {

    /**
     * Calcula la suma de todos los números en una lista de enteros.
     *
     * @param numeros La lista de números a sumar.
     * @return La suma total.
     */
    public int sumar(List<Integer> numeros) {
        // --- LÓGICA CORRECTA Y REFACTORIZADA ---
        int total = 0;
        
        // Si la lista no es nula, recorre cada número y lo suma al total
        if (numeros != null) {
            for (int numero : numeros) {
                total += numero;
            }
        }
        
        return total;
    }
}