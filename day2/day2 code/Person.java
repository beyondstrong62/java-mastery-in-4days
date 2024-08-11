public class Person {
    private String name;
    private int age;
    
    // Getter method for name
    public String getName() {
        return name;
    }
    
    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }
    
    // Getter method for age
    public int getAge() {
        return age;
    }
    
    // Setter method for age
    public void setAge(int age) {
        this.age = age;
    }



    public static void main(String[] args) {
        // Creating an instance of Person
        Person person = new Person();
        
        // Setting name and age
        person.setName("John Doe");
        person.setAge(25);
        
        // Getting and printing name and age
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}

