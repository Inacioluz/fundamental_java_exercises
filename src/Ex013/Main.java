package Ex013;
import java.util.Scanner;

public class Main {
    //Exercicio 013
    //Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo que calcule seu peso ideal,
    // utilizando as seguintes fórmulas: Para homens: (72.7h) - 58 Para mulheres: (62.1h) - 44.7
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);

        System.out.printf("Você é homem ou mulher 'H', 'M' ? ");
        char g = scr.next().toUpperCase().charAt(0);

        while(g != 'M' && g != 'H'){
            System.out.print("Entrada inválida!!!! digite 'M' ou 'H': "  );
            g = scr.next().toUpperCase().charAt(0);
        }
        System.out.print("Digite sua altura em metros: ");
        double a = scr.nextDouble();
        double peso = (g == 'M') ? (72.7 * a) - 58 : (62.1 * a) - 44.7;

        if (g== 'M') {
            System.out.printf("Olá, homem! O peso ideal para sua altura é: %.2fKg%n", peso);
        } else if(g == 'H'){
            System.out.printf("Olá, mulher! O peso ideal para sua altura é: %.2fKg%n", peso);
        } else {
            System.out.printf("Digite 'M' ou 'H' acima");
        }
    }
}