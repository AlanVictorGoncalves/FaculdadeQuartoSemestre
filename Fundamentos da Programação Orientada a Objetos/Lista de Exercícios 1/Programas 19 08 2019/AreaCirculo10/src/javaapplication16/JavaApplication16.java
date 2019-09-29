
package javaapplication16;

import java.util.Scanner;

public class JavaApplication16 {

    public static void main(String[] args) {
        double raio;
        double areacirc;
        Scanner leia;
        leia = new Scanner (System.in);
        System.out.print("Digite o raio do circulo: ");
        raio = leia.nextDouble();
        areacirc = 3.14 * raio * raio;
        System.out.println("A area do circulo: " + areacirc);
        
        leia.close();
    }
    
}
