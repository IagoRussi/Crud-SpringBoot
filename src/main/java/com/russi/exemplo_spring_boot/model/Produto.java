package com.russi.exemplo_spring_boot.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "produto")
public class Produto {


    @Id
    @Column(name = "id")
    private int id;
    
    @Column(name = "nm_produto")
    private String nomeProduto;

    @Column(name = "preco")
    private double preco;

    public Produto(int id, String nomeProduto, double preco) {
        this.id = id;
        this.nomeProduto = nomeProduto;
        this.preco = preco;
    }

    public Produto() {

    }

    public int getId() {
        return id;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public double getPreco() {
        return preco;
    }
}
