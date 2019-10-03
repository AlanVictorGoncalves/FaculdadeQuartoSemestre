/*
15. Foi feita uma pesquisa entre os habitantes de uma região e coletados os dados de altura e sexo (0=masc, 1=fem) das pessoas. 
Faça um programa que leia os dados de 50 pessoas e no final, informe:
- A maior e a menor altura encontrada

- A média de altura das mulheres

- A média de altura da população

- O percentual de homens na população
 */
package alturadaspessoas15;

import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;
import javax.xml.transform.sax.SAXResult;

public class AlturaDasPessoas15 {

    public static void main(String[] args) {

        int sexo, quanthomem = 0, quantmulher = 0, i = 0, n = 5;
        float althomem[], altmulher[], somaalthom = 0, somaaltmul = 0, mediamulher, porchomem, mediapopul;
        althomem = new float[n];
        altmulher = new float[n];
        float maioraltmul = altmulher[0], menoraltmul = altmulher[0], maioralthom = althomem[0], menoralthom = althomem[0];
        float maioralt = maioraltmul, menoralt = menoraltmul;
        Scanner leia;
        leia = new Scanner (System.in);
        
        while (i <n)           { 
            System.out.print("Digite o sexo da " + (i+1) + "ª pessoa (0 = masc, 1=fem): ");
            sexo = leia.nextInt();
            if (sexo == 0)  {
                System.out.print("Digite a altura da " + (i+1) + "ª pessoa: ");
                althomem[i] = leia.nextFloat();  
                quanthomem++;
                somaalthom = somaalthom + althomem[i];
                if (althomem[i] > maioralthom)
                    maioralthom = althomem[i];
                if (althomem[i] < menoralthom)
                    menoralthom = althomem[i];
                i++;
            }
            if (sexo == 1)  {
                System.out.print("Digite a altura da " + (i+1) + "ª pessoa: ");
                altmulher[i] = leia.nextFloat();  
                quantmulher++;
                somaaltmul = somaaltmul + altmulher[i];
                if (altmulher[i] > maioraltmul)
                    maioraltmul = altmulher[i];
                if (altmulher[i] < menoraltmul)
                    menoraltmul = altmulher[i];
                i++;
            }

            if (maioraltmul > maioralthom)
                maioralt = maioraltmul;
            else
                maioralt = maioralthom;

            if (menoraltmul < menoralthom)
                menoralt = menoraltmul;
            else
                menoralt = menoralthom;
        }
        
        mediamulher = somaaltmul / quantmulher;

        mediapopul = (somaaltmul + somaalthom) / n;

        porchomem = (n/quanthomem) * 100;
        
        System.out.println("A maior altura encontrada é: " + maioralt);
        System.out.println("A menor altura encontrada é: " + menoralt);
        System.out.println("A média de altura das mulheres é: " + mediamulher);
        System.out.println("A média de altura da população é: " + mediapopul);
        System.out.println("O porcentual de homens na população é: " + porchomem);

        leia.close();

    }
}
