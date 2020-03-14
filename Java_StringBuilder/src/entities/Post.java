package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.Comment;

public class Post {
	private Date moment;
	private String title;
	private String content;
	private int likes;
	
	private List<Comment> comments = new ArrayList();

	public Post() {
	}
	
	public Post(Date moment, String title, String content, int likes) {
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}
	
	
}
