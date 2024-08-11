import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        FileHandler fileHandler = new FileHandler();
  // Load students from file
        ArrayList<Student> students = fileHandler.readFromFile();
        manager.addAll(students);
 Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nStudent Management System");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Save and Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt(); 
            switch (choice) {
                            case 1:
                                manager.addStudent();
                                break;
                            case 2:
                                manager.viewStudents();
                                break;
                            case 3:
                                manager.updateStudent();
                                break;
                            case 4:
                                manager.deleteStudent();
                                break;
                            case 5:
                         fileHandler.writeToFile(manager.getStudents());
                                System.out.println("Data saved. Exiting...");
                                return;
                            default:
                                System.out.println("Invalid choice.."); }
                    }   }    }
            