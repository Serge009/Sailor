package org.matrix_soft.sailor.mobile.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CreditCardPayment extends Payment {

    @Expose
    @SerializedName("holder_name")  private     String      mHolderName;
    @Expose @SerializedName("number")       private     String      mNumber;
    @Expose @SerializedName("expiry_date")  private     String      mExpiryDate;
    @Expose @SerializedName("cvv_code")     private     String      mCVVCode;

    public CreditCardPayment() {}

    public String getHolderName() {
        return mHolderName;
    }

    public void setHolderName(String holderName) {
        mHolderName = holderName;
    }

    public String getNumber() {
        return mNumber;
    }

    public void setNumber(String number) {
        mNumber = number;
    }

    public String getExpiryDate() {
        return mExpiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        mExpiryDate = expiryDate;
    }

    public String getCVVCode() {
        return mCVVCode;
    }

    public void setCVVCode(String CVVCode) {
        mCVVCode = CVVCode;
    }
}
