package xloproject001.xloProject001.model.categories.vehicles;

import xloproject001.xloProject001.model.categories.Vehicle;


public class Car extends Vehicle {

    public Car(String brand, String model, String color, String fuelType, int yearOfProduction, int engineSize) {
        super(brand, model, color, fuelType, yearOfProduction, engineSize);
    }

    public Car(int id, String title, String description, int price, String imageUrl, boolean sold, String brand, String model, String color, String fuelType, int yearOfProduction, int engineSize) {
        super(id, title, description, price, imageUrl, sold, brand, model, color, fuelType, yearOfProduction, engineSize);
    }

    public Car mercedes = new Car("Mercedes","W204","Black","Diesel", 2011, 3000);

    public Car bmw = new Car("BMW", "E30", "Red", "GAS", 1990, 1600);

    public Car toyota = new Car("Toyota", "Prius", "Silver", "Hybrid", 2008, 1500);

    public Car volkswagen = new Car("Volkswagen", "Passat", "White", "Diesel", 2000, 1900);
}
