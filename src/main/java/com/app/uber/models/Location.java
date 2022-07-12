package com.app.uber.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author t0k02w6 on 11/07/22
 * @project uber_lld
 */
@Entity
@Table(name = "locations")
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Location extends Auditable {
    private String latitude;
    private String longitude;
    private String city;
    private String state;
    private String coutry;
    private String zipcode;
}
