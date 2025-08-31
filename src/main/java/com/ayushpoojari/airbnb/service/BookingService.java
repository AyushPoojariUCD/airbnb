package com.ayushpoojari.airbnb.service;

import com.ayushpoojari.airbnb.dto.BookingDto;
import com.ayushpoojari.airbnb.dto.BookingRequest;
import com.ayushpoojari.airbnb.dto.GuestDto;

import java.util.List;

public interface BookingService {

    BookingDto initialiseBooking(BookingRequest bookingRequest);

    BookingDto addGuests(Long bookingId, List<GuestDto> guestDtoList);
}
