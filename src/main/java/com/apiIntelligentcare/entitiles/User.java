package com.apiIntelligentcare.entitiles;

import jakarta.persistence.*;

@Entity
@Table(name="TB_USER")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String email;

    private String Senha;

    public User(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        Senha = senha;
    }

    public User() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String senha) {
        Senha = senha;
    }
}
