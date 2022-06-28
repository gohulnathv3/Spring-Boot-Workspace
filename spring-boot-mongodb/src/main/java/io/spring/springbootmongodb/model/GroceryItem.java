package io.spring.springbootmongodb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document("groceryitems") // this annotation is used to set the collection name that will be used by the model.
// if the collection doesn't exist, Mongodb will create it.
public class GroceryItem {
    @Id // The mongodb's document primary key_id annotation.
    private int id;
    private String name;
    private int quantity;
    private String category;

    public GroceryItem() {
    }

    public GroceryItem(int id, String name, int quantity, String category) {
        super();
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
