
package javaapplication14;

import java.util.Scanner;

public class JavaApplication14 {

    
    public static void main(String args[]) {
        String nome;
        byte idade;
        double salario;
        Scanner leia;
        leia = new Scanner (System.in);
        System.out.print("Dig. nome: ");
        nome = leia.next();
        System.out.print("Dig. idade: ");
        idade = leia.nextByte();
        System.out.print("Dig. salario: ");
        salario = leia.nextDouble();
        
        leia.close();
    }
    
}
