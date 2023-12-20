package xloproject001.xloProject001.model;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.net.ContentHandler;

public interface AuctionRepository {
    Auction save(Auction entity);

    Page<Auction> findAll(Pageable page);
}
