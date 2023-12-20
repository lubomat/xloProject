package xloproject001.xloProject001.adapter;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import xloproject001.xloProject001.model.Auction;
import xloproject001.xloProject001.model.AuctionRepository;

@Repository
public interface SqlAuctionRepository extends AuctionRepository, JpaRepository<Auction, Integer> {
}
