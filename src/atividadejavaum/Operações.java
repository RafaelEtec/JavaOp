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
    public static void divideValores() {

        double V1, V2, Resp = 0;
        String aux = "";

        aux = JOptionPane.showInputDialog(null, "Insira o Dividendo: ");
        V1 = Double.parseDouble(aux);

        aux = JOptionPane.showInputDialog(null, "Insira o Divisor: ");
        V2 = Double.parseDouble(aux);

        Resp = (V1 / V2);

        JOptionPane.showMessageDialog(null, "O Resultado da Divisão é: " + Resp);
    }
    public static void mediaNota() {
        double nota1, nota2, trabalho, media = 0;
        String aux = "";
        
        aux = JOptionPane.showInputDialog(null, "Insira a primeira nota: ","Primeira nota",JOptionPane.PLAIN_MESSAGE);
        nota1 = Double.parseDouble(aux);
        
        aux = JOptionPane.showInputDialog(null, "Insira a Segunda nota: ","Segunda nota",JOptionPane.PLAIN_MESSAGE);
        nota2 = Double.parseDouble(aux);
        
        aux = JOptionPane.showInputDialog(null, "Insira a nota do Trabalho: ","Nota do Trabalho",JOptionPane.PLAIN_MESSAGE);
        trabalho = Double.parseDouble(aux);
        
        media = ( nota1 + nota2 + trabalho ) / 3;
        
        JOptionPane.showMessageDialog(null, "A sua média é de: " + media,"Cálculo da média do aluno",JOptionPane.INFORMATION_MESSAGE);
    }
}
