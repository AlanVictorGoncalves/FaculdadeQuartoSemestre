/*
 4. Faça um programa leia o ano atual e o ano de nascimento de uma pessoa.
Escrever uma mensagem que diga se ela poderá ou não votar este ano 
(não é necessário considerar o mês em que a pessoa nasceu).
 */
package podevotar;

import javax.swing.JOptionPane;

public class PodeVotar {

    public static void main(String[] args) {
       
        int datatual, datanasc, idade;
        
        datatual = Integer.parseInt (   JOptionPane.showInputDialog("Digite o ano atual: ")   );
        datanasc = Integer.parseInt (   JOptionPane.showInputDialog("Digite o ano nascimento: ")   );
        
        idade = datatual - datanasc;
        
        if (idade >= 18)    {
            JOptionPane.showMessageDialog(null, " Pode Votar!");
        }
        else    {
            JOptionPane.showMessageDialog(null, " Não Poderá Votar!");
        }
    }
    
}
