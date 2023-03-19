package com.services;

import java.util.List;

import com.payloads.PostDto;
import com.payloads.PostResponse;

public interface PostService {

	PostDto createPost(PostDto postDto, Integer userId, Integer categoryId);

	PostDto updatePost(PostDto postDto, Integer postId);

	void deletePost(Integer postId);

	PostResponse getAllPost(Integer pageNumber, Integer pageSize, String sortBy, String sortDir);

	PostDto getPostById(Integer postId);

	PostResponse getPostsByCategory(Integer categoryId, Integer pageNumber, Integer pageSize);

	List<PostDto> getPostsByUser(Integer userId);

	List<PostDto> searchPosts(String keyword);
}
