package com.codeclan.wordsapp;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class WordsActivity extends AppCompatActivity {

  EditText questionEditText;
   Button pressButton;
    TextView wordText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_words);

        questionEditText = (EditText) findViewById(R.id.question_text);
        pressButton = (Button) findViewById(R.id.press_button);
//        wordText = (TextView) findViewById(R.id.word_text);


    }

    public void setPressButtonClicked(View button){
        String question = questionEditText.getText().toString();

        Intent intent = new Intent(this, MagicAnswerCounter.class);
        intent.putExtra("question", question);

        startActivity(intent);
    }
}
