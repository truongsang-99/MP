package com.example.mp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class NewpollActivity extends AppCompatActivity {
    TextView mTextViewSelectDate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newpoll);
        mTextViewSelectDate=findViewById(R.id.txt_selectDate);
        mTextViewSelectDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent selectIntent = new Intent(NewpollActivity.this, CalendarActivity.class);
                startActivity(selectIntent);
            }
        });
    }
}