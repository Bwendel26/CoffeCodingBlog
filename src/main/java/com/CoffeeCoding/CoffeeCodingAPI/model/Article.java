package com.CoffeeCoding.CoffeeCodingAPI.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "articles")
public class Article implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "title", nullable = false, length = 120)
    private String title;
    @Column(name = "description_text", nullable = false)
    private String description;
    @Column(name = "full_text", nullable = false)
    private String text;
    @Column(name = "sources")
    private String sources;
    @Column(name = "editor", length = 120)
    private String editor;
    @Column(name = "posted_date")
    private String postedDate;
    @Column(name = "views")
    private Long views;

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getSources() {
        return sources;
    }

    public void setSources(String sources) {
        this.sources = sources;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public String getPostedDate() {
        return postedDate;
    }

    public void setPostedDate(String postedDate) {
        this.postedDate = postedDate;
    }

    public Long getViews() {
        return views;
    }

    public void setViews(Long views) {
        this.views = views;
    }
}
