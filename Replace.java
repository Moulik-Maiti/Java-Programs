import java.util.Scanner;

public class Replace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String result = str.replace('d', 'f');
        System.out.println("Updated string: " + result);
        sc.close();
    }
}
