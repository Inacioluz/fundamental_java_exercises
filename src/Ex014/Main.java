package Ex014;
import java.util.Scanner;

public class Main {
//    Exercicio 014
//    João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho.
//    Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do estado de São Paulo (50 quilos) deve pagar uma multa de R$ 4,00 por quilo excedente.
//    João precisa que você faça um programa que leia a variável peso (peso de peixes) e calcule o excesso.
//    Gravar na variável excesso a quantidade de quilos além do limite e na variável multa o valor da multa que João deverá pagar. Imprima os dados do programa com as mensagens adequadas.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double LIMITE = 50.0;
        double VALOR_MULTA = 4.0;

        System.out.println("Entre com o KG do peixe: ");
        double PESO = sc.nextDouble();

        double EXCESSO = 0;
        double MULTA = 0;
        double TOTAL = 0;

        if (PESO > LIMITE){
            EXCESSO = PESO - LIMITE;
            MULTA = EXCESSO * VALOR_MULTA;
            TOTAL = PESO + MULTA;

            System.out.println( "Peso excedente: " + EXCESSO + " KG" + " Total: " + TOTAL);
            System.out.println( "Você foi taxado em um valor de : " + MULTA );
        } else {
            System.out.println("Peso dentro do limite. Nenhuma multa, Peso: " + PESO);
        }
    }
}
