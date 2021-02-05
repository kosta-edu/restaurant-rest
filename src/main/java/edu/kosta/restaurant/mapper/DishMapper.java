package edu.kosta.restaurant.mapper;

import edu.kosta.restaurant.domain.Dish;
import edu.kosta.restaurant.dto.DishUpdateRequest;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper
public interface DishMapper {
    DishMapper INSTANCE = Mappers.getMapper( DishMapper.class );

    @Mapping(target = "id", ignore = true)
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
            nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
    Dish updateRequestToDish (DishUpdateRequest dishUpdateRequest, @MappingTarget Dish dish);
}