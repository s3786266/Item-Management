package com.rmit.sept.itemmanagement.dao;

import com.rmit.sept.itemmanagement.model.Item;
import com.rmit.sept.itemmanagement.model.Items;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class ItemDAO {

    private static Items itemDetails = new Items();

    static
    {
        itemDetails.getItemList().add(new Item("01", "item 1", "this is item 1", "//image-path",12.0));
        itemDetails.getItemList().add(new Item("02", "item 2", "this is item 2", "//image-path", 13.0));
        itemDetails.getItemList().add(new Item("03", "item 3", "this is item 3", "//image-path", 14.0));
    }

    public Item saveItemDetails(Item newItemDetails) {
        return itemDetails.saveItemDetails(newItemDetails);
    }

    public Item getItemDetailsById(String itemId) {
        return itemDetails.getItemDetailsById(itemId);
    }

    public Items getAllItemListDetails() {
        return itemDetails;
    }

    public Item updateItemDetails(Item newItemDetails, String itemId) {
        return itemDetails.updateItemDetails(newItemDetails, itemId);
    }

    public Item deleteItemDetails(String itemId) {
        return itemDetails.deleteItemDetailsById(itemId);
    }
}
