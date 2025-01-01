package Projects.Conta_banco;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome_cliente = "Amanda Sousa Fernandes";
        String tipo_conta = "Corrente";
        double saldo = 2500.50;
        int opcao = 0;

        System.out.println("""
                ***************************************************************
                
                Dados do cliente:
                Nome: %s
                Tipo de Conta: %s
                Saldo: R$ %.2f
                
                ***************************************************************
                
                
                Operações
                """.formatted(nome_cliente, tipo_conta, saldo));
        String menu = """
                ** Digite sua opção **
                1 - Consultar saldo
                2 - Transferir valor 
                3 - Receber valor 
                4 - Sair  
                """;
        Scanner scr = new Scanner(System.in);

        while (opcao!= 4){
            System.out.println(menu);
            opcao = scr.nextInt();

            if (opcao == 1 ){
                System.out.println("O Saldo da conta é: " + saldo);
            } else if (opcao ==  2 ) {
                System.out.println("Qual o valor você deseja transferir? ");
                double valor = scr.nextDouble();
                if (valor > saldo ) {
                    System.out.println("Saldo insuficiente");
                } else {
                    saldo -= valor;
                    System.out.println("Novo saldo: " + saldo);
                }
            } else if(opcao == 3) {
                System.out.println("Valor recebido: ");
                double valor = scr.nextDouble();
                saldo += valor;
                System.out.println("Novo saldo " + saldo);
            } else if (opcao != 4) {
                System.out.println("Opção inválida ");
            }
        }
    }

}
