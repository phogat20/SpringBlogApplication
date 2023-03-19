package com.payloads;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;


import com.model.Comments;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PostDto {
	private Integer postId;

	private String title;

	private String content;

	private String imageName;

	private Date addDate;

	private CategoryDto category;

	private UserDto user;
	
	private Set<CommentsDto> comments = new HashSet<>();
}
