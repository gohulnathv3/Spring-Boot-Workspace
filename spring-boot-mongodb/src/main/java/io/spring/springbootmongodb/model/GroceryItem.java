package io.spring.springbootmongodb.model;

import org.springframework.data.annotation.Id;


@
public class GroceryItem {
    @Id
    private String id;
    private String name;
    private int quantity;
    private String category;

}
