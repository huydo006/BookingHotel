package org.example.hotelbooking.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(
            strategy = jakarta.persistence.GenerationType.IDENTITY
    )
    private Long Cus_id;

    @Column(name = "Cus_name", nullable = false)
    private String Cus_name;

    @Column(name = "Cus_phone", nullable = false)
    private String Cus_phone;

    @OneToMany(mappedBy = "customer")
    List<Booking> bookingList;

    public Customer() {
    }
}
