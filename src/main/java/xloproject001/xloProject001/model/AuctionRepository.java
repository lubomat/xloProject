package xloproject001.xloProject001.model;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AuctionRepository {
    Auction save(Auction entity);

    Page<Auction> findAll(Pageable page);

    List<Auction> findAll();

    Optional<Auction> findById(Integer id);
}
