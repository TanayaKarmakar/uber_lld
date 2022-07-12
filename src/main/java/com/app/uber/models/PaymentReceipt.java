package com.app.uber.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.math.BigDecimal;

/**
 * @author t0k02w6 on 11/07/22
 * @project uber_lld
 */
@Entity
@Table(name = "paymentreceipts")
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PaymentReceipt extends Auditable {
    private BigDecimal amount;


    @OneToOne
    private Booking booking;

    @ManyToOne
    private PaymentGateway paymentGateway;

}
