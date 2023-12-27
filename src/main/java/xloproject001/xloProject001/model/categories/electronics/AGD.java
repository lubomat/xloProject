package xloproject001.xloProject001.model.categories.electronics;

import lombok.Getter;
import lombok.Setter;
import xloproject001.xloProject001.model.categories.Electronic;

@Getter
@Setter
public class AGD extends Electronic {

    public AGD(String type, String model) {
        super(type, model);
    }

    public AGD(int id, String title, String description, int price, String imageUrl, boolean sold, String type, String model) {
        super(id, title, description, price, imageUrl, sold, type, model);
    }
}
