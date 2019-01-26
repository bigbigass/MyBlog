package MyBlog.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import MyBlog.domain.Comment;

public class Article implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2376475132110646541L;
	
	private String author;
	private Date date;
	private String title;
	private String content;
	private int like;
	private List<Comment> comments;

	public void setAuthor(String author) {this.author = author;}
	public void setDate(Date date) {this.date = date;}
	public void setTitle(String title) {this.title = title;}
	public void setContent(String content) {this.content = content;}
	public void setLike(int like) {this.like = like;}
	public void setComments(List<Comment> comments) {this.comments = comments;}
	
	public String getAuthor() {return author;}
	public Date getDate() {return date;}
	public String getTitle() {return title;}
	public String getContent() {return content;}
	public int getLike() {return like;}
	public List<Comment> getComments(){return comments;}
}
