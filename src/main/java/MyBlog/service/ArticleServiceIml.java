package MyBlog.service;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;

import MyBlog.domain.Article;
import MyBlog.domain.Category;
import MyBlog.service.ArticleService;
import org.springframework.stereotype.Service;

@Service
public class ArticleServiceIml implements ArticleService{
	private List<Article> articles;
	private List<Category> categories;
	
	public ArticleServiceIml() {
		
	}
	
	@Override
	public List<Article> getAllArticles(){
		return articles;
	}
	
	@Override
	public List<Category> getAllCategories(){
		return categories;
	}
	
	@Override
	public Category getCategory(int id) {
		for (Category category : categories) {
			if (id == category.getId()) {
				return category;
			}
		}
		
		return null;
	}
	
	@Override
	public Article get(int id) {
		for (Article article : articles) {
			if (id == article.getId()) {
				return article;
			}
		}
		
		return null;
	}
	
	@Override
	public Article save(Article article) {
		article.setId(getNextId());
		article.setDate(new Date());
		articles.add(article);
		
		return article;
	}
	
	@Override
	public Article update(Article article) {
		for (Article article2 : articles) {
			if (article2.getId() == article.getId()) {
				articles.set(article2.getId(), article);
				return article;
			}
		}
		
		return null;
	}
	
	@Override
	public int getNextId() {
		int id = 0;
		for (Article article : articles) {
			int artiId = article.getId();
			if (artiId > id) {
				id = artiId;
			}
		}
		return id;
	}
}
