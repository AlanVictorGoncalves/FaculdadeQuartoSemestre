
package calcularimc;

import java.util.Scanner;


public class CalcularIMC {

    
    public static void main(String[] args) {
        double altura;
        double peso;
        double imc;
        Scanner leia;
        leia = new Scanner (System.in);
        System.out.print("Digite o peso: ");
        peso = leia.nextDouble();
        System.out.print("Digite a altura: ");
        altura = leia.nextDouble();
        imc = peso / (altura * altura);
        System.out.println("O IMC é: " + imc);
        
        leia.close();
    }
    
}
