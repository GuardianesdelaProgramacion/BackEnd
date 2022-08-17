package com.musarana.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
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

}
