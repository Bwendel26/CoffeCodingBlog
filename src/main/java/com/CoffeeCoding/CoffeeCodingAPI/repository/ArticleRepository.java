package com.CoffeeCoding.CoffeeCodingAPI.repository;

import com.CoffeeCoding.CoffeeCodingAPI.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepository extends JpaRepository <Article, Long> {
}
