package petshop;

public class Maquina {
    private boolean clean;
    private Pet pet;
    private int agua;
    private int shampoo;

    public Maquina(){
        this.clean = true;
        this.agua = 0;
        this.shampoo = 0;
    }


    public void darBanho(){
        if(this.pet == null){
            System.out.println("Insira um pet na máquina");
            return;
        }else if(agua <= 0 || shampoo <= 0){
            System.out.println("acabou, necessário reabastecer!");
            return;
        }

        this.agua -= 10;
        this.shampoo -= 2;
        System.out.println("O pet " + pet.getName() + "está limpo!");
        pet.setClean(true);
    }


    public void setAgua() {
        if(agua == 30){
            System.out.println("Capacidade de água máxima atingida");
            return;
        }
        agua += 10;
    }
    public void setShampoo() {
        if(shampoo == 10){
            System.out.println("Capacidade de shampoo máxima atingida");
            return;
        }
        shampoo += 2;
    }

    public int getAgua() {
        return agua;
    }
    public int getShampoo() {
        return shampoo;
    }

    public boolean hasPet(){
        return pet != null;
    }

    public void setPet(Pet pet) {
        if(!this.clean){
            System.out.println("A máquina está suja, necessário limpeza");
            return;
        }
        if(hasPet()){
            System.out.println("O Pet" + pet.getName() + " está na máquina de lavar.");
            return;
        }
        this.pet = pet;
         System.out.println("O Pet " + pet.getName() + " foi colocado na máquina");
        
        
    }

    public void retirarPet() {
        this.clean = pet.isClean();
        System.out.println(" o Pet " + pet.getName() + " foi retirado da maquina.");
        this.pet = null;
    }

    public void cleanMaquina(){
        if(!this.clean){
            System.out.println("limpando máquina...");
            
        }
        this.agua -= 3;
        this.shampoo -= 1;
        this.clean = true;
        if (agua < 3 || shampoo < 1) {
            System.out.println("quantidade de produtos para limpeza insuficientes");
            return;
        }
        System.out.println("A máquina está limpa!");
        return;
    }
}
