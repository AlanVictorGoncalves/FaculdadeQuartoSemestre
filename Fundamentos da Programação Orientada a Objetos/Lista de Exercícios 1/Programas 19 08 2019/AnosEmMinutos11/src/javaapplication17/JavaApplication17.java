
package javaapplication17;

import java.util.Scanner;

public class JavaApplication17 {

    public static void main(String[] args) {
        int idade;
        int idademinutos;
        Scanner leia;
        leia = new Scanner (System.in);
        System.out.print("Digite a idade da pessoa: ");
        idade = leia.nextInt();
        idademinutos = idade * 525600;
        System.out.println("A idade em minutos: " + idademinutos);
        
        leia.close();
    }
    
}
