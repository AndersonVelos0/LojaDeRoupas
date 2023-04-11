/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LojaDeRoupas.negocio;

/**
 *
 * @author Anderson Veloso, Eliel Vieira, Juliana Venancio
 */
public class Sapato extends Roupa {
    private String tipoMaterial;

    public Sapato(String nome, double preco, String tamanho, String tipoMaterial) {
        this(nome, preco, tamanho);
    }

    public Sapato(String nome, double preco, String tamanho) {
        super(nome, preco, tamanho);
        this.tipoMaterial = tipoMaterial;
    }

    public String getTipoMaterial() {
        return tipoMaterial;
    }

    public void setTipoMaterial(String tipoMaterial) {
        this.tipoMaterial = tipoMaterial;
    }

    @Override
    public String getDescricao() {
        return getNome() + " - " + getTamanho();
    }
}
