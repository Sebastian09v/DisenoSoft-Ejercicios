package AnimalProject;
public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Misty");
        Dog dog1 = new Dog("Rex");
        Dog dog2 = new Dog("Buddy");

        System.out.println(cat.toString());
        cat.greets();

        System.out.println(dog1.toString());
        dog1.greets();

        dog1.greets(dog2);  
    }
}
