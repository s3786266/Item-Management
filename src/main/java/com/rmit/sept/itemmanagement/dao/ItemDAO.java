package com.rmit.sept.itemmanagement.dao;

import com.rmit.sept.itemmanagement.model.Item;
import com.rmit.sept.itemmanagement.model.Items;
import org.springframework.stereotype.Repository;

@Repository
public class ItemDAO {

        private static Items itemDetails = new Items();

    static
    {
        itemDetails.getItemList().add(new Item(01, "item 1", "this is item 1", "//image-path", "12.0"));
        itemDetails.getItemList().add(new Item(02, "item 2", "this is item 2", "//image-path", "13.0"));
        itemDetails.getItemList().add(new Item(03, "item 3", "this is item 3", "//image-path", "14.0"));
    }

    public Item saveItemDetails(Item itemDetails) {
        return null;
    }

    public Item getItemDetails(String id) {

        itemDetails.getItemList().getId(id);
    }

    public Items getItemDetails() {
        return itemDetails;
    }

    public Item updateItemDetails(Item itemDetails) {
        return itemDetails;
    }

    public Item deleteItemDetails() {
        return null;
    }
}

