
package javaapplication15;

import java.util.Scanner;

public class JavaApplication15 {
   
    public static void main(String args[]) {
        double areaquad;
        Scanner leia;
        leia = new Scanner (System.in);
        System.out.print("Digite um lado do quadrado: ");
        areaquad = leia.nextDouble();
        areaquad = areaquad * areaquad;
        System.out.println("A area do quadrado: " + areaquad);
        
        leia.close();
    }
    
}
