package petshop;

public class Pet {
    private String pet;
    private boolean clean;

    public Pet(final String pet){
        this.pet = pet;
        this.clean = false;
    }

    public String getName(){
        return pet;
    }

    public boolean isClean(){
        return clean;
    }
    public void setClean(boolean clean){
        this.clean = clean;
    }
}
