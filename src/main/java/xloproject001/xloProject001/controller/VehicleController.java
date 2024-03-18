package xloproject001.xloProject001.controller;

import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import xloproject001.xloProject001.model.Vehicle;
import xloproject001.xloProject001.repositories.VehicleRepository;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/vehicles")
@Slf4j
public class VehicleController {

    private final VehicleRepository repository;

    public VehicleController(VehicleRepository repository) {
        this.repository = repository;
    }

    @PostMapping("/create")
    ResponseEntity<Vehicle> createAdvertisement(@RequestBody @Valid Vehicle toCreate) {
        Vehicle result = repository.save(toCreate);
        log.info("Vehicle created !");
        return ResponseEntity.created(URI.create("/" + result.getId())).body(result);
    }


    @GetMapping(params = {"!sort", "!page", "!size"})
    ResponseEntity<List<Vehicle>> readAllAdvertisements() {
        log.warn("Exposing all the vehicles!");
        return ResponseEntity.ok(repository.findAll());
    }

    @GetMapping
    ResponseEntity<List<Vehicle>> readAllAdvertisements(Pageable page) {
        log.info("Custom pageable");
        return ResponseEntity.ok(repository.findAll(page).getContent());
    }

    @GetMapping("/{id}")
    ResponseEntity<Vehicle> readAdvertisement(@PathVariable int id) {
        return repository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());

    }


}
