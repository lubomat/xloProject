package xloproject001.xloProject001.model.categories;

import lombok.Getter;
import lombok.Setter;
import xloproject001.xloProject001.model.Advertisement;

@Getter
@Setter
public class Clothes extends Advertisement {

    private String model;
    private String size;
}
