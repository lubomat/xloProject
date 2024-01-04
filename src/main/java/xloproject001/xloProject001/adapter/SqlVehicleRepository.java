package xloproject001.xloProject001.adapter;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import xloproject001.xloProject001.model.Vehicle;
import xloproject001.xloProject001.model.VehicleRepository;

@Repository
public interface SqlVehicleRepository extends VehicleRepository, JpaRepository<Vehicle, Integer> {
}
