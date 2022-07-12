package com.app.uber.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author t0k02w6 on 11/07/22
 * @project uber_lld
 */
@Entity
@Table(name = "cars")
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Car extends Auditable {
    private String licensePlateNumber;
    private String model;
    private String brand;

    @ManyToOne
    private Color color;

    @OneToOne
    private Driver driver;

    private CarType carType;
}
