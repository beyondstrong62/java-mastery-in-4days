class Mathoperation{
public int  add(int a, int b){
    return a+b;
}
public double add(double a, double b){
return a+b;
}
}


public class Main3 {
    public static void main(String[] args) {
        Mathoperation mthop= new Mathoperation();
        int sumint = mthop.add(5,10);
        double sumdouble = mthop.add(5.5,10);
        System.out.println(" Sumof two integer number " + sumint);
        System.out.println("sum of two double  number " + sumdouble);
    }
}
