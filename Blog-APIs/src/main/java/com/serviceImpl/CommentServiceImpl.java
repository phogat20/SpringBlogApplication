package com.serviceImpl;

import javax.xml.stream.events.Comment;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.execeptions.ResourceNotFoundException;
import com.model.Comments;
import com.model.Post;
import com.payloads.CommentsDto;
import com.repositories.CommentRepo;
import com.repositories.PostRepo;
import com.services.CommentService;

@Service
public class CommentServiceImpl implements CommentService {

	@Autowired
	private PostRepo postRepo;

	@Autowired
	private CommentRepo commentRepo;

	@Autowired
	private ModelMapper modelMapper;

	@Override
	public CommentsDto createComment(CommentsDto commentsDto, Integer postId) {

		Post post = this.postRepo.findById(postId)
				.orElseThrow(() -> new ResourceNotFoundException("Post", "post id", postId));

		Comments comment = this.modelMapper.map(commentsDto, Comments.class);

		comment.setPost(post);
		
		Comments savedComment = commentRepo.save(comment);

		return this.modelMapper.map(savedComment, CommentsDto.class);
	}

	@Override
	public void deleteComment(Integer commentId) {
		Comments com = this.commentRepo.findById(commentId).orElseThrow(()->new ResourceNotFoundException("Comment", "comment id", commentId));
		
		this.commentRepo.delete(com);
	}

}
