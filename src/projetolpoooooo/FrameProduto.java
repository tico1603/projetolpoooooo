import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FrameProduto
{
private Janela janela;
private Produto produto;
private JPanel painel;


    // Construtor
    FrameProduto(Janela janela, Produto produto) // precisa do frame gerado anteriormente
    {
        setJanela(janela);
        setProduto(produto);
        painel = new JPanel(new GridLayout(4,2)); // Necessista arrumar a quantidade de linhas e colunas alem dos itens a serem mostrados na tela e o botao de compra

        /*painel.add(new JLabel("Escrevi e corri"));
        painel.add(new JLabel("sera que corri"));
        painel.add(new JLabel("Vamos ver"));
        painel.add(new JLabel("kkk"));*/

        painel.add(new JLabel("Nome: " + produto.getNome())); 
        painel.add(new JLabel("Cor: " + produto.getCor()));                                 // 2
        painel.add(new JLabel("Descricao Tecnica: " + produto.getDescricaoTecnica()));      // 3


        if(produto instanceof Acessorio)
        {
            painel.add(new JLabel("Tipo: " + ((Acessorio)produto).getTipoAcessorio()));      // 4
        }
        else if(produto instanceof Tecnologia)
        {
            painel.add(new JLabel("Tipo: " + ((Tecnologia)produto).getTipoTecnologia()));
        }
        else 
        {
            painel.add(new JLabel("Tipo: " + ((DiaADia)produto).getTipoDiaADia()));
        }
        painel.add(new JLabel("Codigo do produto: " + produto.getIdProduto()));               // 5 
        painel.add(new JLabel("Quantidade: " + Integer.toString(produto.getQuantidade())));   // 6
        painel.add(new JLabel("Preco: " + Double.toString(produto.getPreco())));              // 7
        painel.add(new JLabel("Loja: ")); // + produto.getLoja()
        //painel.add()
        

        janela.removePainelAnterior();
        janela.setPainelAnterior(painel);
        janela.getFrame().add(painel);
        janela.getFrame().setVisible(true);
        
    }


    // Setters e Getters
    public void setJanela(Janela janela)
    {
        this.janela = janela;
    }
    public void setProduto(Produto produto)
    {
        this.produto = produto;
    }
}