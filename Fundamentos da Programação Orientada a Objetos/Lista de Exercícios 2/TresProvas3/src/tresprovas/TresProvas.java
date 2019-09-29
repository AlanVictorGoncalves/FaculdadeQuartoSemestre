/*
 3. O sistema de avaliação de uma determinada disciplina é composto por três provas.
A primeira prova tem peso 2, a segunda tem peso 3 e a terceira tem peso 5.
Considerando que a média para aprovação é 8.0, faça um programa para calcular a média final
de um aluno desta disciplina e dizer se o aluno foi aprovado ou não.
 */
package tresprovas;
 
import javax.swing.JOptionPane;

public class TresProvas {

    public static void main(String[] args) {
       
        float p1, p2, p3, total;
                
        p1 = Float.parseFloat (   JOptionPane.showInputDialog("Digite a nota da primeira prova: ")   );
        p2 = Float.parseFloat (   JOptionPane.showInputDialog("Digite a nota da segunda prova: ")   );
        p3 = Float.parseFloat (   JOptionPane.showInputDialog("Digite a nota da terceira prova: ")   );
        
        p1 = p1 * 2;
        p2 = p2 * 3;
        p3 = p3 * 5;
        total = (p1 + p2 + p3) / 10;
        
        if (total >= 8) {
            JOptionPane.showMessageDialog(null, " Aprovado! " + total);
        }
        else    {
            JOptionPane.showMessageDialog(null, " Reprovado! "+ total);
        }
    }
    
}
