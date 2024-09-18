package com.BloggingAPI.entites;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Blog {

	@Id
	private long id;
	private String Blog_title;
	private String Blog_details;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getBlog_title() {
		return Blog_title;
	}

	public void setBlog_title(String blog_title) {
		Blog_title = blog_title;
	}

	public String getBlog_details() {
		return Blog_details;
	}

	public void setBlog_details(String blog_details) {
		Blog_details = blog_details;
	}

	public Blog() {
		super();
		// TODO Auto-generated constructor stub
	}

}
