import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class FileWriterExample {
    public static void main(String[] args) {
        
    
    try (BufferedWriter bw = new BufferedWriter(new FileWriter("file.txt"))) 
    
    
    {
       
      
        bw.write("Hello");
        bw.newLine();
        bw.write("this is a write eg");


        }
    catch (IOException e) {
        e.printStackTrace();}
}
}

