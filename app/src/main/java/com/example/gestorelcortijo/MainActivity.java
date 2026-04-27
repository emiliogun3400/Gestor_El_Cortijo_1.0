package com.example.gestorelcortijo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnEntradas = findViewById(R.id.btnEntradas);
        Button btnMermas = findViewById(R.id.btnMermas);
        Button btnExistencias = findViewById(R.id.btnExistencias);
        Button btnKpis = findViewById(R.id.btnKpis);

        // Botón 1: Registro de Entradas
        btnEntradas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abrirEntradas = new Intent(MainActivity.this, EntradasActivity.class);
                startActivity(abrirEntradas);
            }
        });

        // Botón 2: Control de Mermas
        btnMermas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abrirMermas = new Intent(MainActivity.this, MermasActivity.class);
                startActivity(abrirMermas);
            }
        });

        // Botón 3: Monitor de Existencias
        btnExistencias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abrirExistencias = new Intent(MainActivity.this, ExistenciasActivity.class);
                startActivity(abrirExistencias);
            }
        });

        // ¡NUEVO! Botón 4: Visualización de KPIs
        btnKpis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abrirKpis = new Intent(MainActivity.this, KpisActivity.class);
                startActivity(abrirKpis);
            }
        });
    }
}