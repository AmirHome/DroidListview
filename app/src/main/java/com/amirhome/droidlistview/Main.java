package com.amirhome.droidlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Course> data = DataProvider.getData();
        ArrayAdapter<Course> courseArrayAdapter = new ArrayAdapter<Course>(this, android.R.layout.simple_list_item_1, data);
        ListView listView = (ListView) findViewById(android.R.id.list);
        listView.setAdapter(courseArrayAdapter);
    }
}
