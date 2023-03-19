package com.services;

import com.payloads.CommentsDto;

public interface CommentService {
	
	CommentsDto createComment(CommentsDto commentsDto,Integer postId);
	
	void deleteComment(Integer commentId);
}
