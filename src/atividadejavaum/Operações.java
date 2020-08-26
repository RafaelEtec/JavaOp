package atividadejavaum;

import javax.swing.*;

public class Operações {

    public static void multiplicaValores() {

        double V1, V2, Resp = 0;
        String aux = "";

        aux = JOptionPane.showInputDialog(null, "Insira o Primeiro valor: ");
        V1 = Double.parseDouble(aux);

        aux = JOptionPane.showInputDialog(null, "Insira o Segundo valor: ");
        V2 = Double.parseDouble(aux);

        Resp = (V1 * V2);

        JOptionPane.showMessageDialog(null, "O Resultado da multiplicação é: " + Resp);
    }

    public static void somaValores() {

        double V1, V2, Resp = 0;
        String aux = "";

        aux = JOptionPane.showInputDialog(null, "Insira o Primeiro Valor: ");
        V1 = Double.parseDouble(aux);

        aux = JOptionPane.showInputDialog(null, "Insira o Segundo valor: ");
        V2 = Double.parseDouble(aux);

        Resp = (V1 + V2);

        JOptionPane.showMessageDialog(null, "O Resultado da Soma é: " + Resp);
    }

    public static void subtraiValores() {

        double V1, V2, Resp = 0;
        String aux = "";

        aux = JOptionPane.showInputDialog(null, "Insira o Primeiro valor: ");
        V1 = Double.parseDouble(aux);

        aux = JOptionPane.showInputDialog(null, "Insira o Segundo valor: ");
        V2 = Double.parseDouble(aux);

        Resp = (V1 - V2);

        JOptionPane.showMessageDialog(null, "O Resultado da Subtração é: " + Resp);
    }
}
