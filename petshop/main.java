package petshop;

import java.util.Scanner;

public class main {
    private final static Scanner scan = new Scanner(System.in);
    private final static Maquina maquina = new Maquina();
    public static void main(String[] args) {
        
        System.out.println("==================== Bem vindo ao Pet Shop! ====================");

        int option = -1;
        do{

            System.out.printf("ÁGUA:   %s         SHAMPOO:     %s\n", maquina.getAgua(), maquina.getShampoo());
            
            System.out.println("1- Dar banho no Pet");
            System.out.println("2- Abastecer com Água");
            System.out.println("3- Abastecer com Shampoo");
            System.out.println("4- Verificar Água");
            System.out.println("5- Verificar Shampoo");
            System.out.println("6- Verificar se tem Pet");
            System.out.println("7- Colocar Pet na Maquina");
            System.out.println("8- Retirar Pet da Maquina");
            System.out.println("9- Limpar Maquina");
            System.out.println("0- Sair");
            System.out.println("Opção:");

            option = scan.nextInt();

            switch (option) {
                case 1: maquina.darBanho();break;
                case 2: abastecerAgua();break;
                case 3: abastecerShampoo();break;
                case 4: verifyAgua();break;
                case 5: verifyShampoo();break;
                case 6:checkIfHasPetInMachine();break;
                case 7: setPetInPetMachine();break;
                case 8: maquina.retirarPet();break;
                case 9: maquina.cleanMaquina();break;
                case 0: System.exit(0);
                default: System.out.println("opção inválida");
            }


        }while (true);
       

    }

    private static void abastecerShampoo(){
        System.out.println("Abastecendo a máquina");
        maquina.setShampoo();
    }
    private static void abastecerAgua(){
        System.out.println("Abastecendo a máquina");
        maquina.setAgua();
    }

    
    private static void verifyAgua(){
        var amount = maquina.getAgua();
        System.out.println("A Maquina está no momento com " + amount + " litros de Agua");
    }
    private static void verifyShampoo(){
        var amount = maquina.getShampoo();
        System.out.println("A Maquina está no momento com " + amount + " litros de shampoo");
    }

    private static void checkIfHasPetInMachine(){
        var hasPet = maquina.hasPet();
         
        }
        System.out.println(hasPet ? "Tem pet na máquina " : "não tem pet na máquina");
    }

    

    public static void setPetInPetMachine(){
        var name = "";
        while(name == null || name.isEmpty()){
            System.out.println("Insira o nome do pet: ");
            name = scan.next();
        }
        
        var pet = new Pet(name);
        maquina.setPet(pet);
       
    }
}
