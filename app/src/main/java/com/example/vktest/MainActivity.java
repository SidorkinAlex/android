package com.example.vktest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private EditText vkId;
private Button searchButton;
private TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vkId=findViewById(R.id.et_search_login);
        searchButton=findViewById(R.id.b_search_vk);
        result=findViewById(R.id.tv_result);
        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("кнопка была нажата");

            }
        };
        searchButton.setOnClickListener(onClickListener);
    }
}