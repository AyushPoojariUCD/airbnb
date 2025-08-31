package com.ayushpoojari.airbnb.service;

import com.ayushpoojari.airbnb.dto.HotelDto;
import com.ayushpoojari.airbnb.dto.HotelPriceDto;
import com.ayushpoojari.airbnb.dto.HotelSearchRequest;
import com.ayushpoojari.airbnb.entity.Room;
import org.springframework.data.domain.Page;

public interface InventoryService {

    void initializeRoomForAYear(Room room);

    void deleteAllInventories(Room room);

    Page<HotelPriceDto> searchHotels(HotelSearchRequest hotelSearchRequest);
}
