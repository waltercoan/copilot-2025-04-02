package br.com.kasolution.exercicio7;

import java.util.Scanner;

public class Caixa {
    private boolean aberto;

    public Caixa() {
        this.aberto = true;
    }

    public void iniciar() {
        Scanner scanner = new Scanner(System.in);
        Carrinho carrinho = new Carrinho();

        while (aberto) {
            System.out.println("Novo cliente. Processando itens...");
            boolean maisItens = true;

            while (maisItens) {
                System.out.print("Digite o nome do item: ");
                String nome = scanner.nextLine();

                System.out.print("Digite o preço do item: ");
                double preco = scanner.nextDouble();
                scanner.nextLine(); // Consumir a quebra de linha

                carrinho.adicionarItem(new Item(nome, preco));

                System.out.print("Há mais itens? (s/n): ");
                String resposta = scanner.nextLine();
                maisItens = resposta.equalsIgnoreCase("s");
            }

            double total = carrinho.calcularTotal();
            System.out.printf("Total da compra: R$ %.2f%n", total);

            System.out.print("Deseja fechar o caixa? (s/n): ");
            String resposta = scanner.nextLine();
            if (resposta.equalsIgnoreCase("s")) {
                aberto = false;
            }

            carrinho.limparCarrinho();
        }

        System.out.println("Caixa fechado. Até logo!");
        scanner.close();
    }
}