package com.codeclan.wordsapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MagicAnswerCounter extends AppCompatActivity {
    TextView wordText;
     Word words;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_magic_answer_counter);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String question = extras.getString("question");

        wordText = (TextView)findViewById(R.id.word_text);
        wordText.setText(question);

        words = new Word();
        wordText = (TextView)findViewById(R.id.word_text);
        wordText.setText("You guessed: " + question + " There are " + words.getLength() + " in the array");
        


    }
}
