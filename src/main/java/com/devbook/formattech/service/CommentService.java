package com.devbook.formattech.service;

import com.devbook.formattech.Dto.CommentDto;

import java.util.List;

public interface CommentService {

    CommentDto createComment (CommentDto commentDto);
    List<CommentDto> getAllComments();
    CommentDto getCommentById(int id);
    CommentDto updateComment(int id, CommentDto commentDto);
    void deleteComment(int id);
}
