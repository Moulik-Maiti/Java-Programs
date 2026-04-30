import java.util.Scanner;

interface Exam
{
    void percent_cal();
}
class Student
{
    String name;
    int roll_no;
    int marks1, marks2;
    void show()
    {
        System.out.println("Name : " + name);
        System.out.println("Roll No : " + roll_no);
        System.out.println("Marks 1 : " + marks1);
        System.out.println("Marks 2 : " + marks2);
    }
}
class Result extends Student implements Exam
{
    float per;
    public void percent_cal()
    {
        per = (marks1 + marks2) / 2.0f;
    }
    void display()
    {
        show();
        System.out.println("Percentage : " + per);
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Result r = new Result();
        System.out.print("Enter Name : ");
        r.name = sc.nextLine();
        System.out.print("Enter Roll No : ");
        r.roll_no = sc.nextInt();
        System.out.print("Enter Marks 1 : ");
        r.marks1 = sc.nextInt();
        System.out.print("Enter Marks 2 : ");
        r.marks2 = sc.nextInt();
        r.percent_cal();
        r.display();
    }
}
