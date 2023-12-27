package xloproject001.xloProject001.model.categories.vehicles;

import lombok.Getter;
import lombok.Setter;
import xloproject001.xloProject001.model.categories.Vehicle;

@Getter
@Setter
public class Car extends Vehicle {

    public Car(String brand, String model, String color, String fuelType, int yearOfProduction, int engineSize) {
        super(brand, model, color, fuelType, yearOfProduction, engineSize);
    }

    public Car(int id, String title, String description, int price, String imageUrl, boolean sold, String brand, String model, String color, String fuelType, int yearOfProduction, int engineSize) {
        super(id, title, description, price, imageUrl, sold, brand, model, color, fuelType, yearOfProduction, engineSize);
    }

    public Car mercedes = new Car("Mercedes","W204","Black","Diesel", 2011, 3000);

    public Car getMercedes() {
        return mercedes;
    }
}
