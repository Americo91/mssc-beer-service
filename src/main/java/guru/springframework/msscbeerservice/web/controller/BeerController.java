package guru.springframework.msscbeerservice.web.controller;

import guru.springframework.msscbeerservice.web.model.BeerDto;
import guru.springframework.msscbeerservice.services.BeerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.UUID;

/**
 * Created by jt on 2019-05-12.
 */
@RequiredArgsConstructor
@Validated
@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {

    private final BeerService beerService;


    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeerById(@PathVariable("beerId") UUID beerId){
        return new ResponseEntity<>(beerService.getById(beerId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity saveNewBeer(@Valid @RequestBody BeerDto beerDto){
        return new ResponseEntity(beerService.saveNewBeer(beerDto),HttpStatus.CREATED);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity updateBeerById(@PathVariable("beerId") UUID beerId, @Valid @RequestBody BeerDto beerDto){
        return new ResponseEntity(beerService.updateBeerById(beerId, beerDto),HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/{beerId}")
    public ResponseEntity deleteBeerById(@PathVariable("beerId") UUID beerId) {
        return new ResponseEntity(beerService.deleteBeerById(beerId),HttpStatus.NO_CONTENT);
    }

}
