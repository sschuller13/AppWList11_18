package com.example.myapplication;

import java.util.ArrayList;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ListAdapter extends BaseAdapter {

    Context context;
    ArrayList<String> item_Name;
    ArrayList<String> item_Description;
    //ArrayList<String> PhoneNumber;


    public ListAdapter(
            Context context2,
            ArrayList<String> name,
            ArrayList<String> des
            //ArrayList<String> phone
    )
    {

        this.context = context2;
        this.item_Name = name;
        this.item_Description = des;
        /*
        this.ID = id;
        this.Name = name;
        this.PhoneNumber = phone;

         */
    }

    public int getCount() {
        // TODO Auto-generated method stub
        return item_Name.size();
    }

    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return null;
    }

    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return 0;
    }

    public View getView(int position, View child, ViewGroup parent) {

        Holder holder;

        LayoutInflater layoutInflater;

        if (child == null) {
            layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            child = layoutInflater.inflate(R.layout.items, null);

            holder = new Holder();
            /*
            holder.ID_TextView = (TextView) child.findViewById(R.id.textViewID);
            holder.Name_TextView = (TextView) child.findViewById(R.id.textViewNAME);
            holder.PhoneNumberTextView = (TextView) child.findViewById(R.id.textViewPHONE_NUMBER);
            */
            child.setTag(holder);

        } else {

            holder = (Holder) child.getTag();
        }
        holder.ID_TextView.setText(ID.get(position));
        holder.Name_TextView.setText(Name.get(position));
        holder.PhoneNumberTextView.setText(PhoneNumber.get(position));

        return child;
    }

    public class Holder {

        TextView ID_TextView;
        TextView Name_TextView;
        TextView PhoneNumberTextView;
    }

}