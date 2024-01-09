package xloproject001.xloProject001.repositories;


import io.micrometer.core.instrument.config.MeterFilter;
import xloproject001.xloProject001.model.Color;
import xloproject001.xloProject001.model.Vehicle;

import java.util.List;
import java.util.Optional;

public interface ColorRepository {

    List<Color> findAll();


//    Optional<Color> findById(int id);
}
