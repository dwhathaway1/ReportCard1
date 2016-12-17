package com.example.android.reportcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> reportCard = new ArrayList<>();

        reportCard.add("History- A");
        reportCard.add("Programming - D-");
        reportCard.add("Algebra - B");
        reportCard.add("P.E. - A");
        reportCard.add("Physics - B");
        reportCard.add("English - A");
        reportCard.add("German - A");


        ListView listView = (ListView) findViewById(R.id.list_item);

        public String toString() {
        reportCard.get();
    }



    }


}
