/*
 21. Faça um programa que recebe o custo de um espetáculo teatral e o preço do convite desse espetáculo.
O Algoritmo deve calcular e mostrar a quantidade de convites que devem ser vendidos para que pelo menos 
o custo do espetáculo seja alcançado.
 */
package espetaculoteatral;

import javax.swing.JOptionPane;

public class EspetaculoTeatral {

    public static void main(String[] args) {
        
        double custo, convit, totalconv;
        
        custo = Double.parseDouble (   JOptionPane.showInputDialog("Digite o custo do espetáculo: ")   );
        convit = Double.parseDouble (   JOptionPane.showInputDialog("Digite o valor do convite do espetáculo: ")   );
        
        totalconv = custo / convit;
        
        JOptionPane.showMessageDialog(null, " A quantidade de convites necessário para pagar o espetáculo é: " + totalconv);
        
    }
    
}
