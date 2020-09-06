package at.fhj.swd.inventoryservice.repository;

import at.fhj.swd.inventoryservice.domain.Article;

import java.util.stream.Stream;

public interface ArticleRepository {
    Stream<Article> findAll();
}
