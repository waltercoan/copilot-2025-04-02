package br.com.kasolution.exercicio1;

public class Main {
    // defina um método main para esta classe
    public static void main(String[] args) {
        //chame o método calcularmedia e mostre o resultado em tela
        double[] numeros = {10.5, 20.0, 30.5, 40.0};
        double media = calcularMedia(numeros);
        System.out.println("A média é: " + media);
    }

    // defina uma função ou método para calcular a média de uma lista de numeros
    public static double calcularMedia(double[] numeros) {
        // Inicializa a variável soma com 0 para armazenar a soma dos números
        double soma = 0;
        // Itera sobre cada número no array de números
        for (double numero : numeros) {
            // Adiciona o número atual à soma
            soma += numero;
        }
        // Retorna a média calculada dividindo a soma pelo número de elementos no array
        return soma / numeros.length;
    }
    //defina um método para calcular a média de uma lista de numeros utilizando o método stream
    public static double calcularMediaStream(double[] numeros) {
        return java.util.Arrays.stream(numeros).average().orElse(0);
    }

}
