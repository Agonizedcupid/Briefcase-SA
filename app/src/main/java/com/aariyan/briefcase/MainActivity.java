package com.aariyan.briefcase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText customerName,customerCode;
    private Button getHistoryBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUI();
    }

    private void initUI() {
        customerName = findViewById(R.id.customerNameEdtText);
        customerCode = findViewById(R.id.customerCodeEdtText);
        getHistoryBtn = findViewById(R.id.orderHistoryBtn);

        getHistoryBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this,OrderActivity.class);
                intent.putExtra("name",customerName.getText().toString());
                intent.putExtra("code",customerCode.getText().toString());
                startActivity(intent);
            }
        });
    }
}