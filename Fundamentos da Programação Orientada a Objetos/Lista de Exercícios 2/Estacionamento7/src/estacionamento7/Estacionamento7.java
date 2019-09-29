/*
 7. (Fonte: thehuxley.com) Marcella é uma pequena empreendedora que comprou um terreno
próximo ao shopping e o transformou em um estacionamento privativo com 42 vagas. 
Para atrair mais clientes, ela cobra apenas R$ 1.75 por cada carro sem limite de tempo. 
Ela está fazendo os cálculos de quanto pretende faturar hoje e você pode ajudá-la 
escrevendo uma solução (algoritmo, fluxograma ou programa em Java) que receba como entrada 
a quantidade de veículos estacionados no momento, e exiba quanto ela ainda pode ganhar caso 
as vagas que estão disponíveis sejam ocupadas.
 */
package estacionamento7;

import java.util.Scanner;

public class Estacionamento7 {

    public static void main(String[] args) {
        
        float ganho, casoocupado;
        int vagas = 42, vagasocup;
       
        Scanner leia;
        leia = new Scanner (System.in);
        
        System.out.print("Digite o número de vagas ocupadas: ");
        vagasocup = leia.nextInt();
       
        ganho = (float) (1.75 * vagasocup);
        
        casoocupado = (float) (1.75 * (42 - vagasocup));
        
        System.out.println("O faturamento de hoje: " + ganho);
        System.out.println("O faturamento das vagas que ainda não foram prenchidas, caso forem: " + casoocupado);

        leia.close();
    }
    
}
