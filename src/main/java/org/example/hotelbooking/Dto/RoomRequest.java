package org.example.hotelbooking.Dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
@Getter
@Setter
@NoArgsConstructor
public class RoomRequest {
    private Integer capacity;
    private String room_type;
    private BigDecimal unit_price;
    private String available;
}
