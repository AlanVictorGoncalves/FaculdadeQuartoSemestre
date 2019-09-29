/*
15. Foi feita uma pesquisa entre os habitantes de uma região e coletados os dados de altura e sexo (0=masc, 1=fem) das pessoas. Faça um programa que leia os dados de 50 pessoas e no final, informe:
- A maior e a menor altura encontrada

- A média de altura das mulheres

- A média de altura da população

- O percentual de homens na população
 */
package alturadaspessoas15;

import java.util.Scanner;

public class AlturaDasPessoas15 {

    public static void main(String[] args) {

        int sexo, quanthomem = 0, quantmulher = 0, i;
        float althomem[], altmulher[], somaalthom = 0, somaaltmul = 0, mediamulher, mediahomem, porchomem;
        althomem = new float[50];
        altmulher = new float[50];
        
        Scanner leia;
        leia = new Scanner (System.in);
        
        for (i=0; i<50; i++)   {
            System.out.print("Digite o sexo da " + (i+1) + "ª pessoa (0 = masc, 1=fem: ");
            sexo = leia.nextInt();
            if (sexo == 0)  {
                System.out.print("Digite a altura da " + (i+1) + "ª pessoa: ");
                althomem[i] = leia.nextFloat();  
                quanthomem++;
                somaalthom = somaalthom + althomem[i];
            }
            if (sexo == 1)  {
                System.out.print("Digite a altura da " + (i+1) + "ª pessoa: ");
                altmulher[i] = leia.nextFloat();  
                quantmulher++;
                somaaltmul = somaaltmul + altmulher[i];
            }
            
    }
        
        mediamulher = somaaltmul / quantmulher;
        mediahomem = somaalthom / quanthomem;
    
    }
    
}
