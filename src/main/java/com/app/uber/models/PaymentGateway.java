package com.app.uber.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author t0k02w6 on 11/07/22
 * @project uber_lld
 */
@Entity
@Table(name = "paymentgateway")
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PaymentGateway extends Auditable{
    private String name;
}
