package com.BloggingAPI.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BloggingAPI.entites.Blog;

@Repository
public interface BlogDao extends JpaRepository<Blog, Long>{

}
