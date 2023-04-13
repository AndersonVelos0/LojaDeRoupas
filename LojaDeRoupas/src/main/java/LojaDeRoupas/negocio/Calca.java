/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LojaDeRoupas.negocio;

/**
 *
 * @author Anderson
 */
public class Calca extends Roupa {

    private String tipoTecido;

    public Calca(String nome, double preco, String tamanho, String tipoTecido) {
        this(nome, preco, tamanho);
        this.tipoTecido = tipoTecido;
    }

    public Calca(String nome, double preco, String tamanho) {
        super(nome, preco, tamanho);

    }

    public String getTipoTecido() {
        return tipoTecido;
    }

    public void setTipoTecido(String tipoTecido) {
        this.tipoTecido = tipoTecido;
    }

    @Override
    public String getDescricao() {
        return getNome() + " - " + getTamanho();
    }
}
