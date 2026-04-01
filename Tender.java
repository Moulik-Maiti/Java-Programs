import java.util.Scanner;
class Tender {
    double cost;
    String companyname;
    void input(Scanner sc) {
        System.out.print("Enter company name: ");
        companyname = sc.nextLine();
        System.out.print("Enter cost: ");
        cost = sc.nextDouble();
        sc.nextLine(); 
    }
}

class TenderTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tender[] t = new Tender[5];
        for (int i = 0; i < 5; i++) {
            t[i] = new Tender();
            System.out.println("\nEnter details for Tender " + (i + 1));
            t[i].input(sc);
        }
        double min = t[0].cost;
        String mincompany = t[0].companyname;
        for (int i = 1; i < 5; i++) {
            if (t[i].cost < min) {
                min = t[i].cost;
                mincompany = t[i].companyname;
            }
        }
        System.out.println("\nCompany with minimum cost: " + mincompany);
        System.out.println("Minimum Cost: " + min);

        sc.close();
    }
}