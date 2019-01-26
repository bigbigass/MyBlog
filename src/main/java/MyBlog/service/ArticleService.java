package MyBlog.service;

import java.util.List;
import MyBlog.domain.Article;
import MyBlog.domain.Category;

public interface ArticleService {
	public List<Article> getAllArticles();
	public List<Category> getAllCategories();
	public Category getCategory(int id);
	public Article get(int id);
	public Article save(Article article);
	public Article update(Article article);
	public int getNextId();
}
