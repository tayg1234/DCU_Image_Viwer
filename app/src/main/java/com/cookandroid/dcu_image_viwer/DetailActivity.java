package com.cookandroid.dcu_image_viwer;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    ImageView imageView;
    ListView listView;
    String[] images = {/* 이미지 URL 또는 리소스 ID 배열 */};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        imageView = findViewById(R.id.imageView);
        listView = findViewById(R.id.listView);

        String image = getIntent().getStringExtra("image");


        ThumbnailAdapter thumbnailAdapter = new ThumbnailAdapter(this, images);
        listView.setAdapter(thumbnailAdapter);

        listView.setOnItemClickListener((parent, view, position, id) -> {

        });
    }
}
