/*
 5. Faça um programa que leia um número inteiro e imprima o seu antecessor (inteiro anterior) 
e o seu sucessor (inteiro posterior).
 */
package AnterEPoster5;

import java.util.Scanner;

public class AnterEPoster5 {

    
    
    public static void main(String[] args) {
        
        int num, ant, suc;
        Scanner leia;
        leia = new Scanner (System.in);
        
        System.out.print("Digite um número: ");
        num = leia.nextInt();
        
        ant = num - 1;
        suc = num + 1;
        
        System.out.println("O antecessor é: " + ant);
        System.out.println("O sucessor é: " + suc);
        
        leia.close();
    }
    
}