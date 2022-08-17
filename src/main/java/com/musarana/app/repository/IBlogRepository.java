package com.musarana.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.musarana.app.entity.Blog;

public interface IBlogRepository extends CrudRepository<Blog, Long>{

}
