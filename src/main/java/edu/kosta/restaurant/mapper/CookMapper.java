package edu.kosta.restaurant.mapper;

import edu.kosta.restaurant.domain.Cook;
import edu.kosta.restaurant.dto.CookUpdateRequest;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CookMapper {
    CookMapper INSTANCE = Mappers.getMapper( CookMapper.class );

    @Mapping(target = "id", ignore = true)
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
            nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
    Cook updateRequestToCook (CookUpdateRequest cookUpdateRequest, @MappingTarget Cook cook);
}
