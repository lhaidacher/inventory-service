package at.fhj.swd.inventoryservice.service;

import at.fhj.swd.inventoryservice.domain.Article;

import java.util.Set;

public interface ArticleService {
    Set<Article> get(String keyword);
}
