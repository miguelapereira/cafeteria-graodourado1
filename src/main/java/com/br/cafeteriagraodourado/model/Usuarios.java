package com.br.cafeteriagraodourado.model;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;



@Entity
@Table(name = "usuarios")
public class Usuarios {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;


    private Integer registro;
    private String nome;
    @Column(length = 80)
    private String email;
    @Column(length = 40)
    private String senha;
    @Column(length = 10)
    @DateTimeFormat(style = "yyyy-mm-dd")

    private LocalDate dataAdimissao;

    private Boolean ativo;


    //constructor


    public Usuarios() {
    }

    public Usuarios(long id, Boolean ativo, LocalDate dataAdimissao, String nome, String email, String senha, Integer registro) {
        this.id = id;
        this.ativo = ativo;
        this.dataAdimissao = dataAdimissao;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.registro = registro;
    }





    //setters


    public void setId(long id) {
        this.id = id;
    }

    public void setRegistro(Integer registro) {
        this.registro = registro;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setDataAdimissao(LocalDate dataAdimissao) {
        this.dataAdimissao = dataAdimissao;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }



    //geters

    public long getId() {
        return id;
    }

    public Integer getRegistro() {
        return registro;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public LocalDate getDataAdimissao() {
        return dataAdimissao;
    }

    public Boolean getAtivo() {
        return ativo;
    }
}



