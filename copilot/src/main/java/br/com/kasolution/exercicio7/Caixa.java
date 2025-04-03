package br.com.kasolution.exercicio7;

import java.util.Scanner;

public class Caixa { 
    // Define a classe Caixa, que representa o sistema de caixa de um estabelecimento.

    private boolean aberto; 
    // Variável de instância que indica se o caixa está aberto ou fechado.

    public Caixa() { 
        // Construtor da classe Caixa. Inicializa o estado do caixa como aberto.
        this.aberto = true; 
        // Define o valor inicial de 'aberto' como true, indicando que o caixa está aberto.
    }

    public void iniciar() { 
        // Método principal que inicia o funcionamento do caixa.
        Scanner scanner = new Scanner(System.in); 
        // Cria um objeto Scanner para ler entradas do usuário pelo console.
        Carrinho carrinho = new Carrinho(); 
        // Cria um novo objeto Carrinho para armazenar os itens do cliente.

        while (aberto) { 
            // Loop principal que continua enquanto o caixa estiver aberto.
            System.out.println("Novo cliente. Processando itens..."); 
            // Exibe uma mensagem indicando que um novo cliente está sendo atendido.
            boolean maisItens = true; 
            // Variável para controlar se o cliente deseja adicionar mais itens ao carrinho.

            while (maisItens) { 
                // Loop interno para processar os itens do cliente.
                System.out.print("Digite o nome do item: "); 
                // Solicita ao usuário o nome do item.
                String nome = scanner.nextLine(); 
                // Lê o nome do item digitado pelo usuário.

                System.out.print("Digite o preço do item: "); 
                // Solicita ao usuário o preço do item.
                double preco = scanner.nextDouble(); 
                // Lê o preço do item digitado pelo usuário.
                scanner.nextLine(); 
                // Consome a quebra de linha deixada pelo método nextDouble().

                carrinho.adicionarItem(new Item(nome, preco)); 
                // Adiciona um novo item ao carrinho com o nome e preço fornecidos.

                System.out.print("Há mais itens? (s/n): "); 
                // Pergunta ao usuário se há mais itens a serem adicionados.
                String resposta = scanner.nextLine(); 
                // Lê a resposta do usuário.
                maisItens = resposta.equalsIgnoreCase("s"); 
                // Define 'maisItens' como true se o usuário responder "s", caso contrário, false.
            }

            double total = carrinho.calcularTotal(); 
            // Calcula o total dos itens no carrinho.
            System.out.printf("Total da compra: R$ %.2f%n", total); 
            // Exibe o total da compra formatado como moeda.

            System.out.print("Deseja fechar o caixa? (s/n): "); 
            // Pergunta ao usuário se deseja fechar o caixa.
            String resposta = scanner.nextLine(); 
            // Lê a resposta do usuário.
            if (resposta.equalsIgnoreCase("s")) { 
                // Se o usuário responder "s", o caixa será fechado.
                aberto = false; 
                // Define 'aberto' como false, encerrando o loop principal.
            }

            carrinho.limparCarrinho(); 
            // Limpa o carrinho para o próximo cliente.
        }

        System.out.println("Caixa fechado. Até logo!"); 
        // Exibe uma mensagem indicando que o caixa foi fechado.
        scanner.close(); 
        // Fecha o objeto Scanner para liberar recursos.
    }
}