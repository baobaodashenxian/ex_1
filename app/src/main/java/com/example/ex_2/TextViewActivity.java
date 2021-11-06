package com.example.ex_2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Paint;
import android.os.Bundle;
import android.widget.TextView;

public class TextViewActivity extends AppCompatActivity {

    private TextView mTv3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view);
        mTv3 =  findViewById(R.id.tv_3);
        mTv3.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);
        mTv3.getPaint().setAntiAlias(true);

    }
}