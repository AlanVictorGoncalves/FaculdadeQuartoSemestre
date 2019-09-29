
package javaapplication18;

import java.util.Scanner;

public class JavaApplication18 {

    public static void main(String[] args) {
        double nota1;
        double nota2;
        double media;
        Scanner leia;
        leia = new Scanner (System.in);
        System.out.print("Digite a nota da N1: ");
        nota1 = leia.nextDouble();
        System.out.print("Digite a nota da N2: ");
        nota2 = leia.nextDouble();
        media = (nota1 + nota2)/2;
        System.out.println("A sua média é: " + media);
        if  (media >= 7) {
            System.out.println("Está aprovado!");
        }
        else {
            System.out.println("Está em Exame!");
        }
        
        leia.close();
    }
    
}
