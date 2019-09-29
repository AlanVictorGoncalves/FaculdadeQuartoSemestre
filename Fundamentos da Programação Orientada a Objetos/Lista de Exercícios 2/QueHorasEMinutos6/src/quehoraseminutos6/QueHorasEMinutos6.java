/*
6. Escreva uma solução (algoritmo, fluxograma ou programa em Java)  que leia dois valores inteiros representando,
respectivamente, um valor de hora e um de minutos e informe quantos minutos se passaram deste o início do dia.
 */
package quehoraseminutos6;

import java.util.Scanner;

public class QueHorasEMinutos6 {

    public static void main(String[] args) {
       
        int horas, min, minpassados;
        Scanner leia;
        leia = new Scanner (System.in);
        
        System.out.print("Digite a hora: ");
        horas = leia.nextInt();
        System.out.print("Digite o minuto: ");
        min = leia.nextInt();
        
        minpassados = horas * 60 + min;
        
        System.out.print("Passou " + minpassados + " minutos dês o começo do dia.");

        leia.close();
        
    }
    
}
