package com.hammadshahzad.alphabetslearningchildplay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> alphabetsList = new ArrayList<String>();
    ListView listView ;
    ArrayAdapter<String> arrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AddAlphabetsInArray();
        listView=findViewById(R.id.LVAlphabets);
        arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,alphabetsList);
        listView.setAdapter(arrayAdapter);
    }

    @Override
    protected void onStart() {
        super.onStart();
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent activity = new Intent(MainActivity.this,MainActivity2.class);
                activity.putExtra("Letter",alphabetsList.get(position));
                startActivity(activity);
            }
        });
    }

    void AddAlphabetsInArray(){
        alphabetsList.add("Letter A");
        alphabetsList.add("Letter B");
        alphabetsList.add("Letter C");
        alphabetsList.add("Letter D");
        alphabetsList.add("Letter E");
        alphabetsList.add("Letter F");
        alphabetsList.add("Letter G");
        alphabetsList.add("Letter H");
        alphabetsList.add("Letter I");
        alphabetsList.add("Letter J");
        alphabetsList.add("Letter K");
        alphabetsList.add("Letter L");
        alphabetsList.add("Letter M");
        alphabetsList.add("Letter N");
        alphabetsList.add("Letter O");
        alphabetsList.add("Letter P");
        alphabetsList.add("Letter Q");
        alphabetsList.add("Letter R");
        alphabetsList.add("Letter S");
        alphabetsList.add("Letter T");
        alphabetsList.add("Letter U");
        alphabetsList.add("Letter V");
        alphabetsList.add("Letter W");
        alphabetsList.add("Letter X");
        alphabetsList.add("Letter Y");
        alphabetsList.add("Letter Z");
    }
}