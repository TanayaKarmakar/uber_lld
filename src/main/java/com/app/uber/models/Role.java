package com.app.uber.models;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author t0k02w6 on 12/07/22
 * @project uber_lld
 */
@Entity
@Table(name = "roles")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Role extends Auditable{
    @Column(unique = true, nullable = false)
    private String name;
    private String description;
}
