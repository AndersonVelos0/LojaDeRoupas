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

    public void adicionarRoupaGUI() throws Exception {
        String[] opcoes = {"Camiseta", "Calça", "Sapato"};
        int escolha = JOptionPane.showOptionDialog(null, "Escolha o tipo de roupa:", "Adicionar nova roupa",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null,
                opcoes, opcoes[0]);

        if (escolha == 0) {
            try {
                String nome = JOptionPane.showInputDialog("Nome da camiseta:");
                if (!nome.matches("[a-zA-Z]+")) {
                    throw new IllegalArgumentException("O nome deve ser composto apenas por letras");
                }

                double preco = Double.parseDouble(JOptionPane.showInputDialog("Preço da camiseta:"));
                if (preco <= 0) {
                    throw new Exception("O preço deve ser maior que zero");
                }

                String tamanho = JOptionPane.showInputDialog("Tamanho da camiseta:");
                if (!tamanho.matches("[a-zA-Z]+")) {
                    throw new Exception("O tamanho deve ser expressado apenas com palavras ou numeros!.");
                }

                Camiseta camiseta = new Camiseta(nome, preco, tamanho);
                estoque.add(camiseta);

                JOptionPane.showMessageDialog(null, "Camiseta adicionada com sucesso!");

            } catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } else if (escolha == 1) {
            try {
                String nome = JOptionPane.showInputDialog("Nome da calça:");
                if (!nome.matches("[a-zA-Z]+")) {
                    throw new IllegalArgumentException("O nome deve ser composto apenas por letras");
                }

                double preco = Double.parseDouble(JOptionPane.showInputDialog("Preço da calça:"));
                if (preco <= 0) {
                    throw new Exception("O preço deve ser maior que zero");
                }

                String tamanho = JOptionPane.showInputDialog("Tamanho da calça:");
                if (!tamanho.matches("[a-zA-Z]+")) {
                    throw new Exception("O tamanho deve ser expressado apenas com palavras ou numeros!.");
                }

                Calca calca = new Calca(nome, preco, tamanho);
                estoque.add(calca);
                JOptionPane.showMessageDialog(null, "Calça adicionada com sucesso!");
            } catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } else if (escolha == 2) {
            try {
                String nome = JOptionPane.showInputDialog("Nome do Sapato:");
                if (!nome.matches("[a-zA-Z]+")) {
                    throw new IllegalArgumentException("O nome deve ser composto apenas por letras");
                }

                double preco = Double.parseDouble(JOptionPane.showInputDialog("Preço do sapato:"));
                if (preco <= 0) {
                    throw new Exception("O preço deve ser maior que zero");
                }

                String tipoMaterial = JOptionPane.showInputDialog("Tipo de material do sapato:");
                if (!tipoMaterial.matches("[a-zA-Z]+")) {
                    throw new Exception("O tamanho deve ser expressado apenas com palavras ou numeros!.");
                }

                Sapato sapato = new Sapato(nome, preco, tipoMaterial);
                estoque.add(sapato);
                JOptionPane.showMessageDialog(null, "Sapato adicionado com sucesso!");

                JOptionPane.showMessageDialog(null, "Calça adicionada com sucesso!");
            } catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
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
