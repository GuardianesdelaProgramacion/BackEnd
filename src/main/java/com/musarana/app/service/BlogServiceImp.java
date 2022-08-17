package com.musarana.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musarana.app.entity.Blog;
import com.musarana.app.repository.IBlogRepository;
@Service
public class BlogServiceImp implements IBlogService{
	@Autowired
	IBlogRepository blogRepository;
	@Override
	public List<Blog> findAllBlog() {
		return (List<Blog>) blogRepository.findAll();
	}

	@Override
	public Blog saveBlog(Blog blog) {
		return blogRepository.save(blog);
	}

	@Override
	public Blog deleteBlogById(Long id) {
		Blog blog= findBlogbyId(id);
		blogRepository.deleteById(id);
		return blog;
		
	}

	@Override
	public Blog findBlogbyId(Long id) {
		return blogRepository.findById(id).orElse(null);
	}

}

