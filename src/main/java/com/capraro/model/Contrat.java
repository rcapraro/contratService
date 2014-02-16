package com.capraro.model;

import java.util.Date;

/**
 * Created by rcapraro on 16/02/2014.
 */
public class Contrat {

    private Long id;
    private String numero;
    private String produit;
    private Date dateCreation;
    private String statut;

    public Contrat(Long id, String numero, String produit, Date dateCreation, String statut) {
        this.id = id;
        this.numero = numero;
        this.produit = produit;
        this.dateCreation = dateCreation;
        this.statut = statut;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getProduit() {
        return produit;
    }

    public void setProduit(String produit) {
        this.produit = produit;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }
}
