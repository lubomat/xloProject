package xloproject001.xloProject001.adapter;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import xloproject001.xloProject001.model.Advertisement;
import xloproject001.xloProject001.model.AdvertisementRepository;

@Repository
public interface SqlAdvertisementRepository extends AdvertisementRepository, JpaRepository<Advertisement, Integer> {
}
