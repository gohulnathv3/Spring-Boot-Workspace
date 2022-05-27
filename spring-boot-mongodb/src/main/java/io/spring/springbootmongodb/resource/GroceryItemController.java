package io.spring.springbootmongodb.resource;

import io.spring.springbootmongodb.model.GroceryItem;
import io.spring.springbootmongodb.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GroceryItemController {

    @Autowired
    private ItemRepository repository;

    // Create grocery items
    void createGroceryItems(){
        System.out.println("Data Creating Started...");
        repository.save(new GroceryItem("Whole wheat biscuit", "Britannia", 5, "Snacks"));
        System.out.println("Data Creating completed.");
    }

    // add grocery items
    @PostMapping("/addGroceryItem")
    public String saveGroceryItem(@RequestBody GroceryItem groceryItem){
        repository.save(groceryItem);
        return "Added grocery item of this id: "+ groceryItem.getId();
    }

    @GetMapping("/findAllGroceryData")
    public List<GroceryItem> getGroceryItems(){
        return repository.findAll();
    }

}
