package com.rmit.sept.itemmanagement.controller;

import com.rmit.sept.itemmanagement.dao.ItemDAO;
import com.rmit.sept.itemmanagement.model.Item;
import com.rmit.sept.itemmanagement.model.Items;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ItemController {

    @Autowired
    ItemDAO itemDAO;

    @PostMapping("/item")
    public Item createItem (@RequestBody Item itemDetails) {
        return itemDAO.saveItemDetails(itemDetails);
    }

    @GetMapping ("/item/item/{itemId}")
    public Item getItemDetails (@PathVariable String itemId) {
        return itemDAO.getItemDetailsById(itemId);
    }

    @GetMapping("/item/items")
    public Items getAllItemListDetails () {
        return itemDAO.getAllItemListDetails();
    }

    @PutMapping("/item/item/{itemId}")
    public Item updateItemDetails(@RequestBody Item itemDetails, @PathVariable String itemId) {
        return itemDAO.updateItemDetails(itemDetails, itemId);
    }

    @DeleteMapping("/item/item/{itemId}")
    public Item deleteItemDetails(@PathVariable String itemId) {
        return itemDAO.deleteItemDetails(itemId);
    }

}
