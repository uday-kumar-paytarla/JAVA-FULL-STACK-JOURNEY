public class Main {
    public static void main(String[] args) {
        vehicle myVehicle = new Car();
        // The reference type is the interface (Vehicle),
        // but it can point to any class that implements Vehicle.
        // We cannot create an object of the interface itself,
        // because interface methods have no body/implementation.
        myVehicle.drive();

        myVehicle = new bike();
        // Reassigning the same reference to point to a different object
        myVehicle.drive();
    }
}