package org.matrix_soft.sailor.mobile.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ProductPrice extends DefaultData {

	@Expose
    @SerializedName("product")          private     int     mProductId;
	@Expose @SerializedName("price")            private     double  mPrice;
	@Expose @SerializedName("currency")         private     int     mCurrencyId;

    public ProductPrice() {}

    public ProductPrice(     int id,
               int serverId,
               int productId,
               double price,
               int currencyId,
               int version) {
        super(id, serverId, "", version, 0);

        mProductId  = productId;
        mPrice      = price;
        mCurrencyId = currencyId;
    }

    public int getProductId() {
        return mProductId;
    }

    public void setProductId(int productId) {
        mProductId = productId;
    }

    public double getPrice() {
        return mPrice;
    }

    public void setPrice(double price) {
        mPrice = price;
    }

    public int getCurrencyId() {
        return mCurrencyId;
    }

    public void setCurrencyId(int currencyId) {
        mCurrencyId = currencyId;
    }
}
