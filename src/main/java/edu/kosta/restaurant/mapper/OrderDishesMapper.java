package edu.kosta.restaurant.mapper;

import edu.kosta.restaurant.domain.OrderDishes;
import edu.kosta.restaurant.dto.OrderDishesInsertRequest;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrderDishesMapper {
    OrderDishesMapper INSTANCE = Mappers.getMapper( OrderDishesMapper.class );

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "orders", ignore = true)
    @Mapping(target = "dishes.id", source = "dishId")
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
            nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
    OrderDishes insertRequestToOrderDishes(OrderDishesInsertRequest orderDishesInsertRequest);
}