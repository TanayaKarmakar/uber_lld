package com.app.uber.models;

import lombok.Getter;
import lombok.Setter;
import lombok.Singular;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @author t0k02w6 on 11/07/22
 * @project uber_lld
 */
@Entity
@Table(name = "accounts")
@Setter
@Getter
public class Account extends Auditable {
    @Column(unique = true)
    private String phoneNumber;

    @NotNull
    private String password;

    @ManyToMany(fetch = FetchType.EAGER)
    @Singular
    private List<Role> roles;

}
