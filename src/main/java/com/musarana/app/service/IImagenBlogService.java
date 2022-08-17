package com.musarana.app.service;

import java.util.List;

import com.musarana.app.entity.ImagenBlog;

public interface IImagenBlogService {
	public List<ImagenBlog> findAllImagenBlog();
	public ImagenBlog saveImagenBlog(ImagenBlog imagenblog);
	public ImagenBlog deleteImagenBlogById(Long id);
	public ImagenBlog findImagenBlogbyId(Long id);
}
