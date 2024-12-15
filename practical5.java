interface Vehicle {
    void gearChange();
    void speedUp();
    void applyBrakes();
}

class Bicycle implements Vehicle {
    public void gearChange() {
        System.out.println("Bicycle gear changed.");
    }

    public void speedUp() {
        System.out.println("Bicycle speed increased.");
    }

    public void applyBrakes() {
        System.out.println("Bicycle brakes applied.");
    }
}

class Bike implements Vehicle {
    public void gearChange() {
        System.out.println("Bike gear changed.");
    }

    public void speedUp() {
        System.out.println("Bike speed increased.");
    }

    public void applyBrakes() {
        System.out.println("Bike brakes applied.");
    }
}

class Car implements Vehicle {
    public void gearChange() {
        System.out.println("Car gear changed.");
    }

    public void speedUp() {
        System.out.println("Car speed increased.");
    }

    public void applyBrakes() {
        System.out.println("Car brakes applied.");
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle bicycle = new Bicycle();
        Vehicle bike = new Bike();
        Vehicle car = new Car();

        bicycle.gearChange();
        bicycle.speedUp();
        bicycle.applyBrakes();

        bike.gearChange();
        bike.speedUp();
        bike.applyBrakes();

        car.gearChange();
        car.speedUp();
        car.applyBrakes();
    }
}
