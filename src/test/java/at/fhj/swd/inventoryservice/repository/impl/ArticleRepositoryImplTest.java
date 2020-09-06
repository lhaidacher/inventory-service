package at.fhj.swd.inventoryservice.repository.impl;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArticleRepositoryImplTest {
    @Test
    public void foo() {
        assertNotNull(new ArticleRepositoryImpl().findAll());
    }
}