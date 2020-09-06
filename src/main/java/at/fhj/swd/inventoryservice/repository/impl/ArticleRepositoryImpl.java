package at.fhj.swd.inventoryservice.repository.impl;

import at.fhj.swd.inventoryservice.domain.Article;
import at.fhj.swd.inventoryservice.repository.ArticleRepository;
import com.github.javafaker.Faker;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

@Service
public class ArticleRepositoryImpl implements ArticleRepository {
    private static final int NUMBER_OF_ARTICLES = 1000;
    private static final Set<Article> articles = new HashSet<>();

    static {
        final Faker faker = Faker.instance();

        for (int x = 0; x < NUMBER_OF_ARTICLES; x++) {
            Article article = new Article();
            article.setEan(faker.code().ean13());
            article.setName(faker.commerce().productName());
            article.setMaterial(faker.commerce().material());
            article.setColor(faker.commerce().color());
            article.setPrice(faker.commerce().price(0, 10000));
            articles.add(article);
        }
    }

    @Override
    public Stream<Article> findAll() {
        return articles.stream();
    }
}
