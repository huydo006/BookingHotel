package org.example.hotelbooking.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "hotel")
public class Hotel {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long hotel_id;

    @Column(name = "hotel_name", nullable = false)
    private String hotel_name;

    @Column(name = "address", nullable = false)
    private String address;

    @Column(name = "description", nullable = false)
    private String description;

    @OneToMany(mappedBy = "hotel", cascade = CascadeType.ALL, orphanRemoval = true)
    private java.util.List<Room> rooms;

    public Hotel() {
    }
}
