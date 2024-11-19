package Ex002;
import java.util.Scanner;
public class Main {

    //Exercicio 002
    //Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].
    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int a, b, c;


    System.out.printf("Entre com um número: ");
    a = ler.nextInt();

    System.out.println("O número informado é: " + a);
//
//    System.out.printf("Entre com um segundo número: ");
//    b = ler.nextInt();
//
//    c = a + b;
//
//    System.out.println("A soma dos número é: " + c);
    }
}
