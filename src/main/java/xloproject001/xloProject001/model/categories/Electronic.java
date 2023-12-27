package xloproject001.xloProject001.model.categories;

import lombok.Getter;
import lombok.Setter;
import xloproject001.xloProject001.model.Advertisement;

@Getter
@Setter
public class Electronic extends Advertisement {

    private String type;
    private String model;

    public Electronic(String type, String model) {
        this.type = type;
        this.model = model;
    }

    public Electronic(int id, String title, String description, int price, String imageUrl, boolean sold, String type, String model) {
        super(id, title, description, price, imageUrl, sold);
        this.type = type;
        this.model = model;
    }

}
