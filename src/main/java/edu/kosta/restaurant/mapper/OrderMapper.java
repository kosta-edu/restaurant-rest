package edu.kosta.restaurant.mapper;

import edu.kosta.restaurant.domain.Order;
import edu.kosta.restaurant.dto.OrderInsertRequest;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrderMapper {
    OrderMapper INSTANCE = Mappers.getMapper( OrderMapper.class );

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "cooks.id", source = "cookId")
    @Mapping(target = "tablets.id", source = "tabletId")
    @Mapping(target = "orderDatetime", ignore = true)
    @Mapping(target = "state", ignore = true)
    @Mapping(target = "orderDishes", ignore = true)
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
            nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
    Order insertRequestToOrder(OrderInsertRequest orderInsertRequest);
}