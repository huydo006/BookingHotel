package org.example.hotelbooking.Repository;

import org.example.hotelbooking.Entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotel, Long> {
}
