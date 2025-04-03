package br.com.kasolution.exercicio6;

public class Main {
    public static void main(String[] args) {
        // Criando um objeto da classe Carro
        Carro carro = new Carro("Toyota", "Corolla", "Prata", 2022);

        // Acessando os métodos da classe Carro
        carro.imprimir();
        System.out.println("Disponível para venda: " + carro.vender());
    }
}
