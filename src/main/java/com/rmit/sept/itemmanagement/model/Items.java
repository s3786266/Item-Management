package com.rmit.sept.itemmanagement.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Items {

    private List<Item> itemList;

    public List<Item> getItemList() {
        if(itemList == null) {
            itemList = new ArrayList<>();
        }
        return itemList;
    }

    public Item updateItemDetails(Item itemDetails, String itemId){
        for(Item item:itemList)
        {
            if(item.getId().equals(itemId))
            {
                itemDetails.setId(itemDetails.getId());
                itemDetails.setTitle(itemDetails.getTitle());
                itemDetails.setDesc(itemDetails.getDesc());
                itemDetails.setImagePath(itemDetails.getImagePath());
                itemDetails.setPrice(itemDetails.getPrice());
            }
        }
        return itemDetails;
    }

    public Item getItemDetailsById(String itemId) {
        for(Item item:itemList)
        {
            if(item.getId().equals(itemId))
            {
               return item;
            }
        }
        return null;
    }

    public Item saveItemDetails(Item itemDetails){
        return itemDetails;
    }

    public Item deleteItemDetailsById(String itemId) {
        for(Item item:itemList)
        {
            if(item.getId().equals(itemId))
            {
                itemList.remove(item);
                return item;
            }
        }
        return null;
    }



}
