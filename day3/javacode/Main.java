class Animal {
    public void eat() {
        System.out.println("the animals eat food");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("the dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.bark();
    }
}
