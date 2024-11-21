package Ex006;

import java.util.Scanner;

public class Main {
    //Exercicio 006
    //Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.

    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        double a, b;

        System.out.printf("Entre com raio do circulo: ");
        a = scr.nextDouble();

        b = 3.14 * (a * a);
        System.out.printf("A área do circulo é: " +b);

    }
}
