import java.util.ArrayList;
import java.util.List;

public class RentalShop {

    private List<Vehicle> fleet = new ArrayList<>();

    public void addVehicle(Vehicle vehicle) {
        fleet.add(vehicle);
    }

    public void rent(Customer customer, String vehicleId, int days)
            throws RentalException {

        Vehicle vehicle = null;

        for (Vehicle v : fleet) {
            if (v.getId().equals(vehicleId)) {
                vehicle = v;
                break;
            }
        }

        if (vehicle == null) {
            throw new RentalException("Vehicle not found");
        }

        if (!vehicle.isAvailable()) {
            throw new RentalException(
                    vehicle.getClass().getSimpleName() + " " +
                    vehicle.getModel() + " (" +
                    vehicle.getId() + ") is already rented"
            );
        }

        double rent = vehicle.calculateRent(days);

        vehicle.setAvailable(false);

        Rental rental = new Rental(vehicle, customer, days);
        customer.addRental(rental);

        System.out.printf(
                "%s rented %s %s (%s) for %d days = %.2f%n",
                customer.getName(),
                vehicle.getClass().getSimpleName(),
                vehicle.getModel(),
                vehicle.getId(),
                days,
                rent
        );
    }

    public void giveBack(String vehicleId) {

        for (Vehicle vehicle : fleet) {
            if (vehicle.getId().equals(vehicleId)) {
                vehicle.setAvailable(true);
                return;
            }
        }
    }

    public void showAvailable() {

        System.out.println("Available vehicles:");

        for (Vehicle vehicle : fleet) {
            if (vehicle.isAvailable()) {
                System.out.println(
                        "  " +
                        vehicle.getClass().getSimpleName() +
                        " " +
                        vehicle.getModel() +
                        " (" +
                        vehicle.getId() +
                        ")"
                );
            }
        }
    }
}