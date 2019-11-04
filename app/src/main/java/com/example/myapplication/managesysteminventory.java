package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.view.View;
import android.widget.Button;
import android.support.v7.app.AppCompatActivity;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.widget.Toast;
//import com.google.zxing.integration.android.IntentIntegrator;
//import com.google.zxing.integration.android.IntentResult;
import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

public class managesysteminventory extends AppCompatActivity {

    private static EditText userId, itemId, itemName, itemDescription, unitOfMeasure, SKU;
    private Button addItem, manualInput, list, scan_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_managesysteminventory);

        final Activity activity = this;

        scan_btn = findViewById(R.id.scan_btn);

        scan_btn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                //Intent Index = new Intent(managesysteminventory.this, add_inventory.class);
                //Intent i = new Intent(activity);
                IntentIntegrator intergrator = new IntentIntegrator(activity);
                intergrator.setDesiredBarcodeFormats(IntentIntegrator.QR_CODE_TYPES);
                intergrator.setPrompt("Scan");
                intergrator.setCameraId(0);
                intergrator.setBeepEnabled(false);
                intergrator.setBarcodeImageEnabled(false);
                intergrator.initiateScan();

                //finish();
            }

        });

        //final Activity activity = this;
        addItem = findViewById(R.id.btn_add_inventory_items);


        addItem.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent i = new Intent(managesysteminventory.this, add_inventory.class);
                startActivity(i);
                finish();
            }
        });

        list = findViewById(R.id.btn_inventory_list);
        list.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent i = new Intent(managesysteminventory.this, Inventory_List.class);
                startActivity(i);
                finish();
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {

        IntentResult result = IntentIntegrator.parseActivityResult(requestCode, resultCode, data);
        if (result != null){
            if (result.getContents() == null){
                Toast.makeText(this, "You cancelled the scanning", Toast.LENGTH_LONG).show();
            }

            else{
                Toast.makeText(this, result.getContents(), Toast.LENGTH_LONG).show();
            }
        }

        else{
            super.onActivityResult(requestCode, resultCode, data);
        }
        //super.onActivityResult(requestCode, resultCode, data);
    }
}
