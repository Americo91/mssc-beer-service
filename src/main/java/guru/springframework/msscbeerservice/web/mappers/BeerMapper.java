package guru.springframework.msscbeerservice.web.mappers;

import guru.springframework.msscbeerservice.domain.Beer;
import guru.springframework.msscbeerservice.web.model.BeerDto;
import org.mapstruct.DecoratedWith;
import org.mapstruct.Mapper;

/**
 * Created by @author stopp on 03/07/2021
 */
@Mapper(uses = {DataMapper.class})
@DecoratedWith(BeerMapperDecorator.class)
public interface BeerMapper {

    BeerDto toDto(Beer beer);

    BeerDto toDtoWithInventory(Beer beer);

    Beer toEntity(BeerDto beerDto);

}
