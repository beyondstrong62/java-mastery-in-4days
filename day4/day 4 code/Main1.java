import java.util.ArrayList;
public class Main1{
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("mango");
        list.add("banana");
    
    for(String fruit: list){
        System.out.println(fruit);
    }
    }
}