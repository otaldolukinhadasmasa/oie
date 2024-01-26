package Programa;
import java.util.Locale;
import java.util.Scanner;

import Entidade.Conta;

public class App {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Conta conta;
        
        System.out.println("Informe o numero da conta:");
        int number = sc.nextInt();
        System.out.println("Informe o nome:");
        String nome = sc.nextLine();
        nome = sc.nextLine();
        System.out.println("ha um deposito inicial?(s/n)");
        char sn = sc.next().charAt(0);

        if (sn == 's'){
            System.out.println("Informe o valor do deposito inicial:");
            double depositoInicial = sc.nextDouble();
            conta = new Conta(number, nome, depositoInicial);
        } else {
            conta = new Conta(number, nome);
        }

        System.out.println();
        System.out.println("Conta");
        System.out.println(conta);

        System.out.println();
        System.out.print("Informe um valor para deposito:");
        double valorDeposito = sc.nextDouble();
        conta.deposito(valorDeposito);

        System.out.println();
        System.out.println("Conta atualizada:");
        System.out.println(conta);

        System.out.println();
        System.out.print("Informe um valor para saque:");
        double valorSaque = sc.nextDouble();
        conta.saque(valorSaque);

        System.out.println();
        System.out.println("Conta atualizada:");
        System.out.println(conta);

        sc.close();    
    }
}
