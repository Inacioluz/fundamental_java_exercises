package Ex012;
import java.util.Scanner;

public class Main {
    //Exercicio 012
    //Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal, usando a seguinte fórmula: (72.7*altura) - 58
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        System.out.printf("Entre com sua altura: ");
        double i = scr.nextDouble();

        double peso = (72.7 * i) - 58;
        System.out.println("Seu peso ideal é: " + peso);

        scr.close();
    }
}
