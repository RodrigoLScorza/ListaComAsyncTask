package com.example.logonrm.listacomasynctask;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.logonrm.listacomasynctask.model.Android;

public class DetalheActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe);

        Toast.makeText(this, getIntent().getStringExtra(Android.TAG_NOME),Toast.LENGTH_LONG).show();
    }
}
