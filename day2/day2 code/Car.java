public class Car {
    // Fields (attributes)
    String color;
    String model;
    int year;
    
    // Constructor
    public Car(String color, String model, int year) {
        this.color = color;
        this.model = model;
        this.year = year;
    }
    
    // Method
    public void displayDetails() {
        System.out.println("Car Model: " + model + ", Color: " + color + ", Year: " + year);
    }
    public static void main(String[] args){
        Car myCar = new Car("Red", "Toyota", 2020);
        // Displaying details of the car
        myCar.displayDetails();
    }
}
