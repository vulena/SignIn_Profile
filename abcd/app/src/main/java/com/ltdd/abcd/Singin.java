package com.ltdd.abcd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Singin extends AppCompatActivity {
    public  boolean kt= false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singin);
        Button bttonLogin = (Button) findViewById(R.id.btlogin);
        EditText usernameLogin = (EditText) findViewById(R.id.usernamelogin);
        EditText passLogin = (EditText) findViewById(R.id.passlogin);
        TextView linkdk = (TextView) findViewById(R.id.linkdk);
        User user = new User("Vũ Lê Na","lena123.facbook.com","0979339468","lena09082016@gmail.com","_lenaitb_","username","123","DakLak");
        Module.userList.add(user);
                bttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for(User us : Module.userList)
                    if (us.getUsername().equals(usernameLogin.getText().toString().trim()) && us.getPassword().equals(passLogin.getText().toString().trim()))
                    {
                        Module.user=us;
                        Intent intent = new Intent(Singin.this, MainActivity.class);
                        startActivity(intent);
                        kt=true;
                    }
                if (!kt)
                Toast.makeText(Singin.this,"Sai thông tin",Toast.LENGTH_SHORT).show();
            }
        });
        linkdk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Singin.this,Singup.class);
                startActivity(intent);
            }
        });
    }
}