abstract class MotorVehicle {
    String modelName;
    String modelNumber;
    double modelPrice;

    MotorVehicle(String modelName, String modelNumber, double modelPrice) {
        this.modelName = modelName;
        this.modelNumber = modelNumber;
        this.modelPrice = modelPrice;
    }

    abstract void display();
}

class Car extends MotorVehicle {
    double discountRate;

    Car(String modelName, String modelNumber, double modelPrice, double discountRate) {
        super(modelName, modelNumber, modelPrice);
        this.discountRate = discountRate;
    }

    double discount() {
        return (modelPrice * discountRate) / 100;
    }

    @Override
    void display() {
        System.out.println("Car Name: " + modelName);
        System.out.println("Model Number: " + modelNumber);
        System.out.println("Price: " + modelPrice);
        System.out.println("Discount Rate: " + discountRate + "%");
        System.out.println("Discount Amount: " + discount());
    }
}
class Main {
    public static void main(String[] args) {
        Car c = new Car("Honda City", "HC2025", 1500000, 10);
        c.display();
    }
}
