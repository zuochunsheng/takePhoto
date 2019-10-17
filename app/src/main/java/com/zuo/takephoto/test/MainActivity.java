package com.zuo.takephoto.test;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.zuo.takephoto.IUploadEvent;
import com.zuo.takephoto.TakephotoUtil;
import com.zuo.takephoto.test.R;

import java.io.File;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.btn);
        Button btnCrop = findViewById(R.id.btnCrop);

        btn.setOnClickListener(this);
        btnCrop.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn:
                Intent intent = new Intent(this,TakephotoTestActivity.class);
                startActivity(intent);
                break;
            case R.id.btnCrop:

                break;
        }
    }


}
