package com.example.next.application1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {
ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

       listView = (ListView) findViewById(R.id.list_item);

        ArrayList <LoginModel> data = Constants.constantmodel;

        ListAdapter adapter = new ListAdapter(data,this);
        listView.setAdapter(adapter);

    }
}
