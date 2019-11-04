package com.example.myapplication;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import android.support.v7.app.AppCompatActivity;

public class Inventory_Item extends AppCompatActivity {
    ConnectionClass connectionClass;

    public String itemName, itemDescrip, itemQTY, itemSKU, itemID, itemUOM, itemCostpUnit, itemMinToNoti, itemROP;

    public Inventory_Item(String s) {
    }

    public Inventory_Item() {

    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDescrip() {
        return itemDescrip;
    }

    public void setItemDescrip(String itemDescrip) {
        this.itemDescrip = itemDescrip;
    }

    public String getItemQTY() {
        return itemQTY;
    }

    public void setItemQTY(String itemQTY) {
        this.itemQTY = itemQTY;
    }

    public String getItemSKU() {
        return itemSKU;
    }

    public void setItemSKU(String itemSKU) {
        this.itemSKU = itemSKU;
    }

    public String getItemID() {
        return itemID;
    }

    public void setItemID(String itemID) {
        this.itemID = itemID;
    }

    public String getItemUOM() {
        return itemUOM;
    }

    public void setItemUOM(String itemUOM) {
        this.itemUOM = itemUOM;
    }

    public String getItemCostpUnit() {
        return itemCostpUnit;
    }

    public void setItemCostpUnit(String itemCostpUnit) {
        this.itemCostpUnit = itemCostpUnit;
    }

    public String getItemMinToNoti() {
        return itemMinToNoti;
    }

    public void setItemMinToNoti(String itemMinToNoti) {
        this.itemMinToNoti = itemMinToNoti;
    }

    public String getItemROP() {
        return itemROP;
    }

    public void setItemROP(String itemROP) {
        this.itemROP = itemROP;
    }
   /* public static void main(String[] args) {

        ConnectionClass connectionClass;
        connectionClass = new ConnectionClass();

        Connection connect = connectionClass.CONN();
        try  {
            Statement stmt = connect.createStatement();
            String SQL = "SELECT * FROM Production.Product;";
            ResultSet rs = stmt.executeQuery(SQL);
            displayRow("PRODUCTS", rs);
        }
        // Handle any errors that may have occurred.
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private static void displayRow(String title,
                                   ResultSet rs) throws SQLException {
        System.out.println(title);
        while (rs.next()) {
            System.out.println(rs.getString("ProductNumber") + " : " + rs.getString("Name"));
        }
    }
*/
    public ArrayList<Inventory_Item> getAllInventory() throws ClassNotFoundException, SQLException {

        connectionClass = new ConnectionClass();
        Connection con = connectionClass.CONN();
        Statement stmt = con.createStatement();


        String sql = "SELECT * FROM Inventory";
        ResultSet rst;
        rst = stmt.executeQuery(sql);

        ArrayList<Inventory_Item> InventoryList = new ArrayList<>();
        /*while (rst.next()) {
            InventoryList.add(new Inventory_Item(rst.getString("ItemName")));

        Inventory_Item glue = new Inventory_Item();
        //}
        */
        Inventory_Item glue = new Inventory_Item();
        glue.itemName = "Its glue";
        InventoryList.add(glue);

        //for(int i =0; i< InventoryList.size(); i++){
        //    System.out.println (InventoryList.get(i));

        //}
        /*
        Inventory_Item balh = new Inventory_Item();
        balh = InventoryList.get(0);
        String itenNameOne = balh.itemName;
        //System.out.println(balh.itemName);

         */
        return InventoryList;

}}







/*private ArrayList<Inventory_Item> empty () throws ClassNotFoundException, SQLException {
    ArrayList<Inventory_Item> InventoryList = new ArrayList<Inventory_Item>();

    try {
            ConnectionClass connectionClass;
            connectionClass = new ConnectionClass();

            Connection connect = connectionClass.CONN();
            Statement stm = connect.createStatement();
            ResultSet category = stm.executeQuery("Select * from Inventory");

            while (category.next()) {

                String col1 = category.getString("ColumName1");
                String col2 = category.getString("ColumName2");
                //....
            }
    }
        catch (Exception e) {
                    e.printStackTrace();
            }
        return InventoryList;
    }
    */

/*
public ArrayList<Inventory_Item> getAllInventory() throws ClassNotFoundException, SQLException {

    ConnectionClass conn;
    Statement stm;
    connectionClass = new ConnectionClass();

    Connection con = connectionClass.CONN();
    Statement stmt = con.createStatement();


    String sql = "Select * From Inventory";
    ResultSet rst;
    rst = stmt.executeQuery(sql);

    ArrayList<Inventory_Item> InventoryList = new ArrayList<>();
    while (rst.next()) {
        InventoryList.add(new Inventory_Item(rst.getString("ItemName"));
    }
    return InventoryList;
} */

