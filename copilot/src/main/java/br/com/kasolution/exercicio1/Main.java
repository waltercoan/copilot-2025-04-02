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
        double soma = 0;
        for (double numero : numeros) {
            soma += numero;
        }
        return soma / numeros.length;
    }
    //defina um método para calcular a média de uma lista de numeros utilizando o método stream
    public static double calcularMediaStream(double[] numeros) {
        return java.util.Arrays.stream(numeros).average().orElse(0);
    }

}
