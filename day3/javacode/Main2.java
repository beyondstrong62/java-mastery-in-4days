class Animal{
public void eat(){
System.out.println("the animal eat food");
}
}
class Dog extends Animal{
    @Override
    public void eat(){
        System.out.println(" the dod eat food ");
    }
public void bark(){
    System.out.println("the dog barks");
}
}



public class Main2 {
   public static void main(String[] args) {
    //crate a object 
    Dog dog = new Dog();
    dog.eat();
    dog.bark ();
   } 
}
