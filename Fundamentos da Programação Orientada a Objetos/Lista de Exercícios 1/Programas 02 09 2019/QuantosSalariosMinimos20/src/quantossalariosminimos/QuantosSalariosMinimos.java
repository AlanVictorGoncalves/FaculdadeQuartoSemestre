//20. Faça um programa que receba o valor do salário mínimo e o valor do salário de um funcionário, 
//calcule  mostre a quantidade de salários mínimos que ganha esse funcionário.
package quantossalariosminimos;

import javax.swing.JOptionPane;

public class QuantosSalariosMinimos {

    public static void main(String[] args) {
        
        double salmin, salfunc, quantsal;
        
        salmin = Double.parseDouble (   JOptionPane.showInputDialog("Digite o valor do salário mínimo: ")   );
        salfunc = Double.parseDouble (   JOptionPane.showInputDialog("Digite o valor do salário do funcionário: ")   );
        
        quantsal = salfunc / salmin;
        
        JOptionPane.showMessageDialog(null, " A quantidade de salários mínimos o funcionário recebe é: " + quantsal);
    }
    
}
