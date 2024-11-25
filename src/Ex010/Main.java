package Ex010;
import java.util.Scanner;

public class Main {
    //Exercicio 010
    //Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Farenheit.
    public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    double a, b;

    System.out.printf("Entre com um valor em Graus Celsius: ");
    a = scn.nextDouble();

    b = ((((double)9/5)*a)+32);
    System.out.println("Tranformando o valor de Graus em Farenheit: " + b);


    }
}
