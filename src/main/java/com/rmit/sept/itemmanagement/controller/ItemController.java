package com.rmit.sept.itemmanagement.controller;

import com.rmit.sept.itemmanagement.dao.ItemDAO;
import com.rmit.sept.itemmanagement.model.Item;
import com.rmit.sept.itemmanagement.model.Items;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ItemController {

    @Autowired
    ItemDAO itemDAO;

    @PostMapping("/item")
    public Item createItem (@RequestBody Item itemDetails) {
        return itemDAO.saveItemDetails(itemDetails);
    }

    @GetMapping ("/item/item{id}")
    public Item getItemDetails (@PathVariable Integer id) {
        return itemDAO.getItemDetails(id);
    }

    @GetMapping("/item/item")
    public Items getItemListDetails () {
        return itemDAO.getItemDetails();
    }

    @PutMapping("/item/item{id}")
    public Item updateItemDetails(@RequestBody Item itemDetails) {
        return itemDAO.updateItemDetails(itemDetails);
    }

    @DeleteMapping("/item/item")
    public Item deleteItemDetails() {
        return itemDAO.deleteItemDetails();
    }

}
