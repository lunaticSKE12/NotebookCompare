package com.example.lunatic.notebookcompare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnNotebook, btnSearchNotebook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNotebook = (Button) findViewById(R.id.btnNotebook);
        btnSearchNotebook = (Button) findViewById(R.id.btnSearchNotebook);


        btnNotebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), NotebookPage.class);
                startActivityForResult(intent, 0);
            }
        });


        btnSearchNotebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Search.class);
                startActivityForResult(intent, 0);
            }
        });



    }
}










