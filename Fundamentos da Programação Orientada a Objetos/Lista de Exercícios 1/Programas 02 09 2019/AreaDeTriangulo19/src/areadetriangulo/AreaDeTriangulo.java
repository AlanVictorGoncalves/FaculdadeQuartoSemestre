
//19. Faça um programa que receba a medida de dois ângulos de um triângulo, calcule e 
//mostre a medida do terceiro ângulo. Sabe-se que a soma dos ângulos de um triângulo é de 180°.

package areadetriangulo;

import javax.swing.JOptionPane;

public class AreaDeTriangulo {

  
    public static void main(String[] args) {
        
        double ang1, ang2, ang3; 
        
        ang1 = Double.parseDouble (   JOptionPane.showInputDialog("Digite o primeiro ângulo: ")   );
        ang2 = Double.parseDouble (   JOptionPane.showInputDialog("Digite o segundo ângulo: ")   );
        
        ang3 =  180 - (ang1 + ang2);
        
        JOptionPane.showMessageDialog(null, " O Terceiro Ângulo é: " + ang3);
    }
    
}
