package edu.kosta.restaurant.dto;

import com.sun.istack.NotNull;
import com.sun.istack.Nullable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Getter
@Builder
public class OrderDishesUpdateRequest {

    @NotNull
    private Long dishId; // 조리사 번호

    private int quantity; // 수량
}
