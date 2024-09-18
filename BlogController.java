package com.BloggingAPI.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.BloggingAPI.Service.BlogService;
import com.BloggingAPI.entites.Blog;

@RestController
public class BlogController {

	@Autowired
	private BlogService blogService;
	
	
	@GetMapping("/home")
	public String home()
	{
		return "This is Blog home page";
		
	}
//	get all the blogs
	@GetMapping("/blogs")
	public List<Blog> getBlog()
	{
		return this.blogService.getBlog();
		
	}
	
// get details of specific blog
	@GetMapping("/blogs/{blogId}")
	public Blog getBlog(@PathVariable long blogId)
	{
		return this.blogService.getBlog(blogId);
		
	}
//	create or add a new blog
	@PostMapping("/blog")
	public Blog addBlog(@RequestBody Blog blog)
	{
		return this.blogService.addBlog(blog);
		
	}
//	update an existing blog
	@PutMapping("/blogs")
	public Blog updateBlog(@RequestBody Blog blog)
	{
		return this.blogService.updateBlog(blog);
		
	}
//	Delete a blog
	@DeleteMapping("/blogs/{blogId}")
	public void deleteBlog(@PathVariable String blogId)
	{
		this.blogService.deleteBlog(Long.parseLong(blogId));
		
	}
}
