package com.example.gestorelcortijo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class ExistenciasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Solo dejamos esto para cargar tu diseño del monitor
        setContentView(R.layout.activity_existencias);

        // Conectamos el botón para regresar al menú
        Button btnVolver = findViewById(R.id.btnVolverExistencias);
        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // Esta instrucción cierra la pantalla y te regresa a la anterior
            }
        });
    }
}