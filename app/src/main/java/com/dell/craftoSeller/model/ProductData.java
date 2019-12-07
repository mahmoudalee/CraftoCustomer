
package com.dell.craftoSeller.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class ProductData {

    @SerializedName("items")
    private List<Item> mItems;

    public List<Item> getItems() {
        return mItems;
    }

    public void setItems(List<Item> items) {
        mItems = items;
    }

}
