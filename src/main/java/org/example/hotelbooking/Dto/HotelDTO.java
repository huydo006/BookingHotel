package org.example.hotelbooking.Dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class HotelDTO {
//    private String hotelName;
//    private String hotelAddress;
//    private String description;
//    private List<RoomRequest> roomRequests;

    private String hotel_name;
    private String address;
    private String description;
    private List<RoomRequest> rooms;
}
