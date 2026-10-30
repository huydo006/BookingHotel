package org.example.hotelbooking.Controller;

import org.example.hotelbooking.Dto.HotelDTO;
import org.example.hotelbooking.Entity.Hotel;
import org.example.hotelbooking.Service.HotelService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hotel")
public class HotelController {
    private final HotelService hotelService;
    public HotelController(HotelService hotelService) {
        this.hotelService = hotelService;
    }

    @PostMapping
    public HotelDTO createHotel(@RequestBody HotelDTO hotel){
        return hotelService.createHotel(hotel);
    }

}
