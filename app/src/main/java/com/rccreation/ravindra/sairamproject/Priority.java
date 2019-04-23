package com.rccreation.ravindra.sairamproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Priority extends AppCompatActivity {
    Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_priority);
        b1=findViewById(R.id.eng);
        b2=findViewById(R.id.tel);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Priority.this,HomePage.class);
                startActivity(intent);
                finish();
            }
        });

    }
}
