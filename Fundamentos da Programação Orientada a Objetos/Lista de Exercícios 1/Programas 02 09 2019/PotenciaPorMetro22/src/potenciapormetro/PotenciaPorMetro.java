/*
 22. Sabe-se que para iluminar de maneira correta os cômodos de uma casa, para cada m2, 
deve-se usar 18W de potência. Faça um programa que receba as duas dimensões de um cômodo (em metros),
calcule e mostre a sua área (em m2) e a potência de iluminação que deve ser utilizada.
 */
package potenciapormetro;

import javax.swing.JOptionPane;

public class PotenciaPorMetro {

    public static void main(String[] args) {
        
        double lado1, lado2, poten, area;
        
        lado1 = Double.parseDouble (   JOptionPane.showInputDialog("Digite o primeiro lado da casa: ")   );
        lado2 = Double.parseDouble (   JOptionPane.showInputDialog("Digite o segundo lado da casa: ")   );
        
        area = lado1 * lado2;
        poten = 18 * area;
        
        JOptionPane.showMessageDialog(null, " A área da casa é: " + area);
        JOptionPane.showMessageDialog(null, " A potência de iluminação que deve ser utilizada: " + poten);
        
    }
    
}
