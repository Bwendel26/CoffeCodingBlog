package com.CoffeeCoding.CoffeeCodingAPI.service;

import com.CoffeeCoding.CoffeeCodingAPI.model.Article;
import com.CoffeeCoding.CoffeeCodingAPI.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.logging.Logger;

@Service
public class ArticleService {

    @Autowired
    private ArticleRepository repository;
    private Logger logger = Logger.getLogger(ArticleService.class.getName());

    public Article findById(Long id) {

        logger.info("finding article...");

        return repository.findById(id).orElseThrow(() -> new NullPointerException());
    }

    public List<Article> findAllArticles() {

        logger.info("finding all articles...");

        return repository.findAll();
    }

    public Article create(Article article) {

        logger.info("Creating new article... ID: " + article.getId() + " article title: " + article.getTitle());

        LocalDateTime localDateTime = LocalDateTime.now();
        String formatedDate = localDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        article.setPostedDate(formatedDate);

        return repository.save(article);
    }

    public Article update(Article article) {

        logger.info("Updating article ID: " + article.getId() + " Name: " + article.getTitle() );

        Article entity = repository.findById(article.getId()).orElseThrow(() -> new NullPointerException());

        entity.setTitle((article.getTitle()) == null ?  entity.getTitle() : article.getTitle());
        entity.setDescription(article.getDescription() == null ? entity.getDescription() : article.getDescription());
        entity.setText(article.getText() == null ? entity.getText() : article.getText());
        entity.setSources(article.getSources() == null ? entity.getSources() : article.getSources());
        entity.setEditor(article.getEditor() == null ? entity.getEditor() : article.getEditor());
        entity.setPostedDate(article.getPostedDate() == null ? entity.getPostedDate() : article.getPostedDate());
        entity.setViews(article.getViews() == null ? entity.getViews() : article.getViews());

        return repository.save(article);
    }

    public void delete(Long id) {


        logger.info("Deleting article ID: " + id);

        Article entity = repository.findById(id).orElseThrow(() -> new NullPointerException());

        repository.delete(entity);
    }
}