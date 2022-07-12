package com.app.uber.models;

import lombok.*;

import javax.persistence.*;
import java.util.List;

/**
 * @author t0k02w6 on 11/07/22
 * @project uber_lld
 */
@Entity
@Table(name = "bookings")
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Booking extends Auditable {
    private BookingStatus bookingStatus;

    private BookingType bookingType;

    @OneToOne
    private OTP rideStartOtp;

    @OneToOne
    private PaymentReceipt paymentReceipt;

    @ManyToOne
    private Passenger passenger;

    @ManyToOne
    private Driver driver;

    @ManyToMany
    private List<Location> locations;
}
