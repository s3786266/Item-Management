package com.rmit.sept.itemmanagement.dao;

import com.rmit.sept.itemmanagement.model.Item;
import com.rmit.sept.itemmanagement.model.Items;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {

    @Autowired
    ItemDAO itemDAO;

    public Item saveItemDetails(Item itemDetails) {
        return itemDAO.saveItemDetails(itemDetails);
    }

    public Item getItemDetails(String id) {
        return itemDAO.getItemDetails(id);
    }

    public Items getItemListDetails() {
        return itemDAO.getItemDetails();
    }

    public Item updateItemDetails(Item itemDetails) {
        return itemDAO.updateItemDetails(itemDetails);
    }

    public Item deleteItemDetails() {
        return itemDAO.deleteItemDetails();
    }
}
