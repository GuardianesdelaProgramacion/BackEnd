package com.musarana.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musarana.app.entity.ImagenBlog;
import com.musarana.app.repository.IImagenBlogRepository;
@Service
public class ImagenBlogServiceImp implements IImagenBlogService{
	@Autowired
	IImagenBlogRepository imagenBlogRepository;
	@Override
	public List<ImagenBlog> findAllImagenBlog() {
		return (List<ImagenBlog>) imagenBlogRepository.findAll();
	}

	@Override
	public ImagenBlog saveImagenBlog(ImagenBlog imagenblog) {
		// TODO Auto-generated method stub
		return imagenBlogRepository.save(imagenblog);
	}

	@Override
	public ImagenBlog deleteImagenBlogById(Long id) {
		ImagenBlog imagenblog= findImagenBlogbyId(id);
		imagenBlogRepository.deleteById(id);
		return imagenblog;
	}

	@Override
	public ImagenBlog findImagenBlogbyId(Long id) {
		// TODO Auto-generated method stub
		return imagenBlogRepository.findById(id).orElse(null);
	}

}

