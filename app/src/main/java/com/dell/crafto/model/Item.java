
package com.dell.crafto.model;

import com.google.gson.annotations.SerializedName;

public class Item {

    @SerializedName("description")
    private String mDescription;
    @SerializedName("id")
    private Long mId;
    @SerializedName("imge")
    private String mImge;
    @SerializedName("name")
    private String mName;
    @SerializedName("price")
    private Double mPrice;
    @SerializedName("seller_id")
    private Long mSellerId;

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public Long getId() {
        return mId;
    }

    public void setId(Long id) {
        mId = id;
    }

    public String getImge() {
        return mImge;
    }

    public void setImge(String imge) {
        mImge = imge;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public Double getPrice() {
        return mPrice;
    }

    public void setPrice(Double price) {
        mPrice = price;
    }

    public Long getSellerId() {
        return mSellerId;
    }

    public void setSellerId(Long sellerId) {
        mSellerId = sellerId;
    }

}
