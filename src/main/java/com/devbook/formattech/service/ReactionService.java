package com.devbook.formattech.service;

import com.devbook.formattech.Dto.CountryDto;
import com.devbook.formattech.Dto.ReactionDto;

import java.util.List;

public interface ReactionService {

    ReactionDto createReaction (ReactionDto reactionDto);
    List<ReactionDto> getAllReactions();
    ReactionDto getReactionById(int id);
    ReactionDto updateReaction(int id, CountryDto countryDto);
    void deleteCountry(int id);
}
