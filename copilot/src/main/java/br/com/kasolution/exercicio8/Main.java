package br.com.kasolution.exercicio8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Pessoa {
    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
    }
}

class Funcionario extends Pessoa {
    private int tempoDeServico; // em meses

    public Funcionario(String nome, int tempoDeServico) {
        super(nome);
        this.tempoDeServico = tempoDeServico;
    }

    public boolean temDireitoAFerias() {
        return tempoDeServico > 12;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Tempo de Serviço: " + tempoDeServico + " meses");
        System.out.println("Direito a Férias: " + (temDireitoAFerias() ? "Sim" : "Não"));
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Funcionario> funcionarios = new ArrayList<>();

        System.out.print("Digite a quantidade de funcionários: ");
        int quantidadeFuncionarios = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        for (int i = 0; i < quantidadeFuncionarios; i++) {
            System.out.println("Funcionário " + (i + 1) + ":");
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("Tempo de serviço (em meses): ");
            int tempoDeServico = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            funcionarios.add(new Funcionario(nome, tempoDeServico));
        }

        int comFerias = 0;
        int semFerias = 0;

        System.out.println("\nInformações dos Funcionários:");
        for (Funcionario funcionario : funcionarios) {
            funcionario.exibirInformacoes();
            System.out.println();

            if (funcionario.temDireitoAFerias()) {
                comFerias++;
            } else {
                semFerias++;
            }
        }

        System.out.println("Total de funcionários com direito a férias: " + comFerias);
        System.out.println("Total de funcionários sem direito a férias: " + semFerias);

        scanner.close();
    }
}
