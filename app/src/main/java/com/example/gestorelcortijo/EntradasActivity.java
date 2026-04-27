package com.example.gestorelcortijo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class EntradasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entradas);

        // 1. Conectamos los campos de texto y el botón con Java
        EditText etInsumo = findViewById(R.id.etInsumo);
        EditText etCantidad = findViewById(R.id.etCantidad);
        EditText etFechaCaducidad = findViewById(R.id.etFechaCaducidad);
        Button btnGuardarEntrada = findViewById(R.id.btnGuardarEntrada);

        // 2. Le decimos al botón qué hacer cuando lo presionen
        btnGuardarEntrada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Extraemos el texto que el usuario escribió
                String insumo = etInsumo.getText().toString();
                String cantidad = etCantidad.getText().toString();
                String fecha = etFechaCaducidad.getText().toString();

                // Verificamos que el usuario no haya dejado campos vacíos
                if(insumo.isEmpty() || cantidad.isEmpty() || fecha.isEmpty()) {
                    Toast.makeText(EntradasActivity.this, "Error: Llena todos los campos", Toast.LENGTH_SHORT).show();
                } else {
                    // Simulamos que se guardó exitosamente con un mensaje
                    String mensajeExito = "Registrado: " + cantidad + " de " + insumo;
                    Toast.makeText(EntradasActivity.this, mensajeExito, Toast.LENGTH_LONG).show();

                    // Limpiamos los campos para que pueda registrar el siguiente producto
                    etInsumo.setText("");
                    etCantidad.setText("");
                    etFechaCaducidad.setText("");
                }
            }
        });
    }
}