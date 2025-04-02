package br.com.kasolution.exercicio2;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        gerarCsv("dados.csv");
    }

    public static void gerarCsv(String nomeArquivo) {
        String[] cabecalho = {"ID", "Nome", "Idade"};
        String[][] dados = {
            {"1", "João", "25"},
            {"2", "Maria", "30"},
            {"3", "Carlos", "22"}
        };

        try (FileWriter writer = new FileWriter(nomeArquivo)) {
            // Escreve o cabeçalho
            writer.append(String.join(",", cabecalho)).append("\n");

            // Escreve os dados
            for (String[] linha : dados) {
                writer.append(String.join(",", linha)).append("\n");
            }

            System.out.println("Arquivo CSV gerado com sucesso: " + nomeArquivo);
        } catch (IOException e) {
            System.err.println("Erro ao gerar o arquivo CSV: " + e.getMessage());
        }
    }
}
