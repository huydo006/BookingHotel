package org.example.hotelbooking.Dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
@Getter
@Setter
@NoArgsConstructor
public class RoomResponse {
    private Long roomId;
    private Integer capacity;
    private String roomType;
    private BigDecimal unitPrice;
    private String available;
    private String hotelAddress;
    private String hotelName;
}
