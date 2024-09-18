package com.BloggingAPI.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BloggingAPI.DAO.BlogDao;
import com.BloggingAPI.entites.Blog;

@Service
public class BlogServiceImpl implements BlogService {

	@Autowired
	private BlogDao blogDao;

	@Override
	public List<Blog> getBlog() {
		
		return blogDao.findAll();
	}

	@SuppressWarnings("deprecation")
	@Override
	public Blog getBlog(long blogId) {
		
		return blogDao.getOne(blogId);
	}

	@Override
	public Blog addBlog(Blog blog) {
		blogDao.save(blog);
		return blog;
	}

	@Override
	public Blog updateBlog(Blog blog) {
		blogDao.save(blog);
		return blog;
	}

	@Override
	public void deleteBlog(long blogId) {
		Blog entity = blogDao.getOne(blogId);
		blogDao.delete(entity);
		
	}

	
	

}
