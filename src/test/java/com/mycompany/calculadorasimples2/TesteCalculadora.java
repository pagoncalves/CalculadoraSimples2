/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calculadorasimples2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TesteCalculadora {

    public TesteCalculadora() {
    }

    @Test
    public void test_calculadora() {
        CalculadoraSimples calc = new CalculadoraSimples();
        int soma = calc.soma(5, 7);
        assertEquals(12, soma);
    }

    @Test
    public void testa_mult() {
        CalculadoraSimples calc = new CalculadoraSimples();
        int mult = calc.mult(5, 7);
        assertEquals(35, mult);
    }

    @Test
    public void testa_media() {
        CalculadoraSimples calc = new CalculadoraSimples();
        double[] v = {6, 8, 10};
        double media = calc.media(v);
        assertEquals(8, media);
    }

    @Test
    public void testa_maximo() {
        CalculadoraSimples calc = new CalculadoraSimples();
        double[] v = {6, 8, 10};
        double maximo = calc.maximo(v);
        assertEquals(10, maximo);
    }

    @Test
    public void testa_soma_de_sequencia() {
        CalculadoraSimples calc = new CalculadoraSimples();
        double soma = calc.soma_seq(4);
        assertEquals(1 + 2 + 3 + 4, soma);
    }

    @Test
    public void testa_media2() {
        CalculadoraSimples calc = new CalculadoraSimples();
        double media = calc.media2(3.0, 5.0);
        assertEquals(4, media);
    }

    @Test
    public void testa_potencia() {
        CalculadoraSimples calc = new CalculadoraSimples();
        double pot = calc.potencia(2.0, 3);
        assertEquals(8.0, pot);
    }

    @Test
    public void testa_soma_quadrados() {
        CalculadoraSimples calc = new CalculadoraSimples();
        int soma = calc.soma_quadrados(4);
        assertEquals(1 * 1 + 2 * 2 + 3 * 3 + 4 * 4, soma);

    }

    @Test
    public void testa_soma_quadrados_vetor() {
        CalculadoraSimples calc = new CalculadoraSimples();
        int[] v = {3, 2, 4, 5};
        int soma = calc.soma_quadrados_vetor(v);
        assertEquals(3 * 3 + 2 * 2 + 4 * 4 + 5 * 5, soma);
    }

    @Test
    public void testa_mult_vetor() {
        CalculadoraSimples calc = new CalculadoraSimples();
        int[] v = {3, 2, 4, 5};
        int mult = calc.mult_vetor(v);
        assertEquals(3 * 2 * 4 * 5, mult);
    }

    @Test
    public void testa_duplica_vetor() {
        CalculadoraSimples calc = new CalculadoraSimples();
        int[] v = {3, 2, 4, 5};
        calc.duplica_vetor(v);
        int[] w = {6, 4, 8, 10};
        assertArrayEquals(w, v);
    }

    @Test
    public void testa_incrementa_vetor() {
        CalculadoraSimples calc = new CalculadoraSimples();
        int[] v = {3, 2, 4, 5};
        calc.incrementa_vetor(v);
        int[] w = {4, 3, 5, 6};
        assertArrayEquals(w, v);
    }

    @Test
    public void testa_soma_acumulativa() {
        CalculadoraSimples calc = new CalculadoraSimples();
        int[] v = {3, 2, 4, 5};
        calc.soma_acumulativa(v);
        int[] w = {3, 5, 9, 14};
        assertArrayEquals(w, v);
    }

    @Test
    public void testa_positivos() {
        CalculadoraSimples calc = new CalculadoraSimples();
        int[] v = {-3, 2, 4, -5};
        calc.positivos(v);
        int[] w = {3, 2, 4, 5};
        assertArrayEquals(w, v);
    }

    /*  Exemplo para trocar dois elementos de lugar:
    
    int n = v.lenght; - tamanho do vetor
    
    int tmp = v[i]; le o elemento
    v[i] = v[n - i - 1] 1 elemento e copia o elemento q est ano fim
    v[n - i - 1] = tmp   pega o ultimo elemento e armazena no primeiro 
    
     */
    @Test
    public void testa_inversao() {
        CalculadoraSimples calc = new CalculadoraSimples();
        int[] v = {3, 2, 4, 5};
        calc.inverte(v);
        int[] w = {5, 4, 2, 3};
        assertArrayEquals(w, v);
    }

    @Test
    public void testa_sequencia() {
        CalculadoraSimples calc = new CalculadoraSimples();
        int[] v = calc.sequencia(4);
        int[] w = {1, 2, 3, 4};
        assertArrayEquals(w, v);
    }

    @Test
    public void testa_sequencia_quadrados() {
        CalculadoraSimples calc = new CalculadoraSimples();
        int[] v = calc.sequencia_quadrados(4);
        int[] w = {1, 4, 9, 16};
        assertArrayEquals(w, v);
    }

    @Test
    public void testa_sequancia_reversa() {
        CalculadoraSimples calc = new CalculadoraSimples();
        int[] v = calc.sequencia_reversa(4);
        int[] w = {4, 3, 2, 1};
        assertArrayEquals(w, v);
    }

    @Test
    public void testa_sequencia_a_partir_de() {
        CalculadoraSimples calc = new CalculadoraSimples();
        int[] v = calc.sequencia_a_partir_de(4, 10);
        int[] w = {10, 11, 12, 13};
        assertArrayEquals(w, v);
    }

}
