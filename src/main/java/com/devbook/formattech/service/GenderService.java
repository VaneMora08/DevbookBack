package com.devbook.formattech.service;

import com.devbook.formattech.Dto.GenderDto;

import java.util.List;

public interface GenderService {

    GenderDto createGender (GenderDto genderDto);
    List<GenderDto> getAllGenders();
    GenderDto getGenderById(int id);
    GenderDto updateGender(int id, GenderDto genderDto);
    void deleteGender(int id);

}
