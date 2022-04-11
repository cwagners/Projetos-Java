package menu;

import java.util.Scanner;
import entities.Conta;


public class Menu {
    Integer  numero, valor = 99;
    Double quantidadeDeposito = 0.0;
    String nome;
    Boolean definirSaldo = true;

    public void opcao(){
        Scanner sc = new Scanner(System.in);
        Conta conta = new Conta();
        System.out.println("Selecione uma opcao abaixo: \n");
        System.out.println("1 - Cadastrar Conta Corrente");
        System.out.println("2 - Crédito Conta Corrente");
        System.out.println("3 - Debito Conta Corrente");
        System.out.println("4 - Saldo Conta Corrente");
        System.out.println("5 - Alterar dados Conta Corrente");
        System.out.println("0 - Sair");
        this.valor = Integer.parseInt(sc.nextLine());
        System.out.println();
        while (this.valor > 0){
            switch (this.valor){
                case 1:
                    System.out.println("Informe o numero da conta corrente:");
                    numero = Integer.parseInt(sc.nextLine()) ;
                    System.out.println("Informe o seu nome:");
                     nome = sc.nextLine();
                    System.out.printf("Sr. %s  Deseja Informar um valor inicial para deposito na sua conta corrente: %d ? (True/False)\n", nome, numero);
                     definirSaldo = sc.nextBoolean();
                    if(definirSaldo){
                        System.out.printf("Sr. %s  Informe um valor inicial para deposito na sua conta corrente: %d ? \n", nome, numero);
                        quantidadeDeposito = sc.nextDouble();
                        conta.setSaldoDaConta(quantidadeDeposito);
                        conta.setNome(nome);
                        conta.setNumeroDaConta(numero);
                    }else{
                        conta.setSaldoDaConta(quantidadeDeposito);
                        conta.setNome(nome);
                        conta.setNumeroDaConta(numero);
                    }
                    System.out.println("Conta cadastrada!");
                    break;
                case 2:
                    System.out.println("Informe o valor a ser depositado: \n");
                    conta.credito(sc.nextDouble());
                    break;
                case 3:
                    System.out.println("Informe o valor a ser sacado: \n");
                    conta.debito(sc.nextDouble());
                    break;
                case 4:
                     System.out.printf("Conta: %d, Titular: %s, Saldo: %.2f%n", conta.getNumeroDaConta(), conta.getNome(), conta.getSaldoDaConta());
                     break;
                case 5:
                    Scanner scc = new Scanner(System.in);
                    System.out.println("Informe o seu nome:");
                    conta.setNome(scc.nextLine());
                    break;
                case 0:
                    System.out.println("Obrigado por utilizar o nosso sistema! ");
                    System.exit(0);
                    break;
                default:
                    System.out.println("opcao inválida!");
                    break;

            }
            System.out.println("Selecione uma opcao abaixo: \n");
            System.out.println("1 - Cadastrar Conta Corrente");
            System.out.println("2 - Crédito Conta Corrente");
            System.out.println("3 - Debito Conta Corrente");
            System.out.println("4 - Saldo Conta Corrente");
            System.out.println("5 - Alterar dados Conta Corrente");
            System.out.println("0 - Sair");
            this.valor = sc.nextInt();
        }

        sc.close();


    }

}
