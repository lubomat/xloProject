package xloproject001.xloProject001.model.categories.vehicles;

import lombok.Getter;
import lombok.Setter;
import xloproject001.xloProject001.model.categories.Vehicle;

@Getter
@Setter
public class Motorbike extends Vehicle  {

    public Motorbike(String brand, String model, String color, String fuelType, int yearOfProduction, int engineSize) {
        super(brand, model, color, fuelType, yearOfProduction, engineSize);
    }

    public Motorbike(int id, String title, String description, int price, String imageUrl, boolean sold, String brand, String model, String color, String fuelType, int yearOfProduction, int engineSize) {
        super(id, title, description, price, imageUrl, sold, brand, model, color, fuelType, yearOfProduction, engineSize);
    }

    public Motorbike motorbike = new Motorbike("Yamaha", "R125", "Czarny", "Benzyna", 2014, 125);
}
