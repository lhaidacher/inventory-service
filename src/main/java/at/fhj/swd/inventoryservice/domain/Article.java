package at.fhj.swd.inventoryservice.domain;

import lombok.Data;

@Data
public class Article {
    private static final String PRICE_TEMPLATE = "%s €";
    private String ean;
    private String name;
    private String material;
    private String color;
    private String price;

    public String getPrice() {
        return String.format(PRICE_TEMPLATE, price);
    }
}
