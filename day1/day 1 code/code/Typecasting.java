public class Typecasting {
    public static void main(String[] args) {
       int age=25;
       double salary=500000.50;
       char grade='A';
       boolean isjavafun=true;

       ///imploicit typecating
       double newsalary = age;
         
       //explicit  typecating
        int roundedsalary = (int)salary;//dounble to int 
        
        System.out.println("Age : " + age );
        System.out.println("salary : " + salary);
        System.out.println("grade : " + grade);
        System.out.println("isjavafun : " + isjavafun);
        System.out.println("roundedsalary : " + roundedsalary);
        System.out.println("newsalary : " + newsalary);
    }
    
}
