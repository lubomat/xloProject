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
    private int yearOfProduction;
    private int engineSize;

}