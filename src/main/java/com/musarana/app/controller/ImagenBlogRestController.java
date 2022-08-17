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
	
	@GetMapping("/imgblog/{id}")
	public ImagenBlog imagenBlog(@PathVariable Long id) {		
		return imagenblogService.findImagenBlogbyId(id);
	}

	@PostMapping("/imgblog")
	public ImagenBlog newImagenBlog(@RequestBody ImagenBlog imagenBlog) {
		imagenBlog.setIdImagenBlog(null);
		return imagenblogService.saveImagenBlog(imagenBlog);
	}
	
	@PutMapping("/imgblog")
	public ImagenBlog replaceImagenBlog(@RequestBody ImagenBlog imagenBlog) {
		//Filtros para asegurar que esté un ID y exista
		return imagenblogService.saveImagenBlog(imagenBlog);
	}

	@DeleteMapping("imgblog/{id}")
	public ImagenBlog byeImagenBlog(@PathVariable Long id) {
		return imagenblogService.deleteImagenBlogById(id);
	}
}