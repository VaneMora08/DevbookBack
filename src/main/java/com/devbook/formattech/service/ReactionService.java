package com.devbook.formattech.service;

import com.devbook.formattech.Dto.ReactionDto;

import java.util.List;

public interface ReactionService {

    ReactionDto createReaction (ReactionDto reactionDto);
    List<ReactionDto> getAllReactions();
    ReactionDto getReactionById(int id);
    ReactionDto updateReaction(int id, ReactionDto reactionDto);
    void deleteReaction(int id);
}
