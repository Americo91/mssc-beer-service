package guru.springframework.msscbeerservice.services.inventory;

import java.util.UUID;

/**
 * Created by @author stopp on 10/07/2021
 */
public interface BeerInventoryService {
    Integer getOnhandInventory(UUID beerId);
}
