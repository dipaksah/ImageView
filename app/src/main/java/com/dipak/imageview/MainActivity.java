package com.dipak.imageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    RadioButton rdspider,rdiron,rdjoker;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rdiron=(RadioButton) findViewById(R.id.rdIron);
        rdjoker=(RadioButton) findViewById(R.id.rdJoker);
        rdspider=(RadioButton) findViewById(R.id.rdSpider);
        img=(ImageView) findViewById(R.id.img);


        rdjoker.setOnClickListener(this);
        rdspider.setOnClickListener(this);
        rdiron.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.rdIron:
                img.setImageResource(R.drawable.ironman);
                break;

            case R.id.rdJoker:
                img.setImageResource(R.drawable.joker);
                break;

            case R.id.rdSpider:
                img.setImageResource(R.drawable.spider);
                break;
        }

    }
}
