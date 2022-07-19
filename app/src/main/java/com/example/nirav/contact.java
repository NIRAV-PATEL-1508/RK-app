package com.example.nirav;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;

public class contact extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        getSupportActionBar().hide();
        setContentView(R.layout.activity_contact);
        getSupportActionBar().setTitle("Contact us");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setBackgroundDrawable(
                new ColorDrawable(Color.parseColor("#800000")));

        //contact buttons
        ImageButton btweb,btmail,btcall;
        btweb = findViewById(R.id.web);
        btmail = findViewById(R.id.mail);
        btcall = findViewById(R.id.call);
        btweb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            String rku ="https://rku.ac.in/";
                Intent web = new Intent(Intent.ACTION_VIEW);
web.setData(Uri.parse(rku));
startActivity(web);
            }
        });
        btmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent mail = new Intent(Intent.ACTION_SEND);
mail.setData(Uri.parse("mailto:kpatel046@rku.ac.in"));
                mail.setType("plzin/text");
                startActivity(mail);

            }
        });
        btcall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent call = new Intent(Intent.ACTION_DIAL);
                call.setData(Uri.parse("tel:1234567890"));
                startActivity(call);


            }
        });

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

}