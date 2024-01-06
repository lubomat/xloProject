package xloproject001.xloProject001.model;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface VehicleRepository {

    Vehicle save(Vehicle entity);

    Page<Vehicle> findAll(Pageable page);

    List<Vehicle> findAll();

    Optional<Vehicle> findById(Integer id);
}
