package edu.kosta.restaurant.dto;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.NotBlank;

@AllArgsConstructor
@Getter
@Builder
public class DishUpdateRequest {

    @NotNull
    @NotBlank
    private String name; // 메뉴명

    private int cookingDuration; // 조리시간

    private int price; // 가격
}
