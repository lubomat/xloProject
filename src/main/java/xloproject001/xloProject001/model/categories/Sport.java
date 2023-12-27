package xloproject001.xloProject001.model.categories;

import lombok.Getter;
import lombok.Setter;
import xloproject001.xloProject001.model.Advertisement;

@Getter
@Setter
public class Sport extends Advertisement {

    private String type;

    public Sport(String type) {
        this.type = type;
    }

    public Sport(int id, String title, String description, int price, String imageUrl, boolean sold, String type) {
        super(id, title, description, price, imageUrl, sold);
        this.type = type;
    }
}
