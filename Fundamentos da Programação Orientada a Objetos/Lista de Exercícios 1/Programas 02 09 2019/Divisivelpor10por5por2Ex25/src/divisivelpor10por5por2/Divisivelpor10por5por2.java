/*
 25. Elabore um programa que leia um número e informe se ele é divisível por 10, por 5, por 2, ou se não é divisível por nenhum deles.
 */
package divisivelpor10por5por2;

import javax.swing.JOptionPane;

public class Divisivelpor10por5por2 {

    public static void main(String[] args) {
        
        int num;
        
        num = Integer.parseInt (   JOptionPane.showInputDialog("Digite um número: ")   );
        
        if (num % 10 == 0 && num % 5 == 0 && num % 2 == 0)   {
            JOptionPane.showMessageDialog(null, "É divisível por 10, 5 e 2 juntos!");
        }
        else  {
            JOptionPane.showMessageDialog(null, "Não é divisível por 10, 5 e 2 juntos!");
        }
        
    }
    
}
