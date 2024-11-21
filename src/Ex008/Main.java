package Ex008;

import java.util.Scanner;

public class Main {
    //Exercicio 008
    //Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês.
    // Calcule e mostre o total do seu salário no referido mês.

    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        double a, b;

        System.out.printf("Me informe o valor que você ganha por hora: ");
        a = scr.nextDouble();

        b = (((a * 8)*5)*4);
        System.out.println("Levando em consideração que você trabalha 8h por dia e 44 semanais durnate 4 semanas");
        System.out.println("Você ganha: " + b + "R$");

    }
}
