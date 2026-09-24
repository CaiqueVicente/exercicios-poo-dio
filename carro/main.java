package carro;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Scanner scan = new Scanner(System.in);
        System.out.println("Carro criado desligado, ponto morto 0km/h, o que deseja fazer?");

        int option;
        do{
            System.out.println("\n--- Carro ---");
            System.out.printf("Status: %s    Velocidade: %s \n", carro.carroLigado(), carro.verificarVelocidade());
            System.out.println("1- ligar carro");
            System.out.println("2- desligar carro");
            System.out.println("3- acelerar");
            System.out.println("4- reduzir velocidade");
            System.out.println("5- 1ª marcha");
            System.out.println("6- 2ª marcha");
            System.out.println("7- 3ª marcha");
            System.out.println("8- 4ª marcha");
            System.out.println("9- 5ª marcha");
            System.out.println("10- 6ª marcha");
            System.out.println("11- virar esquerda");
            System.out.println("12- virar direita");
            System.out.println("0- sair");
            System.out.print("Opção: ");
            option = scan.nextInt();
            switch (option) {
                case 1: carro.LigarCarro();break;
                case 2: carro.DesligarCarro();break;
                case 3: carro.AcelerarCarro();break;
                case 4: carro.reduzirVelocidade();break;
                case 5: carro.trocarMarcha(1);break;
                case 6: carro.trocarMarcha(2);break;
                case 7: carro.trocarMarcha(3);break;
                case 8: carro.trocarMarcha(4);break;
                case 9: carro.trocarMarcha(5);break;
                case 10: carro.trocarMarcha(6);break;
                case 11: carro.virarEsquerda();break;
                case 12: carro.virarDireita();break;
                 
            }
            
        }while(option != 0);
        scan.close();

    }

}

