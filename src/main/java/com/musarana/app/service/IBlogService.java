package com.musarana.app.service;

import java.util.List;

import com.musarana.app.entity.Blog;

public interface IBlogService {
		public List<Blog> findAllBlog();
		public Blog saveBlog(Blog blog);
		public Blog deleteBlogById(Long id);
		public Blog findBlogbyId(Long id);

}
