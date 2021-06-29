package guru.springframework.msscbeerservice.repository;

import guru.springframework.msscbeerservice.domain.Beer;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

/**
 * Created by @author stopp on 29/06/2021
 */
public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {
}
