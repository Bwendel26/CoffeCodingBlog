package com.CoffeeCoding.CoffeeCodingAPI.controller;

import com.CoffeeCoding.CoffeeCodingAPI.model.Article;
import com.CoffeeCoding.CoffeeCodingAPI.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/articles")
public class ArticlesController {

    @Autowired
    private ArticleService service;

    @GetMapping(produces=MediaType.APPLICATION_JSON_VALUE)
    public List<Article> articles() {
        return service.findAllArticles();
    }

    @GetMapping(value = "/{id}",
                                produces= MediaType.APPLICATION_JSON_VALUE)
    public Article article(@PathVariable("id") Long id) {
        return service.findById(id);
    }

    @PostMapping(consumes=MediaType.APPLICATION_JSON_VALUE,
          produces=MediaType.APPLICATION_JSON_VALUE)
    public Article create(@RequestBody Article article) {
        return service.create(article);
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Article update(@RequestBody Article article) {
        return service.update(article);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Long id) {

        service.delete(id);

        return ResponseEntity.noContent().build();
    }
}
