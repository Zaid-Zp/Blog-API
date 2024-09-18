package com.BloggingAPI.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.BloggingAPI.entites.Blog;

@Service
public interface BlogService {
	
	public List<Blog> getBlog();
	public Blog getBlog(long blogId);
	public Blog addBlog(Blog blog);
	public Blog updateBlog(Blog blog);
	public void deleteBlog(long blogId);

}
