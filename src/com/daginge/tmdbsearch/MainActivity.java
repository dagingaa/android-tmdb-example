package com.daginge.tmdbsearch;

import com.daginge.tmdbsearch.R;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

    public static final String EXTRA_MESSAGE = "com.daginge.tmdbsearch.MESSAGE";
    public static final String EXTRA_QUERY = "com.daginge.tmdbsearch.QUERY";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    /**
     * Fires an intent to the {@link TMDBSearchResultActivity} with the query.
     * {@link TMDBSearchResultActivity} does all the downloading and rendering.
     * @param view
     */
    public void queryTMDB(View view) {
        Intent intent = new Intent(this, TMDBSearchResultActivity.class);
        EditText editText = (EditText) findViewById(R.id.edit_message);
        String query = editText.getText().toString();
        intent.putExtra(EXTRA_QUERY, query);
        startActivity(intent);
    }
}
