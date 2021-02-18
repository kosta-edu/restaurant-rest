package edu.kosta.restaurant.dto;

import com.sun.istack.NotNull;
import edu.kosta.restaurant.domain.Order;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter
@Builder
public class OrderUpdateRequest {

    @NotNull
    private Long cookId; // 조리사 번호

    @NotNull
    private Long tabletId; // 테이블 번호

    @NotNull
    private Order.State state; // 주문 상태

    private List<OrderDishesUpdateRequest> dishes; // 주문 메뉴
}
