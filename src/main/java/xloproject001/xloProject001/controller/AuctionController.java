package xloproject001.xloProject001.controller;

import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import xloproject001.xloProject001.model.Auction;
import xloproject001.xloProject001.model.AuctionRepository;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/auctions")
@Slf4j
public class AuctionController {

    private final AuctionRepository repository;

    public AuctionController(AuctionRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    ResponseEntity<Auction> createAuction(@RequestBody @Valid Auction toCreate) {
        Auction result = repository.save(toCreate);
        return ResponseEntity.created(URI.create("/" + result.getId())).body(result);
    }

    @GetMapping(params = {"!sort", "!page", "!size"})
    ResponseEntity<List<Auction>> readAllTasks() {
        log.warn("Exposing all the tasks!");
        return ResponseEntity.ok(repository.findAll());
    }

    @GetMapping
    ResponseEntity<List<Auction>> readAllAuctions(Pageable page) {
        log.info("Custom pageable");
        return ResponseEntity.ok(repository.findAll(page).getContent());
    }

    @GetMapping("/{id}")
    ResponseEntity<Auction> readAuction(@PathVariable int id) {
        return repository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());

    }
}
