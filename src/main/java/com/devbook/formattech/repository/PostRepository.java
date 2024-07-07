package com.devbook.formattech.repository;

import com.devbook.formattech.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository <Post, Integer> {
}
