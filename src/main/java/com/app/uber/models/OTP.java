package com.app.uber.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author t0k02w6 on 11/07/22
 * @project uber_lld
 */

@Entity
@Table(name = "otp")
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OTP extends Auditable {
    private String code;
    private String sentToNumber;

    @Builder.Default
    private Integer attemptsMade = 0;

    @Builder.Default
    private boolean isValid = true;

    public static OTP randomOTP(String sentToNumber) {
        return OTP.builder()
                .code("0000")
                .sentToNumber(sentToNumber)
                .build();
    }

    public void resend() {
        //OTPService.sendOTP()
    }
}
