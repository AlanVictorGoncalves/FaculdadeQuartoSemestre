/*
 14.  Faça um programa que receba a idade de trezentas pessoas, calcule e exiba a quantidade de pessoas 
em cada faixa etária; e a porcentagem de cada faixa etária em relação ao total de pessoas.

As faixas etárias são:

1 a 15 anos

16 a 30 anos

31 a 45 anos

46 a 60 anos

igual a 61 anos
 */
package cadafaixaetaria14;

import java.util.Scanner;

public class CadaFaixaEtaria14 {

    public static void main(String[] args) {

        int idade[], i, faixa15 = 0, faixa30 = 0, faixa45 = 0, faixa60 = 0, faixa61 = 0;
        idade = new int[300];
        
        Scanner leia;
        leia = new Scanner (System.in);
        
        for (i=0; i<7; i++)   {
            System.out.print("Digite a idade da " + (i+1) + "ª pessoa: ");
            idade[i] = leia.nextInt();
            
            if (idade[i] > 0 && idade[i] < 16) {
                faixa15++;           
            }
            else if (idade[i] > 0 && idade[i] < 31) {
                faixa30++;
            }
            else if (idade[i] > 0 && idade[i] < 46) {
                faixa45++; 
            }   
            else if (idade[i] > 0 && idade[i] < 61) {
                faixa60++; 
            } 
            else if (idade[i] == 61 ) {
                faixa61++; 
            }
        }
            
        System.out.println("Há " + faixa15 + " pessoas com a faixa etária de 1 a 15 anos! ");
        System.out.println("Há " + faixa30 + " pessoas com a faixa etária de 16 a 30 anos! ");
        System.out.println("Há " + faixa45 + " pessoas com a faixa etária de 31 a 45 anos! ");
        System.out.println("Há " + faixa60 + " pessoas com a faixa etária de 46 a 60 anos! ");
        System.out.println("Há " + faixa61 + " pessoas com a faixa etária igual a 61 anos! ");
    
        leia.close();

    }
}
