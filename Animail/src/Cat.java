import java.util.Scanner;

public class Cat extends Animal{
    private String name;
    private String age;

    public Cat(String name, String age) {
        this.name = name;
        this.age = age;
    }
    public Cat(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
    @Override
    void input(){
        super.input();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter name cat: ");
        name = scanner.nextLine();
        System.out.println("Enter age cat: ");
        age=scanner.nextLine();
    }
    @Override
    void output(){
        super.output();
        System.out.println("Name cat: "+this.name);
        System.out.println("Age cat: "+this.age);
    }
    @Override
    public String toString() {
        return super.toString() + "Age cat: "+age;
    }
    @Override
    public void abc(){
        System.out.println("I am cat name: "+this.name);
    }
}
