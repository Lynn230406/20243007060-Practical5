package com.example.practicalfive;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    private ImageView ivCity;
    private TextView tvTitle;
    private TextView tvDesc;
    private String[] infoArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ivCity = findViewById(R.id.iv_city);
        tvTitle = findViewById(R.id.tv_title);
        tvDesc = findViewById(R.id.tv_desc);
        infoArray = getResources().getStringArray(R.array.municipality_info);

        String cityName = getIntent().getStringExtra("cityName");
        tvTitle.setText(cityName);

        switch (cityName) {
            case "Beijing":
                ivCity.setImageResource(R.drawable.beijing);
                tvDesc.setText(infoArray[0]);
                break;
            case "Shanghai":
                ivCity.setImageResource(R.drawable.shanghai);
                tvDesc.setText(infoArray[1]);
                break;
            case "Tianjin":
                ivCity.setImageResource(R.drawable.tianjin);
                tvDesc.setText(infoArray[2]);
                break;
            case "Chongqing":
                ivCity.setImageResource(R.drawable.chongqing);
                tvDesc.setText(infoArray[3]);
                break;
        }
    }
}
