package io.spring.springbootmongodb.repository;

import io.spring.springbootmongodb.model.GroceryItem;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

// it acts as a link between the model and database, and has all the methods for CRUD operations
public interface ItemRepository extends MongoRepository<GroceryItem, String> {

    @Query("{name:'?0'}") // This is used to find the data by using querying in mongodb by @Query
    GroceryItem findItemByName(String name);

    @Query(value = "{category:'?0'}", fields = "{'name':1, 'quantity': 1}")
    List<GroceryItem> findAll(String category);

    public long count();


}
