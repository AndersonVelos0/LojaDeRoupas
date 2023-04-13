/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LojaDeRoupas.negocio;

/**
 *
 * @author Anderson
 */
public abstract class Roupa {

    private String nome;
    private double preco;
    private String tamanho;

    public Roupa(String nome, double preco, String tamanho) {
        this.nome = nome;
        this.preco = preco;
        this.tamanho = tamanho;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;

    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public abstract String getDescricao();
}
