class Example{
    public void checkage(int age)throws IllegalArgumentException{
if (age<18){
    throw new IllegalArgumentException("Age must be 18 o0r above ");
}
System.out.println("Access granted");
    }


}


public class Main6 {
    public static void main(String[] args) {
        Example ex =new Example();
        try {
             ex.checkage(15);
        }catch(IllegalArgumentException e){
            System.out.println("Caught exception :"+e.getMessage());
        }
    }
}
