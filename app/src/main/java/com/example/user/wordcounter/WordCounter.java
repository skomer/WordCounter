package com.example.user.wordcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by user on 08/11/2016.
 */

public class WordCounter extends AppCompatActivity {

    EditText mInputTextEditText;
    Button mSubmitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("WordCounter", "onCreate() called");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mInputTextEditText = (EditText) findViewById(R.id.input_text);
        mSubmitButton = (Button) findViewById(R.id.submit_button);


    }



}
