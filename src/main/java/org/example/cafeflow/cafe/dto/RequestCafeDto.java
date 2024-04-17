package org.example.cafeflow.cafe.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.*;
import org.example.cafeflow.cafe.domain.Cafe;
import org.example.cafeflow.cafe.domain.CafeCoordinates;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
public class RequestCafeDto {
    @NotBlank(message = "카페 이름을 입력해주세요.")
    private String name;

    @NotBlank(message = "주소를 입력해주세요.")
    private String address;

    private String description;

    private CafeCoordinates cafeCoordinates;

    public Cafe toEntity() {
        LocalDateTime time = LocalDateTime.now();
        Cafe cafe = Cafe.builder()
                .name(name)
                .address(address)
                .reviewsCount(0)
                .description(description)
                .cafeCoordinates(cafeCoordinates)
                .createdAt(time)
                .updatedAt(time)
                .build();
        return cafe;
    }
}
