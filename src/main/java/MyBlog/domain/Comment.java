package MyBlog.domain;

import java.io.Serializable;
import MyBlog.domain.User;

public class Comment implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5508958678882570850L;
	
	private String content;
	private User user;
	
	public void setContent(String content) {this.content = content;}
	public void setUser(User user) {this.user = user;}
	
	public String getContent() {return content;}
	public User getUser() {return user;}
}
