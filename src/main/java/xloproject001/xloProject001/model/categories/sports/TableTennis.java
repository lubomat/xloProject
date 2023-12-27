package xloproject001.xloProject001.model.categories.sports;

import xloproject001.xloProject001.model.categories.Sport;

public class TableTennis extends Sport {

    public TableTennis(String type) {
        super(type);
    }

    public TableTennis(int id, String title, String description, int price, String imageUrl, boolean sold, String type) {
        super(id, title, description, price, imageUrl, sold, type);
    }
}
