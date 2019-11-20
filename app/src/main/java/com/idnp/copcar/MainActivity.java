package com.idnp.copcar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView temporal;
    Button temporal2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        temporal = (TextView) findViewById(R.id.link_to_register);
        temporal2 = (Button) findViewById(R.id.login);

        temporal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), VistaRegistro.class);
                startActivityForResult(intent, 0);
            }
        });

        temporal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), VistaInicial.class);
                startActivityForResult(intent, 0);
            }
        });
    }
}
