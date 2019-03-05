package com.example.maninback.login;

import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "com.example.maninback.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
        /**fungsi ini akan dipanggil saat user menekan tombol login*/
        public void btnLogin(View view){
            Intent main = new Intent(this, com.example.maninback.login.main.class);
            EditText username = (EditText) findViewById(R.id.username);
            EditText pass = (EditText) findViewById(R.id.password);
            String namauser = username.getText().toString();
            String password = pass.getText().toString();
            if(namauser.equals("Teknik Informatika")  && password.equals("2016")){
                main.putExtra(EXTRA_MESSAGE, namauser);
                startActivity(main);
            }
            else{
                AlertDialog gagal = new AlertDialog.Builder(MainActivity.this).create();
                gagal.setTitle("Gagal");
                gagal.setMessage("Pastikan Username dan Password benar");
                gagal.show();
            }
        }
}
