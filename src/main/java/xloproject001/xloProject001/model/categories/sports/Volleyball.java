package xloproject001.xloProject001.model.categories.sports;

import xloproject001.xloProject001.model.categories.Sport;

public class Volleyball extends Sport {

    public Volleyball(String type) {
        super(type);
    }

    public Volleyball(int id, String title, String description, int price, String imageUrl, boolean sold, String type) {
        super(id, title, description, price, imageUrl, sold, type);
    }
}
