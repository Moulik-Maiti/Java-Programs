import java.util.*;
class Factorial{
    int Fact(int n){
        if(n<1){
            return 1;
        }
        else{
            int fact = n * Fact(n-1);
            return fact;
        }
    }
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number for factorial: ");
        int a= sc.nextInt();
        Factorial fac=new Factorial();
        int b= fac.Fact(a);
        System.out.print("The factorial of the numbers are: "+b);
        sc.close();
    }
}