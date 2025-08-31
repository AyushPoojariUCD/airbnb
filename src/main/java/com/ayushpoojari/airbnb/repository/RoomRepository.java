package com.ayushpoojari.airbnb.repository;

import com.ayushpoojari.airbnb.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
}
