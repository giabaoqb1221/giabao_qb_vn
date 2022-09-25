import java.util.Scanner;

public abstract class Animal {
    String food;
    String weight;
    String gender;

    public Animal(String food, String weight, String gender){
        super();
        this.food=food;
        this.weight=weight;
        this.gender=gender;
    }
    public Animal(){

    }
    public String getFood(){
        return food;
    }
    public void setFood(String food){
        this.food = food;
    }
    public String getWeight(){
        return weight;
    }
    public void setWeight(){
        this.weight=weight;
    }
    public String getGender(){
        return gender;
    }
    public void setGender(){
        this.gender=gender;
    }
    void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter food: ");
        food = scanner.nextLine();
        System.out.println("Enter weight: ");
        weight = scanner.nextLine();
        System.out.println("Enter gender: ");
        gender = scanner.nextLine();
    }
    void output(){
        System.out.println("Food= "+this.food);
        System.out.println("Weight= "+this.weight);
        System.out.println("Gender= "+this.gender);

    }
    public abstract void abc();
    public String toString(){
        return "Food= "+this.food+
                "Weight= "+this.weight+
                "Gender= "+this.gender;
    }

}
