package com.example.crimsondragon.noorproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button nCustomer, nNoorMember;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nCustomer = (Button) findViewById(R.id.Customer);
        nNoorMember = (Button) findViewById(R.id.NoorMembers);

        nCustomer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentNoor = new Intent(MainActivity.this,CustomerLoginActivity.class);
                startActivity(intentNoor);
                finish();
                return;
            }
        });
        nNoorMember.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentNoor = new Intent(MainActivity.this, NoorMemberLoginActivity.class);
                startActivity(intentNoor);
                finish();
                return;
            }
        });
    }
}
