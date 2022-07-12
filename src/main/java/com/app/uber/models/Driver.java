package com.app.uber.models;

import lombok.*;

import javax.persistence.*;
import java.util.List;

/**
 * @author t0k02w6 on 11/07/22
 * @project uber_lld
 */
@Entity
@Table(name = "drivers")
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Driver extends Auditable {
    private String name;
    private Gender gender;
    @Builder.Default
    private boolean isCurrentlyAvailable = true;

    @OneToOne
    private Car car;

    @OneToOne(cascade = CascadeType.ALL)
    private Account account;

    @ManyToOne
    private Location location;

    @OneToMany(mappedBy = "driver")
    private List<Booking> bookings;

    @OneToOne
    private Booking currentlyActiveBooking;

}
