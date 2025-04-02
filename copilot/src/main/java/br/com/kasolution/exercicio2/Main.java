package br.com.kasolution.exercicio2;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Main {

    public static void main(String[] args) {
        //gerarCsv("dados.csv");
        String apiUrl = "https://jsonplaceholder.typicode.com/posts/1"; // Exemplo de URL
        chamarApiRest(apiUrl);
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

    public static void chamarApiRest(String apiUrl) {
        try {
            URL url = new URL(apiUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                StringBuilder response = new StringBuilder();

                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();

                System.out.println("Resposta da API:");
                System.out.println(response.toString());
            } else {
                System.err.println("Erro na chamada da API. Código de resposta: " + responseCode);
            }
        } catch (Exception e) {
            System.err.println("Erro ao chamar a API: " + e.getMessage());
        }
    }
}
