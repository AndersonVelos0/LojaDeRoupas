
package LojaDeRoupas.negocio;

/**
 *
 * @author Anderson Veloso, Eliel Vieira, Juliana Venancio
 */
public class Calca extends Roupa {
    private String tipoTecido;

    public Calca(String nome, double preco, String tamanho, String tipoTecido) {
        this(nome, preco, tamanho);
    }

    public Calca(String nome, double preco, String tamanho) {
        super(nome, preco, tamanho);
        this.tipoTecido = tipoTecido;
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
