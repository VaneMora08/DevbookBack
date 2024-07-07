package com.devbook.formattech.service;

import com.devbook.formattech.Dto.PostDto;

import java.util.List;

public interface PostService {

    PostDto createPost (PostDto postDto);
    List<PostDto> getAllPosts();
    PostDto getPostById(int id);
    PostDto updatePost(int id, PostDto postDto);
    void deletePost(int id);
}
