import conta.modelos.Conta;
import conta.modelos.Pessoa;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("***********************");
        System.out.println("Vamos dar início a criação de sua conta");
        System.out.println("Informe seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Informe seu sobrenome: ");
        String sobrenome = scanner.nextLine();
        System.out.println("Informe seu CPF: ");
        String cpf = scanner.nextLine();

        Pessoa pessoa = new Pessoa(nome, sobrenome, cpf);

        Conta conta = new Conta(pessoa, 0);
        System.out.println("***********************");
        System.out.println("Dados inicias:\n");
        System.out.printf("Nome do cliente: %s %s\n", conta.getPessoa().getNome(), conta.getPessoa().getSobrenome());
        System.out.println("CPF: " + conta.getPessoa().getCpf());
        System.out.println("***********************");

        int operacao = 0;

        while (operacao != 4) {
            System.out.println("Operações");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Realizar depósito");
            System.out.println("3 - Sacar");
            System.out.println("4 - Encerrar");
            operacao = scanner.nextInt();

            if (operacao != 1 && operacao != 2 && operacao != 3 && operacao != 4) {
                System.out.println("Selecione uma opção válida!");
            }

            if (operacao == 1) {
                conta.imprimeSaldo();
            }

            if (operacao == 2) {
                System.out.println("Qual valor você deseja depositar?");
                double valor = scanner.nextDouble();
                conta.deposita(valor);
            }

            if (operacao == 3) {
                System.out.println("Qual valor você deseja sacar?");
                double valor = scanner.nextDouble();
                conta.saca(valor);
            }
        }

        scanner.close();
        System.out.println("Volte sempre!");
    }
}