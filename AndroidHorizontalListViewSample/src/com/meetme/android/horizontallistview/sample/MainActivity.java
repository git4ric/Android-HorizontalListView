package com.meetme.android.horizontallistview.sample;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ArrayAdapter;

import com.meetme.android.horizontallistview.HorizontalListView;

public class MainActivity extends Activity {

//    private HorizontalListView mHlvSimpleList;
    private HorizontalListView mHlvCustomList;
//    private HorizontalListView mHlvCustomListWithDividerAndFadingEdge;

//    private String[] mSimpleListValues = new String[] { "Android", "iPhone", "WindowsMobile",
//            "Blackberry", "WebOS", "Ubuntu", "Windows7", "Max OS X",
//            "Linux", "OS/2" };

    private CustomData[] mCustomData = new CustomData[] {
            new CustomData("A brief History Of Time","$99","img1"),
            new CustomData("Maths for Dummies","$199","img2"),
            new CustomData("Fifty Shades of Grey","$20","img3"),
            new CustomData("Whoops, that was not supposed to be there","FREE","img4"),
            new CustomData("Chicken Soup for Naughty souls","$49.99","img5")
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get references to UI widgets
       // mHlvSimpleList = (HorizontalListView) findViewById(R.id.hlvSimpleList);
        mHlvCustomList = (HorizontalListView) findViewById(R.id.hlvCustomList);
       // mHlvCustomListWithDividerAndFadingEdge = (HorizontalListView) findViewById(R.id.hlvCustomListWithDividerAndFadingEdge);

        //setupSimpleList();
        setupCustomLists();
    }

//    private void setupSimpleList() {
//        // Make an array adapter using the built in android layout to render a list of strings
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_2, android.R.id.text1, mSimpleListValues);
//
//        // Assign adapter to the HorizontalListView
//        mHlvSimpleList.setAdapter(adapter);
//    }

    private void setupCustomLists() {
        // Make an array adapter using the built in android layout to render a list of strings
        CustomArrayAdapter adapter = new CustomArrayAdapter(this, mCustomData);

        // Assign adapter to HorizontalListView
        mHlvCustomList.setAdapter(adapter);
       // mHlvCustomListWithDividerAndFadingEdge.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
