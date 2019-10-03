/*
 12. De acordo com o artigo 130 da Consolidação das Leis de Trabalhos (CLT), o trabalhador que tem 
carteira assinada tem direito a 30 dias de férias remuneradas depois de completar 12 meses seguidos na 
empresa, podendo esse período se menor se houver faltas injustificadas, conforme relação abaixo.

- 30 dias corridos de férias, quando não houver mais de cinco faltas no serviço;

- 24 dias corridos de férias, quando houver de 6 a 14 faltas;

- 18 dias corridos de férias, quando houver de 15 a 23 faltas;

- 12 dias corridos de férias, quando houver de 24 a 32 faltas;

Faça um programa que informe a quantidade de dias que um funcionário terá de férias.
 */
package feriasdaclt12;

import java.util.Scanner;

public class FeriasdaCLT12 {

    public static void main(String[] args) {
        
        int faltas;
        
        Scanner leia;
        leia = new Scanner (System.in);
        
        System.out.print("Digite a quantidade de faltas que o trabalhador tem: ");
        faltas = leia.nextInt();
        
        if (faltas < 6) {
            System.out.println("30 dias corridos de férias! "); 
        }
        else if (faltas < 15){
            System.out.println("24 dias corridos de férias! ");
        }
        else if (faltas < 24) {
            System.out.println("18 dias corridos de férias! "); 
        }
        else if (faltas < 33) {
            System.out.println("12 dias corridos de férias! "); 
        }
        else {
            System.out.println("Não há dados a respeito de acima de 32 faltas! ");    
        }

        leia.close();

    }
}
