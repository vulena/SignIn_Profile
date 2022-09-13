package com.ltdd.abcd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView ten,username,pass,sdt,email,quequan,facebook,instagram;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout linkbackpf = (LinearLayout) findViewById(R.id.linkbackpf);
        AnhXa();
        ten.setText(Module.user.getTen());
        sdt.setText(Module.user.getSdt());
        facebook.setText(Module.user.getNgaysinh());
        email.setText(Module.user.getEmail());
        instagram.setText(Module.user.getCmnd());
        quequan.setText(Module.user.getQuequan());


        linkbackpf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Singin.class);
                startActivity(intent);
            }
        });
    }
    private void AnhXa(){
        ten = (TextView) findViewById(R.id.tv_name);
        sdt = (TextView) findViewById(R.id.tv_sdt);
        facebook     = (TextView) findViewById(R.id.tv_fb);
        email = (TextView) findViewById(R.id.tv_email);
        instagram = (TextView) findViewById(R.id.tv_ins);
        quequan = (TextView) findViewById(R.id.tv_address);
            }
    }