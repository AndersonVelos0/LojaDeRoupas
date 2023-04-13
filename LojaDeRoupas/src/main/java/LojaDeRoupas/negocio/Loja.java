/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LojaDeRoupas.negocio;
import java.util.ArrayList;

/**
 *
 * @author Anderson
 */

public class Loja {
    private ArrayList<Roupa> estoque;

    public Loja() {
        estoque = new ArrayList<Roupa>();
    }

    public void adicionarRoupa(Roupa roupa) {
        estoque.add(roupa);
    }

    public void listarRoupas() {
        for (Roupa roupa : estoque) {
            System.out.println(roupa.getDescricao() + " - R$" + roupa.getPreco());
        }
    }
}

