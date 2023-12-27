package xloproject001.xloProject001.model.categories;


import lombok.Getter;
import lombok.Setter;
import xloproject001.xloProject001.model.Advertisement;

@Getter
@Setter
public class Vehicle extends Advertisement {

    private String brand;
    private String model;
    private String color;
    private String fuelType;
    private int yearOfProduction;
    private int engineSize;

    public Vehicle(String brand, String model, String color, String fuelType, int yearOfProduction, int engineSize) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.fuelType = fuelType;
        this.yearOfProduction = yearOfProduction;
        this.engineSize = engineSize;
    }

    public Vehicle(int id, String title, String description, int price, String imageUrl, boolean sold, String brand, String model, String color, String fuelType, int yearOfProduction, int engineSize) {
        super(id, title, description, price, imageUrl, sold);
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.fuelType = fuelType;
        this.yearOfProduction = yearOfProduction;
        this.engineSize = engineSize;
    }


}
