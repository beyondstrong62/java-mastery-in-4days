abstract class Animal {
    public abstract void makesound();
    
    public void sleep() {
        System.out.println("the dog is sleeping");
    }
}

class Dog extends Animal {
    @Override
    public void makesound() {
        System.out.println("bark");
    }
}

public class Main4 {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.makesound();
        dog.sleep();
    }
}
