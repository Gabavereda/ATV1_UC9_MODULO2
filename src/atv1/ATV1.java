package atv1;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ATV1 {

    public static void main(String[] args) {

        Double valorVenda;
        Double percentualDesconto;

        JFrame janela = new JFrame();
        janela.setTitle("MVP");
        janela.setLayout(new FlowLayout());
        janela.setSize(300, 150);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLocationRelativeTo(null);

        //Label
        JLabel valor = new JLabel();
        valor.setText("Informe o valor da venda");
        janela.add(valor);

        //Campo
        JTextField campo = new JTextField(15);
        janela.add(campo);

        //botao
        JButton botao = new JButton();
        botao.setText(" Enviar");
        janela.add(botao);

        botao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obtém o valor do campo de texto e converte para Double
                double valorVenda = Double.parseDouble(campo.getText());

                if (valorVenda > 500.0) {
                    double percentualDesconto = Double.parseDouble(JOptionPane.showInputDialog(janela, "Informe o percentual de desconto", "Informe o Desconto", JOptionPane.PLAIN_MESSAGE));

                    //calculo desconto                
                    double desconto = (valorVenda * percentualDesconto) / 100.0;

                    double valorComDesconto = valorVenda - desconto;

                    //resultado desconto
                    JOptionPane.showMessageDialog(janela, "O valor total da venda com desconto é: " + valorComDesconto, "Valor com desconto", 1);
                } else {
                    //resultado sem desconto
                    JOptionPane.showMessageDialog(janela, "O valor total da venda é: " + valorVenda, "Valor total", 1);
                }
            }
        });

        janela.setVisible(true);
    }
}
