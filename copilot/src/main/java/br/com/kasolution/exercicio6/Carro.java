package br.com.kasolution.exercicio6;

public class Carro {
    private String marca;
    private String modelo;
    private String cor;
    private int ano;

    // Construtor para inicializar os atributos
    public Carro(String marca, String modelo, String cor, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
    }

    // Método vender com valor default true
    public boolean vender() {
        return true;
    }

    // Método imprimir para exibir os valores dos atributos
    public void imprimir() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Ano: " + ano);
    }
}