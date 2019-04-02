package com.gzeinnumer.parcelable;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class SecondActivity extends AppCompatActivity {

    TextView text;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        text = findViewById(R.id.text_view);
        image = findViewById(R.id.image_view);

        //todo 4
        Intent intent = getIntent();
        DataItem current = intent.getParcelableExtra("data_parce");

        text.setText(current.getName());
        Glide.with(this)
                .asBitmap()
                .load(current.getImage())
                .into(image);
    }
}
