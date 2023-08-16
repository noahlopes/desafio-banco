import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "Noah Lopes";
        String tipoConta = "Corrente";
        double saldo = 1599.99;
        int opcao = 0;

        System.out.println("*****************************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n*****************************");

        String menu = """
                \n** Digite sua opção **
                
                1 - Consultar saldo
                2 - Receber valor
                3 - Transferir valor
                4 - Sair""";

        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("Seu saldo atual é de R$ " + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual valor deseja depositar?");
                double deposito = leitura.nextDouble();
                saldo += deposito;
                System.out.println("Depósito de R$ %s feito. Você possui R$ %s de saldo".formatted(deposito, saldo));
            } else if (opcao == 3) {
                System.out.println("Qual valor você irá transferir?");
                double transferencia = leitura.nextDouble();
                if (transferencia > saldo) {
                    System.out.println("Você não possui esse valor para transferência. Saldo atual de R$ %s.".formatted(saldo));
                } else {
                    saldo = saldo - transferencia;
                    System.out.println("Transferência de R$ %s feita. Você possui R$ %s de saldo.".formatted(transferencia, saldo));
                }
            } else if (opcao != 4) {
                System.out.println("Opção inválida.");
            } else {
                System.out.println("Processo finalidado.\nTenha um bom dia!");
            }
        }
    }
}
