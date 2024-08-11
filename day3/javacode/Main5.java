
interface Animal{
void makesound();
}
 class Dog implements Animal {
    @Override
    public void makesound() {
        System.out.println("bark");
    }
}
     class Cat implements Animal {
        @Override
        public void makesound() {
            System.out.println("meow");
        }
    }

    public class Main5{
        public static void main(String[] args) {
            Animal dog = new Dog();
            Animal cat = new Cat();
            dog.makesound();
            cat.makesound();
        }
    }


