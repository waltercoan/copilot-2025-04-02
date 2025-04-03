// filepath: d:\KaSolution\2025\2025-04-02-githubcopilotnapratica\copilot-2025-04-02\src\main\java\br\com\kasolution\springboot\entities\Estado.java
package br.com.kasolution.springboot.entities;

public class Estado {
    private String nome;
    private String pais;

    // Construtor
    public Estado(String nome, String pais) {
        this.nome = nome;
        this.pais = pais;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}