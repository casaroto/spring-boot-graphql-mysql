package com.example.springgraphql.mysql.model;

import javax.persistence.*;

@Entity
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long enderecoUID;

    @Column(name = "cep", nullable = false)
    private Integer cep;

    @Column(name = "logradouro", nullable = false)
    private String logradouro;

    @Column(name = "tipoLogradouro")
    private String tipoLogradouro;

    @Column(name = "numero", nullable = false)
    private String numero;

    @Column(name = "complemento", nullable = true)
    private String complemento;

    @Column(name = "bairro", nullable = false)
    private String bairro;

    @Column(name = "cidade", nullable = false)
    private String cidade;

    @Column(name = "uf", nullable = false)
    private String uf;

    @Column(name = "seguradoUID", nullable = false)
    private Long seguradoUID;

    public Endereco() {
    }

    public Endereco(Long enderecoUID, Integer cep, String logradouro, String numero, String complemento, String bairro, String cidade, String uf, Long seguradoUID) {
        this.enderecoUID = enderecoUID;
        this.cep = cep;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.seguradoUID = seguradoUID;
    }

    public Long getEnderecoUID() {
        return enderecoUID;
    }

    public void setEnderecoUID(Long enderecoUID) {
        this.enderecoUID = enderecoUID;
    }

    public Integer getCep() {
        return cep;
    }

    public void setCep(Integer cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getTipoLogradouro() {
        return tipoLogradouro;
    }

    public void setTipoLogradouro(String tipoLogradouro) {
        this.tipoLogradouro = tipoLogradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public Long getSeguradoUID() {
        return seguradoUID;
    }

    public void setSeguradoUID(Long seguradoUID) {
        this.seguradoUID = seguradoUID;
    }

    @Override
    public String toString() {
        return " ";
    }
}
