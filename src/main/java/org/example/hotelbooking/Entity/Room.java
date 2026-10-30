package org.example.hotelbooking.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@Entity
@Table
public class Room {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long room_id;

    @Column(name = "room_type", nullable = false)
    private String room_type;

    @Column(name = "capacity" ,nullable = false)
    private Integer capacity;

    @Column(name = "unit_price", nullable = false)
    private BigDecimal unit_price;

    @Column(name = "available", nullable = false)
    private String available;

    @ManyToOne
    @JoinColumn(name = "hotel_id", nullable = false)
    private Hotel hotel;

    @OneToMany(mappedBy = "room")
    List<Booking> bookingList;

    public Room() {
    }
}
