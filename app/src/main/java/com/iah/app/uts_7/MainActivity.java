package com.iah.app.uts_7;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn_login;
    EditText username,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_login=(Button)findViewById(R.id.btn_login);
        username=(EditText)findViewById(R.id.txt_username);
        password=(EditText)findViewById(R.id.txt_password);


        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((username.getText().toString().equals("admin"))&&(password.getText().toString().equals("admin")))
                {
                    Intent intent=new Intent(MainActivity .this,IsiActivity.class);
                    intent.setData(Uri.parse("1"));
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText( MainActivity.this, "Username dan Password Salah", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}
