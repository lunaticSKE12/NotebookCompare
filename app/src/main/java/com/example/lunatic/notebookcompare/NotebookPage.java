package com.example.lunatic.notebookcompare;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NotebookPage extends AppCompatActivity {

    private ArrayList<String> data = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notebook_page);
        String[] notebook ={
                "APPLE-MacBook-Air-11-[Early-2015]-256GB", "APPLE-MacBook-Air-13-[Early-2015]-256GB",
                "APPLE-MacBook-Pro-Retina-13-[Early-2015]-256GB", "APPLE-MacBook-Pro-Retina-13-[Early-2015]-512GB.",
                "ACER ASPIRE V3-575G","ACER Aspire E5-574G","ACER Aspire E5-573G","Asus VM590UB",
                "ASUS ZENBOOK UX305UA","ASUS A550VX","DELL Inspiron N7359","DELL Inspiron N5459",
                "DELL Inspiron 5559","DELL Vostro V5459","HP Pavilion Gaming 15","HP Pavilion 14",
                "HP Pavilion Touchsmart 14","MSI CX62-6QD", "MSI CX62-6QD", "MSI GL62 6QD","LENOVO ThinkPad Edge E460",
                "LENOVO Y5070", "LENOVO IdeaPad 700", "LENOVO ThinkPad Edge E460"

        };

        ListAdapter theAdapter = new MyAdapter(this, notebook);
        // ListViews display data in a scrollable list
        ListView theListView = (ListView) findViewById(R.id.listview);
        // Tells the ListView what data to use
        theListView.setAdapter(theAdapter);

        theListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String notebookSelect = "You selected " + String.valueOf(parent.getItemAtPosition(position));
                Toast.makeText(NotebookPage.this, notebookSelect, Toast.LENGTH_SHORT).show();

            }
        });

        /*ListView lv = (ListView) findViewById(R.id.listview);
        generateListContent();
        lv.setAdapter(new MyListAdapter(this, R.layout.list_item, data));
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(NotebookPage.this, "List item was clicked at " + position, Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(view.getContext(), NotebookDetail.class);
                startActivityForResult(intent, 0);

            }
        });*/
    }



    private void generateListContent(){
        for(int i = 0; i < 2; i++){
            data.add("macbook air 11");
        }

    }

    public boolean onCreateOptionMenu(Menu menu){
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_scrolling , menu);
        return true;
    }

    public boolean onOptionItemSelected(MenuItem item){
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if(id == R.id.action_settings){
            return true;
        }

        return super.onOptionsItemSelected(item);

    }

    /*private class MyListAdapter extends ArrayAdapter<String>{
        private int layout;

        public MyListAdapter(Context context, int resource, List<String> objects) {
            super(context, resource, objects);
            layout = resource;
        }

        @Override
        public View getView(final int position, View convertView, ViewGroup parent) {
            ViewHolder mainViewHolder = null;

            if(convertView == null){
                LayoutInflater inflater = LayoutInflater.from(getContext());
                convertView = inflater.inflate(layout, parent, false);
                ViewHolder viewHolder = new ViewHolder();
                viewHolder.thumbnail = (ImageView) convertView.findViewById(R.id.list_item_thumbnail);
                viewHolder.title = (TextView) convertView.findViewById(R.id.list_item_text);
                viewHolder.button = (Button) convertView.findViewById(R.id.list_item_button);
                viewHolder.button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getContext(), "Button was clicked for list item " + position, Toast.LENGTH_SHORT).show();

                    }
                });
                convertView.setTag(viewHolder);
            }
            else {
                mainViewHolder = (ViewHolder) convertView.getTag();
                mainViewHolder.title.setText(getItem(position));
            }

            return convertView;
        }
    }

    public class ViewHolder{
        ImageView thumbnail;
        TextView title;
        Button button;
    }*/




}
