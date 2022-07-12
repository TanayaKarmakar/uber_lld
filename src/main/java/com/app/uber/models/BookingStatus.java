package com.app.uber.models;

/**
 * @author t0k02w6 on 11/07/22
 * @project uber_lld
 */
public enum BookingStatus {
    REQUESTED, //driver not assigned
    SCHEDULED, //driver is assigned for future
    CAB_ARRIVED, //driver has reached passenger's location
    ONGOING, //ride is in progress
    COMPLETED,
    CANCELLED // passenger or driver cancelled the booking
}
