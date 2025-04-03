package br.com.kasolution.exercicio9;

public class Usuario {
    private String nome;
    private String senha;
    private ContaBancaria conta;

    public Usuario(String nome, String senha, ContaBancaria conta) {
        this.nome = nome;
        this.senha = senha;
        this.conta = conta;
    }

    public String getNome() {
        return nome;
    }

    public boolean autenticar(String senha) {
        return this.senha.equals(senha);
    }

    public ContaBancaria getConta() {
        return conta;
    }
}