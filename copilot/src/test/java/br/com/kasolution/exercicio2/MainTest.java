package br.com.kasolution.exercicio2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    public void testVerificarParOuImpar_Par() {
        // Testa um número par
        int numero = 4;
        String resultado = Main.verificarParOuImpar(numero);
        assertEquals("Par", resultado, "O número 4 deveria ser identificado como Par");
    }

    @Test
    public void testVerificarParOuImpar_Impar() {
        // Testa um número ímpar
        int numero = 5;
        String resultado = Main.verificarParOuImpar(numero);
        assertEquals("Ímpar", resultado, "O número 5 deveria ser identificado como Ímpar");
    }

    @Test
    public void testVerificarParOuImpar_Zero() {
        // Testa o número zero (considerado par)
        int numero = 0;
        String resultado = Main.verificarParOuImpar(numero);
        assertEquals("Par", resultado, "O número 0 deveria ser identificado como Par");
    }
}