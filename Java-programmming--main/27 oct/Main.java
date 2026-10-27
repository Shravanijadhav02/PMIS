public class Main {

    public static void main(String[] args) {

        RentalShop shop = new RentalShop();

        Car car = new Car("C1", "Swift", 2000);
        Bike bike = new Bike("B1", "Activa", 400);
        Truck truck = new Truck("T1", "Tata Ace", 2500);

        shop.addVehicle(car);
        shop.addVehicle(bike);
        shop.addVehicle(truck);

        Customer asha = new Customer("Asha");
        Customer ravi = new Customer("Ravi");

        try {
            shop.rent(asha, "B1", 8);
            shop.rent(ravi, "T1", 2);
            shop.rent(ravi, "B1", 3);

        } catch (RentalException e) {
            System.out.println("Error: " + e.getMessage());
        }

        shop.giveBack("B1");

        shop.showAvailable();
    }
}