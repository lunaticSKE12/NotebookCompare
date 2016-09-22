package com.example.lunatic.notebookcompare;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Search extends AppCompatActivity {

    String[] notebooks = new String[]{
            "apple_macbook_air11_256GB", "apple_macbook_air13_256GB",
            "apple_macbook_pro13_256GB", "apple_macbook_pro13_512GB",
            "acer_aspire_v3_575g","acer_aspire_e5_574g","acer_aspire_e5_573g","asus_vm590ub",
            "asus_zenbook_ux305ua","asus_a550vx","dell_inspiron_n7359","dell_inspiron_n5459",
            "dell_inspiron_5559","dell_vostro_v5459","hp_pavilion_gaming_15","hp_pavilion_star_wars_15",
            "hp_pavilion_touchsmart_14","msi_cx62_6qd", "msi_gp72_6qe", "msi_gl62_6qd",
            "lenovo_thinkpad_edge_e460", "lenovo_ideapad_y700", "lenovo_ideapad_700",
            "lenovo_thinkpad_x260"

    };
    ArrayList<String> listItems;
    ArrayAdapter<String> adapter;
    EditText editText;
    ListView theListView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        theListView=(ListView)findViewById(R.id.listview);

        editText=(EditText)findViewById(R.id.txtsearch);

        initList();


        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if(s.toString().equals("")){

                    // reset listview

                    initList();

                }

                else{

                    // perform search

                    searchItem(s.toString().toLowerCase());

                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });


        theListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String notebookSelect = "You selected " + String.valueOf(parent.getItemAtPosition(position));
                Toast.makeText(Search.this, notebookSelect, Toast.LENGTH_SHORT).show();
                /*Intent intent = new Intent(view.getContext(), APPLE_MacBook_Air11_256GB.class);
                startActivityForResult(intent, 0);*/

                switch (position){
                    case 0: Intent notebookDetail_0 = new Intent(view.getContext(), APPLE_MacBook_Air11_256GB.class);
                        startActivity(notebookDetail_0);
                        break;
                    case 1: Intent notebookDetail_1 = new Intent(view.getContext(), APPLE_MacBook_Air13_256GB.class);
                        startActivity(notebookDetail_1);
                        break;
                    case 2: Intent notebookDetail_2 = new Intent(view.getContext(), APPLE_MacBook_Pro13_256GB.class);
                        startActivity(notebookDetail_2);
                        break;
                    case 3: Intent notebookDetail_3 = new Intent(view.getContext(), APPLE_MacBook_Pro13_512GB.class);
                        startActivity(notebookDetail_3);
                        break;
                    case 4: Intent notebookDetail_4 = new Intent(view.getContext(), ACER_ASPIRE_V3_575G.class);
                        startActivity(notebookDetail_4);
                        break;
                    case 5: Intent notebookDetail_5 = new Intent(view.getContext(), ACER_Aspire_E5_574G.class);
                        startActivity(notebookDetail_5);
                        break;
                    case 6: Intent notebookDetail_6 = new Intent(view.getContext(), ACER_Aspire_E5_573G.class);
                        startActivity(notebookDetail_6);
                        break;
                    case 7: Intent notebookDetail_7 = new Intent(view.getContext(), Asus_VM590UB.class);
                        startActivity(notebookDetail_7);
                        break;
                    case 8: Intent notebookDetail_8 = new Intent(view.getContext(), ASUS_ZENBOOK_UX305UA.class);
                        startActivity(notebookDetail_8);
                        break;
                    case 9: Intent notebookDetail_9 = new Intent(view.getContext(), ASUS_A550VX.class);
                        startActivity(notebookDetail_9);
                        break;
                    case 10: Intent notebookDetail_10 = new Intent(view.getContext(), DELL_Inspiron_N7359.class);
                        startActivity(notebookDetail_10);
                        break;
                    case 11: Intent notebookDetail_11 = new Intent(view.getContext(), DELL_Inspiron_N5459.class);
                        startActivity(notebookDetail_11);
                        break;
                    case 12: Intent notebookDetail_12 = new Intent(view.getContext(), DELL_Inspiron_5559.class);
                        startActivity(notebookDetail_12);
                        break;
                    case 13: Intent notebookDetail_13 = new Intent(view.getContext(), DELL_Vostro_V5459.class);
                        startActivity(notebookDetail_13);
                        break;
                    case 14: Intent notebookDetail_14 = new Intent(view.getContext(), HP_Pavilion_Gaming_15.class);
                        startActivity(notebookDetail_14);
                        break;
                    case 15: Intent notebookDetail_15 = new Intent(view.getContext(), HP_Pavilion_Star_Wars_15.class);
                        startActivity(notebookDetail_15);
                        break;
                    case 16: Intent notebookDetail_16 = new Intent(view.getContext(), HP_Pavilion_Touchsmart_14.class);
                        startActivity(notebookDetail_16);
                        break;
                    case 17: Intent notebookDetail_17 = new Intent(view.getContext(), MSI_CX62_6QD.class);
                        startActivity(notebookDetail_17);
                        break;
                    case 18: Intent notebookDetail_18 = new Intent(view.getContext(), MSI_GP72_6QE.class);
                        startActivity(notebookDetail_18);
                        break;
                    case 19: Intent notebookDetail_19 = new Intent(view.getContext(), MSI_GL62_6QD.class);
                        startActivity(notebookDetail_19);
                        break;
                    case 20: Intent notebookDetail_20 = new Intent(view.getContext(), LENOVO_ThinkPad_Edge_E460.class);
                        startActivity(notebookDetail_20);
                        break;
                    case 21: Intent notebookDetail_21 = new Intent(view.getContext(), LENOVO_IdeaPad_Y700.class);
                        startActivity(notebookDetail_21);
                        break;
                    case 22: Intent notebookDetail_22 = new Intent(view.getContext(), LENOVO_IdeaPad_700.class);
                        startActivity(notebookDetail_22);
                        break;
                    case 23: Intent notebookDetail_23 = new Intent(view.getContext(), LENOVO_ThinkPad_X260.class);
                        startActivity(notebookDetail_23);
                        break;




                }

            }
        });

    }

    public void searchItem(String textToSearch){

        for(String item:notebooks){

            if(!item.contains(textToSearch)){

                listItems.remove(item);

            }
            else if(item.contains(textToSearch)){

                initList();

            }
        }

        adapter.notifyDataSetChanged();

    }


    public void initList(){
        notebooks = new String[]{
                "apple_macbook_air11_256GB", "apple_macbook_air13_256GB",
                "apple_macbook_pro13_256GB", "apple_macbook_pro13_512GB",
                "acer_aspire_v3_575g","acer_aspire_e5_574g","acer_aspire_e5_573g","asus_vm590ub",
                "asus_zenbook_ux305ua","asus_a550vx","dell_inspiron_n7359","dell_inspiron_n5459",
                "dell_inspiron_5559","dell_vostro_v5459","hp_pavilion_gaming_15","hp_pavilion_star_wars_15",
                "hp_pavilion_touchsmart_14","msi_cx62_6qd", "msi_gp72_6qe", "msi_gl62_6qd",
                "lenovo_thinkpad_edge_e460", "lenovo_ideapad_y700", "lenovo_ideapad_700",
                "lenovo_thinkpad_x260"

        };
        listItems=new ArrayList<>(Arrays.asList(notebooks));

        adapter=new ArrayAdapter<String>(this,R.layout.list_item, R.id.txtitem, listItems);

        theListView.setAdapter(adapter);



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

}
