/*
 8. Considerando o sistema de avaliação das médias a seguir, escreva um programa que
leia o nome e a média de um aluno, e escreva o conceito correspondente e a mensagem: 
“APROVADO” se o conceito for A, B, ou C e “REPROVADO” se o conceito for D ou E.
Média  /  Conceito

< 4.0 - E

>= 4.0 e < 6.0 - D

>= 6.0 e < 7.5 - C

>= 7.5 e < 9.0 - B

>= 9.0 - A
 */
package avaliacaomedia8;

import java.util.Scanner;

public class AvaliacaoMedia8 {

    public static void main(String[] args) {
        
        float media;
        String nome;
        
        Scanner leia;
        leia = new Scanner (System.in);

        System.out.print("Digite nome do aluno: ");
        nome = leia.next();

        System.out.print("Digite a média do aluno: ");
        media = leia.nextFloat();
        
        if (media < 4.0) {
            System.out.print("Conceito E: Reprovado!"); 
        }
        else if (media < 6.0) {
            System.out.print("Conceito D: Reprovado!"); 
        }
        else if (media < 7.5) {
            System.out.print("Conceito C: Aprovado!");  
        }
        else if (media < 9.0) {
            System.out.print("Conceito B: Aprovado!");  
        }
        else if (media >= 9.0) {
            System.out.print("Conceito A: Aprovado!");
        }
  
        leia.close();
    }
}
