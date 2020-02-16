package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	// Attributs
	private Date momment;
	private String title;
	private String content;
	private Integer likes;
	
	// Attribut of type list
	private List<Comments> comments = new ArrayList<>();
	
	// Constructores
	public Post() {
		
	}

	public Post(Date momment, String title, String content, Integer likes) {
		this.momment = momment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}
	
	// Getters and Setters
	public Date getMomment() {
		return momment;
	}

	public void setMomment(Date momment) {
		this.momment = momment;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public List<Comments> getComment() {
		return comments;
	}
	
	//Method for add comments
	public void addComment(Comments comment) {
		comments.add(comment);
		
	}
	
	// Remove comments
	public void removeComment(Comments comment) {
		comments.remove(comment);
		
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(title + "\n");
		sb.append(likes);
		sb.append(" likes - ");
		sb.append(sdf.format(momment) + "\n");
		sb.append(content + "\n");
		sb.append("Comments:\n");
		for (Comments c : comments) {
			sb.append(c.getText() + "\n");
		}
		return sb.toString();
		
		
	}
	

}
