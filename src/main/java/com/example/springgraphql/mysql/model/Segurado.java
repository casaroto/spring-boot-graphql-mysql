package com.example.springgraphql.mysql.model;

import javax.persistence.*;

@Entity
public class Segurado {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long seguradoUID;

    @Column(name = "nomeSegurado", nullable = false)
    private String nomeSegurado;

    @Column(name = "tipoPessoa", nullable = false)
    private String tipoPessoa;

    @Column(name = "cpfCnpj", nullable = false)
    private String cpfCnpj;

    @Column(name = "dataNascimento", nullable = false)
    private String dataNascimento;

    @Column(name = "email", nullable = false)
    private String email;

    public Segurado(){
    }

    public Segurado(Long seguradoUID, String nomeSegurado, String tipoPessoa, String cpfCnpj, String dataNascimento, String email) {
        this.seguradoUID = seguradoUID;
        this.nomeSegurado = nomeSegurado;
        this.tipoPessoa = tipoPessoa;
        this.cpfCnpj = cpfCnpj;
        this.dataNascimento = dataNascimento;
        this.email = email;
    }

    public Long getSeguradoUID() {
        return seguradoUID;
    }

    public void setSeguradoUID(Long seguradoUID) {
        this.seguradoUID = seguradoUID;
    }

    public String getNomeSegurado() {
        return nomeSegurado;
    }

    public void setNomeSegurado(String nomeSegurado) {
        this.nomeSegurado = nomeSegurado;
    }

    public String getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(String tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return " ";
    }
}
