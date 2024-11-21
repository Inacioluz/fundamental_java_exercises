package Ex003;

import java.util.Scanner;

public class Main {
    //Exercicio 003
    //Faça um Programa que peça dois números e imprima a soma.
    public static void main(String[] args) {
    Scanner scr = new Scanner(System.in);
    int a, b, c;
    int soma;

    System.out.printf("Entre com qulaquer número: ");
    a = scr.nextInt();

    System.out.printf("Entre com qulaquer número: ");
    b = scr.nextInt();

    System.out.printf("Entre com qulaquer número: ");
    c = scr.nextInt();

    soma = a + b + c;
    System.out.println("A soma dos números " + a +", " +b +", "+ c +  " é: " + soma);


    }
}
