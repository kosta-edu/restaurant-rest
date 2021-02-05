package edu.kosta.restaurant.dto;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.NotBlank;

@AllArgsConstructor
@Getter
@Builder
public class CookUpdateRequest {

    @NotNull
    @NotBlank
    private String firstName; // 이름

    @NotNull
    @NotBlank
    private String lastName; // 성
}
