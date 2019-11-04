package com.example.myapplication;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter {
    private Activity mActivity;
    private ArrayList<ListModel> mList;
    private static LayoutInflater mInflater = null;
    private ListModel tempValues = null;
    private int i = 0;

    public CustomAdapter(Activity a, ArrayList d){
        mActivity = a;
        mList = d;

    }



    @Override
    public int getCount() {
        if(mList.size()<=0)
            return 1;
            return mList.size();



        //return 0;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
        //return 0;
    }

    public static class ViewHolder{
        public TextView txtitemname;
        public TextView txtrop;
        public TextView txtquantity;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View vi=convertView;
        ViewHolder holder;
        if(convertView == null){
            vi = mInflater.inflate(R.layout.reportLayout,null);
            holder = new ViewHolder();
            holder.txtitemname = vi.findViewById(R.id.tvfirstname);
            holder.txtrop = vi.findViewById(R.id.tvrop);
            holder.txtquantity = vi.findViewById(R.id.quantity);
            vi.setTag(holder);

        }

        else
            holder = (ViewHolder) vi.getTag();

        try
        {
            if(mList.size()<=0){
                holder.txtitemname.setText("No Data");
                holder.txtrop.setText("No Data");
                holder.txtquantity.setText("No Data");


            }

            else{
                tempValues = null;
                tempValues= (ListModel) mList.get(position);
                holder.txtitemname.setText(tempValues.getItemName());
                holder.txtrop.setText(tempValues.getROP());
                holder.txtquantity.setText(tempValues.getQuantity());




            }
        }

        catch (Exception ex)
        {
            ex.printStackTrace();
        }

        return vi;

    }
}
