import java.util.*;
class outer{
    int n;
    String name;
    class inner{
        Scanner sc= new Scanner(System.in);
        void input(){
            System.out.println("Enter Your name: ");
            name = sc.nextLine();
            System.out.println("Enter your age: ");
            n = sc.nextInt();
        }
        void display(){
            System.out.println("Name is : "+name);
            System.out.println("Age is : "+n);
        }
    }
    public static void main(String [] args){
        outer obj=new outer();
        outer.inner obj2 = obj.new inner();
        obj2.input();
        obj2.display();
    }
}