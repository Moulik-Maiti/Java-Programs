import java.util.Scanner;

public class Str {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String st = sc.nextLine();

        int up = 0, l = 0, digits = 0, spaces = 0;

        for (int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i);

            if (Character.isUpperCase(ch)) {
                up++;
            } else if (Character.isLowerCase(ch)) {
                l++;
            } else if (Character.isDigit(ch)) {
                digits++;
            } else if (ch == ' ') {
                spaces++;
            }
        }

        System.out.println("Uppercase characters: " + up);
        System.out.println("Lowercase characters: " + l);
        System.out.println("Digits: " + digits);
        System.out.println("Spaces: " + spaces);

        sc.close();
    }
}
