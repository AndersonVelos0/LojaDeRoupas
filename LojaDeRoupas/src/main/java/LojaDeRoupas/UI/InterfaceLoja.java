
package LojaDeRoupas.UI;

import javax.swing.JOptionPane;

/**
 *
 * @author Anderson Veloso, Eliel Vieira, Juliana Venancio
 */
public class InterfaceLoja {
  
    public static void main(String[] args) throws Exception {
        Fachada loja = new Fachada();
        while (true) {
            String[] opcoes = {"Adicionar roupa", "Listar roupas", "Sair"};
            int escolha = JOptionPane.showOptionDialog(null, "O que deseja fazer?", "Loja de roupas",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null,
                    opcoes, opcoes[0]);
            if (escolha == 0) {
                loja.adicionarRoupaGUI();
            } else if (escolha == 1) {
                loja.listarRoupasGUI();
            } else if (escolha == 2) {
                break;
            }
        }
    }
}
