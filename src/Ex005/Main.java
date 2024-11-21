package Ex005;
import java.util.Scanner;

public class Main {
    //Exercicio 005
    //Faça um Programa que converta metros para centímetros.
    public static void main(String[] args){
    Scanner scr = new Scanner(System.in);
    double s, a;

    System.out.printf("Entre com um número em metros: ");
    s = scr.nextDouble();
    a = s * 100;

    System.out.println("o número em metros é: " + a + "cm");

    }
}
