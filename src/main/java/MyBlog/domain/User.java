package MyBlog.domain;

import java.io.Serializable;

public class User implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8416775965924886983L;
	private String userName;
	private String passWord;
	private int id;
	
	public void setUserName(String name) {userName = name;}
	public void setPassWord(String passWord) {this.passWord = passWord;}
	public void setId(int id) {this.id = id;}
	
	public String getUserName() {return userName;}
	public String getPassWord() {return passWord;}
	public int getId() {return id;}
}
