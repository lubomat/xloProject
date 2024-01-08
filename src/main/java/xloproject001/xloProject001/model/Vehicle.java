package xloproject001.xloProject001.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "vehicles")
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String type;
    private String description;
    private int price;
    private String imageUrl;
    private String brand;
    private String model;
    private String fuelType;
    private int yearOfProduction;
    private int engineSize;
    private boolean sold;
    @OneToMany
    private Set<PhoneNumber> phoneNumbers;


    public Vehicle(int id, String type, String description, int price, String imageUrl, String brand, String model, String color, String fuelType, int yearOfProduction, int engineSize, boolean sold) {
        this.id = id;
        this.type = type;
        this.description = description;
        this.price = price;
        this.imageUrl = imageUrl;
        this.brand = brand;
        this.model = model;
        this.fuelType = fuelType;
        this.yearOfProduction = yearOfProduction;
        this.engineSize = engineSize;
        this.sold = sold;
    }
}