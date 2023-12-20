package xloproject001.xloProject001.model;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auction")
@Slf4j
public class AuctionController {

    private AuctionRepository repository;

}
