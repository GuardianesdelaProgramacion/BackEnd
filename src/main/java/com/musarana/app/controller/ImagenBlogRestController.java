package com.musarana.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.musarana.app.entity.ImagenBlog;
import com.musarana.app.service.IImagenBlogService;
@CrossOrigin(origins="*")
@RestController
@RequestMapping(path="/api")
public class ImagenBlogRestController {
	@Autowired
	IImagenBlogService imagenblogService;
	@GetMapping("/imgblog")
	public List <ImagenBlog> imagenblog(){
		return imagenblogService.findAllImagenBlog();
	}

}