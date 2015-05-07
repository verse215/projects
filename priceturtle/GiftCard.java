package com.priceturtle;

/**
 * Created by verse on 11/23/14.
 *
 * Class represents gift card object
 */
public class GiftCard{
    public final String retailer;
    public final String value;
    public final String price;
    public final String savings;

    public GiftCard(String retailer, String value, String price, String savings){
        this.retailer = retailer;
        this.value = value;
        this.price = price;
        this.savings = savings;
    }
}