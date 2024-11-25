package Ex011;
import java.util.Scanner;

public class Main {
    //Exercicio 011
    //Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:
    // o produto do dobro do primeiro com metade do segundo. a soma do triplo do primeiro com o terceiro.
    // o terceiro elevado ao cubo.
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int a, b;
        double c;

        System.out.printf("Entre com um o primeiro número: ");
        a = scn.nextInt();

        System.out.printf("Entre com um o Segundo número: ");
        b = scn.nextInt();

        System.out.printf("Entre com um o Terceiro número: ");
        c = scn.nextDouble();

        int d = ((a*2)+(b/2));
        double e = ((c*3)+(a*3));


        System.out.println("dobro do primeiro com metade do segundo: " + d);
        System.out.println("soma do triplo do primeiro com o terceiro: " + e);


    }
}
