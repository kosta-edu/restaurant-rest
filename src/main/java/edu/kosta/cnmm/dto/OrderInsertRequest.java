package edu.kosta.cnmm.dto;

import com.sun.istack.NotNull;
import edu.kosta.restaurant.dto.OrderDishesInsertRequest;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter
@Builder
public class OrderInsertRequest {

    @NotNull
    private Long cookId; // 조리사 번호

    @NotNull
    private Long tabletId; // 테이블 번호

    private List<OrderDishesInsertRequest> dishes; // 주문 메뉴
}
