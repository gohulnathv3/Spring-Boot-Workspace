package io.spring.springbootmongodb.resource;

import io.spring.springbootmongodb.model.GroceryItem;
import io.spring.springbootmongodb.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.naming.Name;
import java.util.List;
import java.util.Optional;

@RestController
public class GroceryItemController {

    @Autowired
    private ItemRepository repository;

    // Create grocery items
    void createGroceryItems() {
        System.out.println("Data Creating Started...");
        repository.save(new GroceryItem(1, "Britannia", 5, "Snacks"));
        System.out.println("Data Creating completed.");
    }

    // add grocery items
    @PostMapping("/addGroceryItem")
    public String saveGroceryItem(@RequestBody GroceryItem groceryItem) {
        repository.save(groceryItem);
        return "Added grocery item of this id: " + groceryItem.getId();
    }

    @GetMapping("/findAllGroceryData")
    public List<GroceryItem> getGroceryItems() {
        return repository.findAll();
    }


}
