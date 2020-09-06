package at.fhj.swd.inventoryservice.controller;

import at.fhj.swd.inventoryservice.domain.Article;
import at.fhj.swd.inventoryservice.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/articles")
public class InventoryController {
    private final ArticleService service;

    @Autowired
    public InventoryController(ArticleService service) {
        this.service = service;
    }

    @GetMapping
    public Set<Article> getOverviews(@RequestParam(value = "keyword", required = false, defaultValue = "") String keyword) {
        return service.get(keyword);
    }
}
