
//18. Escreva um programa para ler o raio de um círculo, calcular e imprimir o diâmetro, a circunferência, e a área do círculo. 
//diâmetro = 2 x raio
//circunferência = PI x raio2
//área = PI * raio2

package javaapplicationalan;

import javax.swing.JOptionPane;

public class JavaApplicationalan {

    public static void main(String[] args) {
        
        double raio, diam, area; 
        
        raio= Double.parseDouble (   JOptionPane.showInputDialog("Digite o Raio")   );
        
        diam = 2 * raio;
        area = Math.PI * (raio * raio);
      
        
        JOptionPane.showMessageDialog(null, " O Diâmetro é: " + diam);
        JOptionPane.showMessageDialog(null, " A Área é: " + area);

    }
    
}
