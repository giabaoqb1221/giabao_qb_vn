import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    Cat Cat = new Cat();
    Dog Dog = new Dog();
    List<Animal>animalList=new ArrayList<>();
    public void addCat(){
        Cat.input();
        animalList.add(Cat);
    }
    public void displayCat(){
        for (Animal Animal:animalList){
            Cat.abc();
            Cat.output();
        }
    }
    public void addDog(){
        Dog.input();
        animalList.add(Dog);
    }
    public void displayDog(){
        for (Animal Animal:animalList){
            Dog.abc();
            Dog.output();
        }
    }
    public static void main(String[] args){
        Test Test = new Test();
        int a = 0;
        System.out.println("Choose cat or dog (0/1): ");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        if (a==0){
            Test.addCat();
            Test.displayCat();
        }else if (a==1)
        {
            Test.addDog();
            Test.displayDog();
        }else{
            System.out.println("Please re-enter: ");
        }
    }
}
