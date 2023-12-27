package xloproject001.xloProject001.model.categories.sports;

import xloproject001.xloProject001.model.categories.Sport;

public class OtherSports extends Sport {

    public OtherSports(String type) {
        super(type);
    }

    public OtherSports(int id, String title, String description, int price, String imageUrl, boolean sold, String type) {
        super(id, title, description, price, imageUrl, sold, type);
    }
}
