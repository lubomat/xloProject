package xloproject001.xloProject001.model;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Range;

import java.net.ContentHandler;
import java.util.Optional;

public interface AuctionRepository {
    Auction save(Auction entity);

    Page<Auction> findAll(Pageable page);

    Optional<Auction> findById(Integer id);
}
