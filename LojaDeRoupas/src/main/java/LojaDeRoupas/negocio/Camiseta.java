/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LojaDeRoupas.negocio;

/**
 *
 * @author Anderson
 */
public class Camiseta extends Roupa {


    public Camiseta(String nome, double preco, String tamanho, String cor) {
        this(nome, preco, tamanho);
    }

    public Camiseta(String nome, double preco, String tamanho) {
        super(nome, preco, tamanho);

    }

    @Override
    public String getDescricao() {
        return getNome() + " - " + getTamanho();
    }
}
