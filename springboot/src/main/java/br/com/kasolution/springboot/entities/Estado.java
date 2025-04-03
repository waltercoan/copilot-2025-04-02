package br.com.kasolution.springboot.entities;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Estado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String pais;

    @OneToMany(mappedBy = "estado")
    private List<Cliente> clientes;

    // Construtor
    public Estado(String nome, String pais) {
        this.nome = nome;
        this.pais = pais;
    }

    public Estado() {}

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }
}