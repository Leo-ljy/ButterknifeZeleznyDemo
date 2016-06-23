package com.example.growup.butterknifezeleznydemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity
{


    @BindView(R.id.tv_test)
    TextView tvTest;
    @BindView(R.id.btn_test)
    Button btnTest;
    @BindView(R.id.sw_test)
    Switch swTest;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        initView();



    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();
    }

    private void initView()
    {
        tvTest.setText("哈哈哈");
    }


    @OnClick(R.id.btn_test)
    public void onClick()
    {
        tvTest.setText("111");
    }
}
