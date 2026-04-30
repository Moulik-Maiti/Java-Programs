interface SalesDepartment {
    void processSale(double amount);
}

interface FinanceDepartment {
    void generateInvoice(String clientName, double amount);
}

class CommercialExecutive implements SalesDepartment, FinanceDepartment {

    public void processSale(double amount) {
        System.out.println("Sale Processed for Amount: Rs." + amount);
    }

    public void generateInvoice(String clientName, double amount) {
        System.out.println("Invoice Generated");
        System.out.println("Client Name: " + clientName);
        System.out.println("Invoice Amount: Rs." + amount);
    }

    void showSummary() {
        System.out.println("Commercial Operations Completed Successfully.");
    }
}

public class Main {
    public static void main(String[] args) {
        CommercialExecutive ce = new CommercialExecutive();

        ce.processSale(15000);
        ce.generateInvoice("ABC Pvt Ltd", 15000);
        ce.showSummary();
    }
}
