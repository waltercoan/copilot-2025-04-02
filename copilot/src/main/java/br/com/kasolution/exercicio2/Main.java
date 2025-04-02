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

    /**
     * Realiza uma chamada HTTP GET para uma API REST e exibe a resposta no console.
     *
     * @param apiUrl A URL da API que será chamada.
     *               Deve ser uma URL válida e acessível.
     *
     * O método realiza as seguintes etapas:
     * 1. Abre uma conexão HTTP com a URL fornecida.
     * 2. Envia uma requisição GET.
     * 3. Lê a resposta da API, caso o código de resposta seja HTTP 200 (OK).
     * 4. Exibe a resposta no console ou uma mensagem de erro em caso de falha.
     *
     * Tratamento de erros:
     * - Exibe mensagens de erro no console caso ocorra uma exceção ou se o código
     *   de resposta da API não for HTTP 200.
     *
     * Exemplo de uso:
     * <pre>
     * chamarApiRest("https://jsonplaceholder.typicode.com/posts/1");
     * </pre>
     *
     * Possíveis melhorias:
     * - Adicionar suporte para outros métodos HTTP (
     */
    public static void chamarApiRest(String apiUrl) {
        try {
            // Cria um objeto URL a partir da string fornecida como parâmetro.
            URL url = new URL(apiUrl);
            
            // Abre uma conexão HTTP com a URL fornecida.
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            
            // Define o método HTTP como GET para a requisição.
            connection.setRequestMethod("GET");

            // Obtém o código de resposta da requisição HTTP.
            int responseCode = connection.getResponseCode();
            
            // Verifica se o código de resposta é HTTP 200 (OK).
            if (responseCode == HttpURLConnection.HTTP_OK) {
                // Cria um BufferedReader para ler a resposta da API.
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                
                // Variável para armazenar cada linha da resposta.
                String inputLine;
                
                // StringBuilder para construir a resposta completa.
                StringBuilder response = new StringBuilder();

                // Lê cada linha da resposta e adiciona ao StringBuilder.
                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                
                // Fecha o BufferedReader após a leitura.
                in.close();

                // Exibe a resposta da API no console.
                System.out.println("Resposta da API:");
                System.out.println(response.toString());
            } else {
                // Exibe uma mensagem de erro caso o código de resposta não seja HTTP 200.
                System.err.println("Erro na chamada da API. Código de resposta: " + responseCode);
            }
        } catch (Exception e) {
            // Trata exceções e exibe uma mensagem de erro no console.
            System.err.println("Erro ao chamar a API: " + e.getMessage());
        }
    }
}
