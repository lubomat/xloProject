package xloproject001.xloProject001.repositories;


import xloproject001.xloProject001.model.Color;

import java.util.List;

public interface ColorRepository {

    List<Color> findAll();


//    Optional<Color> findById(int id);
}
