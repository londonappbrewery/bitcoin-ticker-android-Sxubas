package com.londonappbrewery.bitcointicker;

import android.util.Log;

import org.json.JSONException;
import org.json.JSONObject;

public class CurrencyModel {

    private double mPrice;
    private String mCurrency;

    public CurrencyModel (String currency, JSONObject response){
        this.mCurrency = currency;
        try {
            this.mPrice = response.getJSONObject("BTC" + currency).getDouble("last");
        } catch (JSONException e){
            e.printStackTrace();
            Log.d("AIR", "Error: " + e.getMessage());
        }
    }

    public double getPrice() {
        return mPrice;
    }

    public void setPrice(double price) {
        mPrice = price;
    }

    public String getCurrency() {
        return mCurrency;
    }

    public void setCurrency(String currency) {
        mCurrency = currency;
    }
}
