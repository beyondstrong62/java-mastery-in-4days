import java.io.*;
import java.util.ArrayList;
public class FileHandler {
    private static final String FILE_NAME = "students.txt";
    public void writeToFile(ArrayList<Student> students) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Student student : students) {
                bw.write(student.getId() + "," + student.getName() + "," +
                         student.getAge() + "," + student.getGrade());
                bw.newLine();
            }
        }
catch (IOException e) {
            e.printStackTrace();
        }
    }


    public ArrayList<Student> readFromFile() {
        ArrayList<Student> students = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new               FileReader(FILE_NAME))) { 
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                int id = Integer.parseInt(parts[0]);
                String name = parts[1];
                int age = Integer.parseInt(parts[2]);
                char grade = parts[3].charAt(0);
                students.add(new Student(id, name, age, grade));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return students;
    }
}
