package guru.sfg.common.events;

import guru.springframework.msscbeerservice.web.model.BeerDto;
import lombok.NoArgsConstructor;

/**
 * Created by @author stopp on 10/08/2021
 */
@NoArgsConstructor
public class NewInventoryEvent extends BeerEvent{

     public NewInventoryEvent(BeerDto beerDto) {
        super(beerDto);
    }
}
