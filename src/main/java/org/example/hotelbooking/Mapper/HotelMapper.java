package org.example.hotelbooking.Mapper;

import org.example.hotelbooking.Dto.HotelDTO;
import org.example.hotelbooking.Dto.RoomRequest;
import org.example.hotelbooking.Entity.Hotel;
import org.example.hotelbooking.Entity.Room;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface HotelMapper {
    Hotel toHotelEntity(HotelDTO hotelDTO);

    HotelDTO toHotelDto(Hotel hotel);
    Room toRoomEntity(RoomRequest roomRequest);
}
