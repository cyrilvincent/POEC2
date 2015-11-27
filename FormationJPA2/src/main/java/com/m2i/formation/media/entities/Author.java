package com.m2i.formation.media.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the author database table.
 * 
 */
@Entity
@Table(name="author")
@NamedQuery(name="Author.findAll", query="SELECT a FROM Author a")
public class Author implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(length=25)
	private String firstName;

	@Column(length=25)
	private String lastName;

	//bi-directional many-to-many association to Media
	@ManyToMany
	@JoinTable(
		name="mediaauthor"
		, joinColumns={
			@JoinColumn(name="authorId", nullable=false)
			}
		, inverseJoinColumns={
			@JoinColumn(name="mediaId", nullable=false)
			}
		)
	private List<Media> medias;

	public Author() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public List<Media> getMedias() {
		return this.medias;
	}

	public void setMedias(List<Media> medias) {
		this.medias = medias;
	}

}