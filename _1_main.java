class Animal{
    void makeSound(){
        System.out.println("Animal make a sound");
    }
}
class Dog extends Animal{
    void makeSound(){
        System.out.println("Dog barks");
    }
}
public class _1_main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();

    }
}
