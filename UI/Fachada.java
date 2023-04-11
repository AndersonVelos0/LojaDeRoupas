package LojaDeRoupas.UI;

import LojaDeRoupas.negocio.Calca;
import LojaDeRoupas.negocio.Camiseta;
import LojaDeRoupas.negocio.Roupa;
import LojaDeRoupas.negocio.Sapato;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Anderson
 */
public class Fachada {

    private ArrayList<Roupa> estoque;

    public Fachada() {
        estoque = new ArrayList<Roupa>();
    }

    public void adicionarRoupaGUI() {
        String[] opcoes = {"Camiseta", "Calça", "Sapato"};
        int escolha = JOptionPane.showOptionDialog(null, "Escolha o tipo de roupa:", "Adicionar nova roupa",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null,
                opcoes, opcoes[0]);
        if (escolha == 0) {
            String nome = JOptionPane.showInputDialog("Nome da camiseta:");
            double preco = Double.parseDouble(JOptionPane.showInputDialog("Preço da camiseta:"));
            String tamanho = JOptionPane.showInputDialog("Tamanho da camiseta:");
            Camiseta camiseta = new Camiseta(nome, preco, tamanho);
            estoque.add(camiseta);
            JOptionPane.showMessageDialog(null, "Camiseta adicionada com sucesso!");
        } else if (escolha == 1) {
            String nome = JOptionPane.showInputDialog("Nome da calça:");
            double preco = Double.parseDouble(JOptionPane.showInputDialog("Preço da calça:"));
            String tamanho = JOptionPane.showInputDialog("Tamanho da calça:");
            Calca calca = new Calca(nome, preco, tamanho);
            estoque.add(calca);
            JOptionPane.showMessageDialog(null, "Calça adicionada com sucesso!");
        } else if (escolha == 2) {
            String nome = JOptionPane.showInputDialog("Nome do sapato:");
            double preco = Double.parseDouble(JOptionPane.showInputDialog("Preço do sapato:"));
            String tipoMaterial = JOptionPane.showInputDialog("Tipo de material do sapato:");
            Sapato sapato = new Sapato(nome, preco, tipoMaterial);
            estoque.add(sapato);
            JOptionPane.showMessageDialog(null, "Sapato adicionado com sucesso!");
        }
    }

    public void listarRoupasGUI() {
        StringBuilder mensagem = new StringBuilder();
        double precoTotal = 0;
        for (Roupa roupa : estoque) {
            mensagem.append(roupa.getDescricao()).append(" - R$").append(roupa.getPreco()).append("\n");
            precoTotal += roupa.getPreco();
        }
        JOptionPane.showMessageDialog(null, "==========xxxxx========== \n" + mensagem.toString() + "\npreço Total = " + precoTotal + "\n==========xxxxx==========", "Roupas em estoque", JOptionPane.INFORMATION_MESSAGE);
    } 

}
