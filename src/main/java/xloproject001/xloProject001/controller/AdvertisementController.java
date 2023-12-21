package xloproject001.xloProject001.controller;

import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import xloproject001.xloProject001.model.Advertisement;
import xloproject001.xloProject001.model.AdvertisementRepository;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/ogloszenia")
@Slf4j
public class AdvertisementController {

    private final AdvertisementRepository repository;

    public AdvertisementController(AdvertisementRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    ResponseEntity<Advertisement> createAdvertisement(@RequestBody @Valid Advertisement toCreate) {
        Advertisement result = repository.save(toCreate);
        return ResponseEntity.created(URI.create("/" + result.getId())).body(result);
    }

    @GetMapping(params = {"!sort", "!page", "!size"})
    ResponseEntity<List<Advertisement>> readAllAdvertisements() {
        log.warn("Exposing all the tasks!");
        return ResponseEntity.ok(repository.findAll());
    }

    @GetMapping
    ResponseEntity<List<Advertisement>> readAllAdvertisements(Pageable page) {
        log.info("Custom pageable");
        return ResponseEntity.ok(repository.findAll(page).getContent());
    }

    @GetMapping("/{id}")
    ResponseEntity<Advertisement> readAdvertisement(@PathVariable int id) {
        return repository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());

    }
}
