package com.example.lunatic.notebookcompare;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by napong on 4/6/2559.
 */
public class MyAdapter extends ArrayAdapter<String> {
    public MyAdapter(Context context, String[] values) {
        super(context, R.layout.list_item,values);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater theInflater = LayoutInflater.from(getContext());
        View theView = theInflater.inflate(R.layout.list_item, parent, false);
        String notebook = getItem(position);
        TextView theTextView = (TextView) theView.findViewById(R.id.txtitem);

        theTextView.setText(notebook);
        ImageView theimageView = (ImageView) theView.findViewById(R.id.list_item_thumbnail);
        theimageView.setImageResource(R.drawable.appleair11);

        return theView;

    }
}























