package com.rmit.sept.itemmanagement.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Item {

    private String id;
    private String title;
    private String desc;
    private String imagePath;
    private double price;

}
