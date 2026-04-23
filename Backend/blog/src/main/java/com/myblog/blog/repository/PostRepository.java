package com.myblog.blog.repository;

import com.myblog.blog.model.PostClass;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<PostClass, Long> {
	 List<PostClass> findByAuthor(String author);

}
