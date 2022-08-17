package com.musarana.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.musarana.app.entity.Blog;
import com.musarana.app.service.IBlogService;
@CrossOrigin(origins="*")
@RestController
@RequestMapping(path="/api")
public class BlogRestController {
	@Autowired
	IBlogService blogService;
	
	@GetMapping("/blog")
	public List <Blog> blog(){
		return blogService.findAllBlog();
	}

	@GetMapping("/blog/{id}")
	public Blog blogById(@PathVariable Long id) {		
		return blogService.findBlogbyId(id);
	}
	
	@PostMapping("/blog")
	public Blog newCustomer(@RequestBody Blog blog) {
		blog.setIdBlog(null);
		return blogService.saveBlog(blog);
	}
	
	@PutMapping("/blog")
	public Blog replaceCustomer(@RequestBody Blog blog) {
		//Filtros para asegurar que esté un ID y exista
		return blogService.saveBlog(blog);
	}
	
	@DeleteMapping("blog/{id}")
	public Blog byeBlog(@PathVariable Long id) {
		return blogService.deleteBlogById(id);
	}
	
}
