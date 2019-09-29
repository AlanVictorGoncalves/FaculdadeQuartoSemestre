
package javaapplication19;

import java.util.Scanner;

public class JavaApplication19 {


    public static void main(String[] args) {
        int num;
        Scanner leia;
        leia = new Scanner (System.in);
        System.out.print("Digite um número: ");
        num = leia.nextInt();
        if  (num % 2 == 0) {
            System.out.println("Par!");
        }
        else {
            System.out.println("Ímpar!");
        }
        
        leia.close();
    }
    
}
