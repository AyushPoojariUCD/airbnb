package com.ayushpoojari.airbnb.controller;

import com.ayushpoojari.airbnb.dto.HotelDto;
import com.ayushpoojari.airbnb.dto.HotelInfoDto;
import com.ayushpoojari.airbnb.dto.HotelPriceDto;
import com.ayushpoojari.airbnb.dto.HotelSearchRequest;
import com.ayushpoojari.airbnb.service.HotelService;
import com.ayushpoojari.airbnb.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/hotels")
@RequiredArgsConstructor
public class HotelBrowseController {

    private final InventoryService inventoryService;
    private final HotelService hotelService;

    @GetMapping("/search")
    public ResponseEntity<Page<HotelPriceDto>> searchHotels(@RequestBody HotelSearchRequest hotelSearchRequest) {

        var page = inventoryService.searchHotels(hotelSearchRequest);
        return ResponseEntity.ok(page);
    }

    @GetMapping("/{hotelId}/info")
    public ResponseEntity<HotelInfoDto> getHotelInfo(@PathVariable Long hotelId) {
        return ResponseEntity.ok(hotelService.getHotelInfoById(hotelId));
    }

}
