package com.m2i.formation.media.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the media database table.
 * 
 */
@Entity
@Table(name="media")
@NamedQuery(name="Media.findAll", query="SELECT m FROM Media m")
public class Media implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int id;

	private int category;

	@Temporal(TemporalType.DATE)
	private Date date;

	@Column(length=25)
	private String isbn;

	@Column(length=25)
	private String lang;

	private int nbPage;

	private int nbTrack;

	@Column(nullable=false)
	private float price;

	private Integer publisherId;

	@Column(nullable=false, length=25)
	private String title;

	@Column(nullable=false)
	private int type;

	public Media() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCategory() {
		return this.category;
	}

	public void setCategory(int category) {
		this.category = category;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getIsbn() {
		return this.isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public int getNbPage() {
		return this.nbPage;
	}

	public void setNbPage(int nbPage) {
		this.nbPage = nbPage;
	}

	public int getNbTrack() {
		return this.nbTrack;
	}

	public void setNbTrack(int nbTrack) {
		this.nbTrack = nbTrack;
	}

	public float getPrice() {
		return this.price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getPublisherId() {
		return this.publisherId;
	}

	public void setPublisherId(int publisherId) {
		this.publisherId = publisherId;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getType() {
		return this.type;
	}

	public void setType(int type) {
		this.type = type;
	}

}