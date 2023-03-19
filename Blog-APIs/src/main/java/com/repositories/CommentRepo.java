package com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Comments;

public interface CommentRepo extends JpaRepository<Comments,Integer>{
	
}
