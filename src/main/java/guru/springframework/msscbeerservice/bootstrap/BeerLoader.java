package guru.springframework.msscbeerservice.bootstrap;

import guru.springframework.msscbeerservice.domain.Beer;
import guru.springframework.msscbeerservice.repository.BeerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.persistence.Column;
import java.math.BigDecimal;

/**
 * Created by @author stopp on 29/06/2021
 */
@Component
public class BeerLoader implements CommandLineRunner {

    private final BeerRepository beerRepository;

    public BeerLoader(BeerRepository beerRepository) {this.beerRepository = beerRepository;}

    @Override
    public void run(String... args) throws Exception {
        loadBeers();
    }

    private void loadBeers() {
        if (beerRepository.count() == 0) {
            beerRepository.save(Beer.builder().beerName("Mango Bobs").beerStyle("IPA").quantityToBrew(200).minOnHand(12)
                                    .upc(337010000L).price(new BigDecimal("12.95")).build());

            beerRepository
                    .save(Beer.builder().beerName("Galaxu Cat").beerStyle("PALE_ALE").quantityToBrew(200).minOnHand(12)
                              .upc(3370100001L).price(new BigDecimal("11.90")).build());
        }
    }
}
