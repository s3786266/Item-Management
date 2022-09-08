package com.rmit.sept.itemmanagement.controller;

import com.rmit.sept.itemmanagement.dao.ItemService;
import com.rmit.sept.itemmanagement.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ItemController {

    @Autowired
    ItemService itemService;

    @PostMapping("/item")
    public ResponseEntity<Item> createItem (@RequestBody Item itemDetails) {
        return itemService.saveItemDetails(itemDetails);
    }

    @GetMapping ("/item/item{id}")
    public ResponseEntity<Item> getItemDetails (@PathVariable String id) {
        return itemService.getItemDetails(id);
    }

    @GetMapping("/item/item")
    public ResponseEntity<Item> getItemListDetails () {
        return itemService.getItemListDetails();
    }

    @PutMapping("/item/item")
    public ResponseEntity<Item> updateItemDetails(@RequestBody Item itemDetails) {
        return itemService.updateItemDetails(itemDetails);
    }

    @DeleteMapping("/item/item")
    public ResponseEntity<Item> deleteItemDetails() {
        return itemService.deleteItemDetails();
    }

}
