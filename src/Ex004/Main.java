package Ex004;
import java.util.Scanner;

public class Main {
    //Exercicio 004
    //Faça um Programa que peça as 4 notas bimestrais e mostre a média.
    public static void main(String[] args){
    Scanner scr = new Scanner(System.in);
    int a, b, c, d, e;

    System.out.printf("Entre com a primeria nota: ");
    a = scr.nextInt();

    System.out.printf("Entre com a primeria nota: ");
     b = scr.nextInt();

    System.out.printf("Entre com a primeria nota: ");
    c = scr.nextInt();

    System.out.printf("Entre com a primeria nota: ");
    d = scr.nextInt();
    e = (a + b + c + d) / 4;

    System.out.println("a médias das notas " + a +"," + b + "," + c + "," + d + "," + "é: " + e);
    }
}
