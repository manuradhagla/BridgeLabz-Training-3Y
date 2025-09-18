public class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double dailyRate = 1000.0; // Example rate

    // Default constructor
    public CarRental() {
        this.customerName = "Customer";
        this.carModel = "Generic";
        this.rentalDays = 1;
    }

    // Parameterized constructor
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    public double calculateTotalCost() {
        return rentalDays * dailyRate;
    }
}
