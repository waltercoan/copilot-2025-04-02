package br.com.kasolution.exercicio5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
        // URL de conexão com o banco de dados SQL Server
        String urlConexao = "jdbc:sqlserver://localhost:1433;databaseName=exemplo";

        // Chama o método conectarBanco e exibe o resultado
        try (Connection conexao = conectarBanco(urlConexao)) {
            if (conexao != null) {
                System.out.println("Conexão estabelecida com sucesso!");
            }
        } catch (SQLException e) {
            System.err.println("Erro ao conectar ao banco de dados: " + e.getMessage());
        }
    }

    /**
     * Gerencia a conexão com um banco de dados SQL Server.
     *
     * @param url A URL de conexão com o banco de dados.
     * @return Um objeto do tipo Connection se a conexão for bem-sucedida.
     * @throws SQLException Se ocorrer um erro ao tentar conectar ao banco de dados.
     */
    public static Connection conectarBanco(String url) throws SQLException {
        // Define o usuário e a senha do banco de dados
        String usuario = "seuUsuario";
        String senha = "suaSenha";

        // Retorna a conexão utilizando o DriverManager
        return DriverManager.getConnection(url, usuario, senha);
    }
}
