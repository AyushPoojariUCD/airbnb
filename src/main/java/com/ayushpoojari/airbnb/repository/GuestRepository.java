package com.ayushpoojari.airbnb.repository;

import com.ayushpoojari.airbnb.entity.Guest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuestRepository extends JpaRepository<Guest, Long> {
}