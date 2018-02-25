package com.vkeyws.fiqihmuhammadhr_1202154123_modul3;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity {
    //mendeklarasikan atribute
    EditText username, password;
    Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //menginisialisasi berdasarkan id
        username = (EditText)findViewById(R.id.username);
        password = (EditText)findViewById(R.id.password);
        btnLogin = (Button) findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog();
            }
        });
    }
    public void showDialog() {
        //mengubah menjadi string
        final String usernameKey = username.getText().toString();
        String passwordKey = password.getText().toString();
        //pengondisian username dan password harus sama menggunakan &&
        if(usernameKey.equals("EAD") && passwordKey.equals("MOBILE") ){
            AlertDialog.Builder builder = new AlertDialog.Builder(Login.this);
            //memberikan alert jika berhasil login
            builder.setMessage("Login Success...!")
                    .setPositiveButton("Ok...", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            //transisi activity
                            Intent intent = new Intent(Login.this, MainActivity.class);
                            intent.putExtra("admin", usernameKey);
                            startActivity(intent);
                        }
                    });
            AlertDialog alertDialog = builder.create();

            alertDialog.show();


        }else{
            //menampilkan alert jika gagal login
            AlertDialog.Builder builder = new AlertDialog.Builder(Login.this);
            builder.setMessage("Login Fail...!").setNegativeButton("Retry...", null).create().show();
        }
    }
}
