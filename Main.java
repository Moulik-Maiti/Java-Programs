import java.util.Scanner;
class Item {
    int code;
    double price;
    void getData(Scanner sc) {
        System.out.print("Enter item code: ");
        code = sc.nextInt();
        System.out.print("Enter item price: ");
        price = sc.nextDouble();
    }
    void display() {
        System.out.println(code + "\t\t" + price);
    }
}
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Item[] obj = new Item[5];
        double total = 0;
        for (int i = 0; i < 5; i++) {
            obj[i] = new Item();
            obj[i].getData(sc);
        }
        System.out.println("");
        System.out.println("-----------------------");

        for (int i = 0; i < 5; i++) {
            obj[i].display();
            total += obj[i].price;
        }
        System.out.println("-----------------------");
        System.out.println("Total Price = " + total);

        sc.close();
    }
}