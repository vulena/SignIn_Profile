package com.ltdd.abcd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

public class Singup extends AppCompatActivity {
    private EditText namedk,userdk,passdk,nsdk,cmnddk,sdtdk,emaildk,quequandk;
    private Button btdk;
    private User us;
    public MainActivity mainActivity;
    public boolean kt= true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singup);
        LinearLayout linkback = (LinearLayout) findViewById(R.id.linkbackdk);
        AnhXa();
        btdk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kt=true;
                if (namedk.getText().toString().equals("") || nsdk.getText().toString().equals("") || sdtdk.getText().toString().equals("") || emaildk.getText().toString().equals("") || cmnddk.getText().toString().equals("") || userdk.getText().toString().equals("") || passdk.getText().toString().equals("")) {
                    kt = false;
                    Toast.makeText(Singup.this, "Vui lòng nhập đủ thông tin", Toast.LENGTH_SHORT).show();
                }
                for(User us : Module.userList)
                    if (us.getUsername().equals(userdk.getText().toString().trim()))
                    {
                        Toast.makeText(Singup.this,"Đã tồn tại",Toast.LENGTH_SHORT).show();
                        kt=false;
                    }
                if (kt) {
                    us = new User(namedk.getText().toString(), nsdk.getText().toString(), sdtdk.getText().toString(), emaildk.getText().toString(), cmnddk.getText().toString(), userdk.getText().toString(), passdk.getText().toString(),quequandk.getText().toString());
                    Module.userList.add(us);
                    Intent intent = new Intent(Singup.this, Singin.class);
                    startActivity(intent);
                }
            }
        });
        linkback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Singup.this,Singin.class);
                startActivity(intent);
            }
        });
    }
    private void AnhXa(){
        namedk = (EditText) findViewById(R.id.namedk);
        userdk = (EditText) findViewById(R.id.usernamedk);
        passdk = (EditText) findViewById(R.id.passdk);
        nsdk = (EditText) findViewById(R.id.fbdk);
        cmnddk = (EditText) findViewById(R.id.isdk);
        sdtdk = (EditText) findViewById(R.id.sdtdk);
        emaildk = (EditText) findViewById(R.id.emaildk);
        quequandk= (EditText) findViewById(R.id.quequandk);
        btdk = (Button) findViewById(R.id.btdk);
    }
}