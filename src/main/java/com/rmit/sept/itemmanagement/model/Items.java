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

//    private List<Item> itemList;

    public List<Item> itemList;

    public List<Item> getItemList() {
        if(itemList == null) {
            itemList = new ArrayList<>();
        }
        return itemList;
    }

    public Item updateItemDetails(Item itemDetails){
        itemDetails.setId(itemDetails.getId());
        itemDetails.setName(itemDetails.getName());
        itemDetails.setDesc(itemDetails.getDesc());
        itemDetails.setImagePath(itemDetails.getImagePath());
        itemDetails.setPrice(itemDetails.getPrice());
        return itemDetails;
    }

    public Item saveItemDetails(Item itemDetails){
        return itemDetails;
    }

//    public Item deleteItemDetails(){
//        return null;
//    }

}
