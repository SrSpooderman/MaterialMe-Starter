package com.example.android.materialme;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView sportsTitle = findViewById(R.id.titleDetail);
        TextView sportsSubTitle = findViewById(R.id.subTitleDetail);
        ImageView sportsImage = findViewById(R.id.sportsImageDetail);

        Intent intent = getIntent();

        if (intent != null) {
            sportsTitle.setText(intent.getStringExtra("title"));
            sportsSubTitle.setText(intent.getStringExtra("subTitle"));
            Glide.with(this).load(intent.getIntExtra("image_resource", 0)).into(sportsImage);
        } else {
            Toast.makeText(this, "No recibo deportes", Toast.LENGTH_SHORT).show();
            finish();
        }
    }
}
