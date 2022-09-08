package com.rmit.sept.itemmanagement.model;

import java.util.ArrayList;
import java.util.List;

public class Items {

    private List<Item> itemList;

    public List<Item> getTeacherList() {
        if(itemList == null) {
            itemList = new ArrayList<>();
        }
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }
}
