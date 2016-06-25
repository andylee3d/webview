package com.hanbit.user.myappwebview;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ImageViewConvertActivity extends Activity implements View.OnClickListener{
    ImageView imageView ;
    Button btNextImage,btPrevImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view_convert);
        imageView =(ImageView) findViewById(R.id.imageView);
        btNextImage = (Button) findViewById(R.id.btNextImage);
        btNextImage.setOnClickListener(this);
        btPrevImage = (Button) findViewById(R.id.btPrevImage);
        btPrevImage.setOnClickListener(this);
        btPrevImage.setVisibility(View.INVISIBLE);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btPrevImage:
                imageView.setImageResource(R.drawable.penguins);
                btPrevImage.setVisibility(View.INVISIBLE);
                btNextImage.setVisibility(View.VISIBLE);
                break;

            case R.id.btNextImage:
                imageView.setImageResource(R.drawable.tulips);
                btPrevImage.setVisibility(View.VISIBLE);
                btNextImage.setVisibility(View.INVISIBLE);
                break;


        }
    }
}


