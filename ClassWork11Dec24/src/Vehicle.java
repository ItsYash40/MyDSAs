import java.util.ArrayList;
import java.util.List;

class Vehicle {
    String type;

    public Vehicle(String type) {
        this.type = type;
    }

    public void display() {
        System.out.println("Vehicle Type: " + type);
    }
}

class Car extends Vehicle {
    String model;
    Engine engine; 
    public Car(String type, String model, Engine engine) {
        super(type);
        this.model = model;
        this.engine = engine;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Car Model: " + model);
        engine.display(); 
    }
}

class Engine {
    String engineType;

    public Engine(String engineType) {
        this.engineType = engineType;
    }

    public void display() {
        System.out.println("Engine Type: " + engineType);
    }


//public class Main {
    public static void main(String[] args) {
        Engine petrolEngine = new Engine("Petrol");
        Engine dieselEngine = new Engine("Diesel");

        Vehicle vehicle1 = new Vehicle("Generic Vehicle");
        Car car1 = new Car("Car", "Audi", petrolEngine);
        Car car2 = new Car("Car", "Rolls Roys", dieselEngine);

        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(vehicle1);
        vehicles.add(car1);
        vehicles.add(car2);

        for (Vehicle vehicle : vehicles) {
            vehicle.display();
            System.out.println(); 
        }
    }
}
