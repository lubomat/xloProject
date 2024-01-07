package xloproject001.xloProject001.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import xloproject001.xloProject001.model.Color;
import xloproject001.xloProject001.repositories.ColorRepository;

import java.util.List;

@Controller
@Slf4j
@RequestMapping("/colors")
@RequiredArgsConstructor
public class ColorController {

    private final ColorRepository colorRepository;

    @GetMapping
    ResponseEntity<List<Color>> readAllColors() {
        log.info("Expose all colors");
        return ResponseEntity.ok(colorRepository.findAll());

    }

    /*
    @GetMapping("/colors")
    ResponseEntity<List<String>> readColors() {
//        return ResponseEntity.ok(Collections.singletonList("czerwony"));
//        return ResponseEntity.ok(Arrays.asList("czerwony","czarny"));
        return ResponseEntity.ok(colorRepository.findAll().stream().map(Vehicle::getColor).toList());

    }
    **/
}
