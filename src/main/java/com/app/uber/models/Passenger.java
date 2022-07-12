package com.app.uber.models;

import lombok.*;

import javax.persistence.*;
import java.util.List;

/**
 * @author t0k02w6 on 11/07/22
 * @project uber_lld
 */
@Entity
@Table(name = "passengers")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Passenger extends Auditable{
    private String name;

    private Gender gender;

    @ManyToOne
    private Location location;

    @OneToMany(mappedBy = "passenger")
    private List<Booking> bookings;

    @OneToOne(cascade = CascadeType.ALL)
    private Account account;

}
