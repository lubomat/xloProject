package xloproject001.xloProject001.model.categories.vehicles;

import lombok.Getter;
import lombok.Setter;
import xloproject001.xloProject001.model.categories.Vehicle;

@Getter
@Setter
public class OtherVehicles extends Vehicle {

    public OtherVehicles(String brand, String model, String color, String fuelType, int yearOfProduction, int engineSize) {
        super(brand, model, color, fuelType, yearOfProduction, engineSize);
    }

    public OtherVehicles(int id, String title, String description, int price, String imageUrl, boolean sold, String brand, String model, String color, String fuelType, int yearOfProduction, int engineSize) {
        super(id, title, description, price, imageUrl, sold, brand, model, color, fuelType, yearOfProduction, engineSize);
    }

}
