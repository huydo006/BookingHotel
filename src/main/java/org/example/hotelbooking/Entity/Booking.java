package org.example.hotelbooking.Entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "booking")
public class Booking {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long booking_id;

    @Column(name = "checkin_date", nullable = false)
    private Date checkin_date;

    @Column(name = "checkout_date", nullable = false)
    private Date checkout_date;

    @Column(name = "status", nullable = false)
    private String status;

    @ManyToOne
    @JoinColumn(name = "room_id" , nullable = false)
    private Room room;

    @ManyToOne
    @JoinColumn(name = "cus_id" ,nullable = false)
    private Customer customer;

    public Booking() {
    }
}
