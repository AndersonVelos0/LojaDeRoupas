
package LojaDeRoupas.negocio;
import java.util.ArrayList;

/**
 *
 * @author Anderson Veloso, Eliel Vieira, Juliana Venancio
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

