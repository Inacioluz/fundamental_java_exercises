package Ex007;

import java.util.Scanner;

public class Main {
    //Exercicio 007
    //Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        double a, b;

        System.out.printf("Entre com um número para calcular a área do quadrado: ");
        a = scr.nextDouble();
        b = a * a;

        System.out.println("A área do quadrado é: " + b);
        System.out.println("Agora calculando o sobro da área : " + b * 2);

    }
}
