package Ex003;
import java.util.Scanner;

public class Main {
    //Exercicio 003
    //Faça um Programa que peça dois números e imprima a soma.
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        int a, b, c;


        System.out.printf("Entre com o primeiro número: ");
        a = scr.nextInt();

        System.out.printf("Entre com o segundo número: ");
        b = scr.nextInt();
        c = a +b;

        System.out.println("A soma de " + a + " e " + b + " é: " + c);

    }
}
