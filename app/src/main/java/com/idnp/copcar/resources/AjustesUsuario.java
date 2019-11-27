package com.idnp.copcar.resources;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.idnp.copcar.R;

public class AjustesUsuario extends AppCompatActivity {
    TextView nombre, apellido, correo, placa, modelo,color;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajustes_usuario);
        agregarComponentes();

    }

    private void agregarComponentes() {
        nombre = (TextView) findViewById(R.id.ajusteUserNombre);
        apellido = (TextView) findViewById(R.id.ajusteUserApellido);
        correo = (TextView) findViewById(R.id.ajusteUserCorreo);
        placa = (TextView) findViewById(R.id.tajusteUserPlacaCarro);
        modelo = (TextView) findViewById(R.id.ajusteUserModeloCarro);
        color = (TextView) findViewById(R.id.ajusteUserColorCarro);
    }
}
