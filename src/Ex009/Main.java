package Ex009;
import java.util.Scanner;

    public class Main {
        //Exercicio 009
        //Faça um Programa que peça a temperatura em graus Farenheit, transforme e mostre a temperatura em graus Celsius. C = (5 * (F-32) / 9).

        public static void main(String[] args){
            Scanner scr = new Scanner(System.in);
            double a, b;

            System.out.printf("Entre com valor em Farenheit: ");
            a = scr.nextDouble();

            b = (((a-32)*5)/9);
            System.out.printf("Transformado em graus Celsius é: " + b);

        }
    }
