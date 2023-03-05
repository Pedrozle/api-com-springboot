package com.pedrozle.testetecnico.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@JsonIdentityInfo(scope = Pessoa.class, generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
@Table(name = "pessoa")
@Entity(name = "pessoa")
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "dtNascimento")
    private String dtNascimento;

    @OneToMany
    @JoinColumn(name = "pessoa_id")
    private List<Endereco> enderecos;

    public Pessoa() {
    }

    public Pessoa(String nome, String dtNascimento, List<Endereco> enderecos) {
        this.nome = nome;
        this.dtNascimento = dtNascimento;
        this.enderecos = enderecos;
    }

    // Getters & Setters
    public Long getId() {
        return this.id;
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

    public String getdtNascimento() {
        return dtNascimento;
    }

    public void setdtNascimento(String dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public List<Endereco> getEndereco() {
        return enderecos;
    }

    public void setEndereco(List<Endereco> endereco) {
        this.enderecos = endereco;
    }


    public String toString() {
        return "Pessoa: \n" + "id: " + this.getId() + "nome: " + this.getNome() + " dtNascimento: "
                + this.getdtNascimento() + " enderecos: " + this.getEndereco();
    }

}
