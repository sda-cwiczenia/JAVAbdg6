package com.sda.blog2.repository;

import com.sda.blog2.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface CommentRepository extends JpaRepository<Comment,Long> {
    List<Comment> findAllByPostId(Long id);
}
