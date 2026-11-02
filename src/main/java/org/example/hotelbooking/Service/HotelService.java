package org.example.hotelbooking.Service;

import jakarta.transaction.Transactional;
import org.example.hotelbooking.Dto.HotelDTO;
import org.example.hotelbooking.Dto.RoomRequest;
import org.example.hotelbooking.Entity.Hotel;
import org.example.hotelbooking.Entity.Room;
import org.example.hotelbooking.Mapper.HotelMapper;

import org.example.hotelbooking.Repository.HotelRepository;
import org.springframework.stereotype.Service;

@Service
public class HotelService {
    private final HotelRepository hotelRepository;
    private final HotelMapper hotelMapper;



    public HotelService(HotelRepository hotelRepository, HotelMapper hotelMapper) {
        this.hotelRepository = hotelRepository;
        this.hotelMapper = hotelMapper;

    }

    @Transactional
    public HotelDTO createHotel(HotelDTO hotel) {
        // Implement the logic to create a hotel
//        Hotel newHotel = new Hotel();
//        newHotel.setHotel_name(hotel.getHotelName());
//        newHotel.setAddress(hotel.getHotelAddress());
//        newHotel.setDescription(hotel.getDescription());
//        List<Room> roomList = new ArrayList<>();
//        for (RoomRequest roomRequest : hotel.getRoomRequests()){
//            Room room = new Room();
//            room.setCapacity(roomRequest.getCapacity());
//            room.setRoom_type(roomRequest.getRoomType());
//            room.setAvailable(roomRequest.getAvailable());
//            room.setUnit_price(roomRequest.getUnitPrice());
//            room.setHotel(newHotel);
//            roomList.add(room);
//        }
//        newHotel.setRooms(roomList);
//        hotelRepository.save(newHotel);
//        return hotel;


        Hotel newHotel = hotelMapper.toHotelEntity(hotel);

        for (Room r :newHotel.getRooms()){
            r.setHotel(newHotel);
        }
        hotelRepository.save(newHotel);
        return hotelMapper.toHotelDto(newHotel);





    }
}
