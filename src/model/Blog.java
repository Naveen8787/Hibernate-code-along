package model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Entity
@Table(name="BLOG")

public class Blog{
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator="seq_blog")
	@SequenceGenerator(name="seq_blog",sequenceName="seq_blog",allocationSize=1,initialValue=1)
	private int blogId;
	@Column(name="TITLE")
	private String blogTitle;
	@Column(name="DESCRIPTION")
	private String blogDescription;
	@Column(name="POSTED_ON")
	private LocalDate postedOn;
	
	public int getBlogId() {
		return blogId;
	}
	public void setBlogId(int blogId) {
		this.blogId = blogId;
	}
	public String getBlogTitle() {
		return blogTitle;
	}
	public void setBlogTitle(String blogTitle) {
		this.blogTitle = blogTitle;
	}
	public String getBlogDescription() {
		return blogDescription;
	}
	public void setBlogDescription(String blogDescription) {
		this.blogDescription = blogDescription;
	}
	public LocalDate getPostedOn() {
		return postedOn;
	}
	public void setPostedOn(LocalDate postedOn) {
		this.postedOn = postedOn;
	}
}