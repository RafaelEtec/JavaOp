package atividadejavaum;

import javax.swing.*;

public class UtilizandoReplace {

    public static void main(String[] args) {

        double num1, num2, resposta = 0.0;
        String aux = " ";

        aux = JOptionPane.showInputDialog(null, "Insira a primeira nota: ", "Primeira nota", JOptionPane.PLAIN_MESSAGE);
        aux = aux.replace(',', '.');
        num1 = Double.parseDouble(aux);

        aux = JOptionPane.showInputDialog(null, "Insira a Segunda nota: ", "Segunda nota", JOptionPane.PLAIN_MESSAGE);
        aux = aux.replace(',', '.');
        num2 = Double.parseDouble(aux);

        resposta = num1 / num2;

        resposta = resposta * 100;
        resposta = Math.ceil(resposta);
        resposta = resposta / 100;

        JOptionPane.showMessageDialog(null, "A resposta é: " + resposta);
    }
}
