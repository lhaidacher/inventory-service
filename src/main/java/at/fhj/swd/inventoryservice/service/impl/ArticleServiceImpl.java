package at.fhj.swd.inventoryservice.service.impl;

import at.fhj.swd.inventoryservice.domain.Article;
import at.fhj.swd.inventoryservice.repository.ArticleRepository;
import at.fhj.swd.inventoryservice.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class ArticleServiceImpl implements ArticleService {
    private final ArticleRepository repository;

    @Autowired
    public ArticleServiceImpl(ArticleRepository repository) {
        this.repository = repository;
    }

    @Override
    public Set<Article> get(String keyword) {
        return repository.findAll()
                .filter(article -> article.getName().toLowerCase().contains(keyword.toLowerCase()))
                .collect(Collectors.toSet());
    }
}
