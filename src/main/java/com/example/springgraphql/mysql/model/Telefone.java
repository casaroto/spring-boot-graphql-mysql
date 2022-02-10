package com.example.springgraphql.mysql.model;

import javax.persistence.*;

@Entity
public class Telefone {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long telefoneUID;

    @Column(name = "descricaoTipoTelefone", nullable = false)
    private String descricaoTipoTelefone;

    @Column(name = "numeroDDD", nullable = false)
    private Integer numeroDDD;

    @Column(name = "numeroTelefone")
    private Integer numeroTelefone;

    @Column(name = "ramalTelefone")
    private Integer ramalTelefone;

    @Column(name = "seguradoUID", nullable = false)
    private Integer seguradoUID;


    public Telefone(){

    }

    public Telefone(Long telefoneUID, Integer numeroDDD, Integer numeroTelefone, Integer seguradoUID) {
        this.telefoneUID = telefoneUID;
        this.numeroDDD = numeroDDD;
        this.numeroTelefone = numeroTelefone;
        this.seguradoUID = seguradoUID;
    }


    public Long getTelefoneUID() {
        return telefoneUID;
    }

    public void setTelefoneUID(Long telefoneUID) {
        this.telefoneUID = telefoneUID;
    }

    public String getDescricaoTipoTelefone() {
        return descricaoTipoTelefone;
    }

    public void setDescricaoTipoTelefone(String descricaoTipoTelefone) {
        this.descricaoTipoTelefone = descricaoTipoTelefone;
    }

    public Integer getNumeroDDD() {
        return numeroDDD;
    }

    public void setNumeroDDD(Integer numeroDDD) {
        this.numeroDDD = numeroDDD;
    }

    public Integer getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(Integer numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    public Integer getRamalTelefone() {
        return ramalTelefone;
    }

    public void setRamalTelefone(Integer ramalTelefone) {
        this.ramalTelefone = ramalTelefone;
    }

    public Integer getSeguradoUID() {
        return seguradoUID;
    }

    public void setSeguradoUID(Integer seguradoUID) {
        this.seguradoUID = seguradoUID;
    }

    @Override
    public String toString() {
        return " ";
    }
}
