package xloproject001.xloProject001.model;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AdvertisementRepository {

    Advertisement save(Advertisement entity);

    Page<Advertisement> findAll(Pageable page);

    List<Advertisement> findAll();

    Optional<Advertisement> findById(Integer id);
}
