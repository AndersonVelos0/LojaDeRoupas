
package LojaDeRoupas.negocio;

/**
 *
 * @author Anderson Veloso, Eliel Vieira, Juliana Venancio
 */
public class Camiseta extends Roupa {
    private String cor;

    public Camiseta(String nome, double preco, String tamanho, String cor) {
        this(nome, preco, tamanho);
    }

    public Camiseta(String nome, double preco, String tamanho) {
        super(nome, preco, tamanho);
        this.cor = cor;
    }

   
    @Override
    public String getDescricao() {
        return getNome() + " - " + getTamanho();
    }
}

