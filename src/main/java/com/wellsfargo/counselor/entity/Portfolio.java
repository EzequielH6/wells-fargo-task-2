package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolioId;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String data;

    @OneToOne
    @JoinColumn(name = "client_id")
    private Client client;

    protected Portfolio() {
        // Required for JPA
    }

    public Portfolio(String data, Client client) {
        this.data = data;
        this.client = client;
    }

    public Long getPortfolioId() {
        return portfolioId;
    }

    public String getData() {
        return data;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) { 
        this.client = client; 
    }
}