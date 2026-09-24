package contabancaria;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Valor do depósito inicial: ");
        var firstDep = scan.nextDouble();
        Conta conta = new Conta(firstDep);

        int opcao;
        do{
            System.out.println("\n--- BANCO ---");
            System.out.printf("Saldo: R$ %.2f | Limite: R$ %.2f | Disponível: R$ %.2f\n", conta.consultarSaldo(), conta.consultarCheque(), conta.consultarSaldoDisponivel());
            System.out.println("Usando cheque? " + (conta.estaUsandoCheque() ? "SIM" : "NÃO"));
            System.out.println("1- Depositar");
            System.out.println("2- Sacar");
            System.out.println("3- pagar Boleto");
            System.out.println("0- sair");
            System.out.println("Opção: ");
            opcao = scan.nextInt();

            if(opcao == 1){
                System.out.println("Valor para depositar:");
                conta.depositar(scan.nextDouble());
            }else if(opcao == 2){
                System.out.println("valor para sacar: ");
                conta.sacar(scan.nextDouble());
            }else if(opcao == 3){
                System.out.println("Valor do boleto: ");
                conta.pagarBoleto(scan.nextDouble());
            }
        }while(opcao != 0);
        scan.close();
        System.out.println("Sistema encerrado!");
        
        
        

    }
}
