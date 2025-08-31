package com.ayushpoojari.airbnb.repository;

import com.ayushpoojari.airbnb.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
