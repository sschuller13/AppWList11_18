package com.example.myapplication;

public class ListModel {

    private String ItemName = "";
    private String ROP = "";
    private String Quantity = "";

    public ListModel (String itemname, String rop, String quantity){

        this.ItemName = itemname;
        this.ROP = rop;
        this.Quantity = quantity;
    }

    public String getItemName(){
        return this.ItemName;
    }

    public String getROP(){
        return this.ROP;
    }

    public String getQuantity(){
        return this.Quantity;
    }




}