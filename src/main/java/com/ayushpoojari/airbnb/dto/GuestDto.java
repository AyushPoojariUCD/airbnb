package com.ayushpoojari.airbnb.dto;

import com.ayushpoojari.airbnb.entity.User;
import com.ayushpoojari.airbnb.entity.enums.Gender;
import lombok.Data;

@Data
public class GuestDto {
    private Long id;
    private User user;
    private String name;
    private Gender gender;
    private Integer age;
}
