package com.sda.blog2.repository;


import com.sda.blog2.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post,Long> {
    Post findFirstByTitle(String title);
}
