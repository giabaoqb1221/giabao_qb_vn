import java.util.Scanner;

public class Dog extends Animal {
    private String species;
    private float weigthD;

    public Dog(String species, float weigthD) {
        this.species = species;
        this.weigthD = weigthD;
    }
    public Dog(){

    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public float getWeigthD() {
        return weigthD;
    }

    public void setWeigthD(float weigthD) {
        this.weigthD = weigthD;
    }
    @Override
    void input(){
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter species: ");
        species = scanner.nextLine();
        System.out.println("Enter Weight: ");
        weigthD = scanner.nextFloat();
    }
    @Override
    void output() {
        super.output();
        System.out.println("Species: " + this.species);
        System.out.println("Weight: " + this.weigthD);
    }
    @Override
    public String toString() {
            return super.toString() + "Species= " + species +
                                      "Weight= "+ weigthD;
    }
    @Override
    public void abc(){
            System.out.println("I am dog species: "+this.species);
    }
}
