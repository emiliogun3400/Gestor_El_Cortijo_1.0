package com.example.gestorelcortijo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MermasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mermas);

        // 1. Conectamos los campos de texto y el botón rojo con Java
        EditText etProductoMerma = findViewById(R.id.etProductoMerma);
        EditText etCantidadMerma = findViewById(R.id.etCantidadMerma);
        EditText etMotivoMerma = findViewById(R.id.etMotivoMerma);
        Button btnGuardarMerma = findViewById(R.id.btnGuardarMerma);

        // 2. Le decimos al botón qué hacer cuando lo presionen
        btnGuardarMerma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Extraemos el texto que el usuario escribió
                String producto = etProductoMerma.getText().toString();
                String cantidad = etCantidadMerma.getText().toString();
                String motivo = etMotivoMerma.getText().toString();

                // Verificamos que el usuario no haya dejado campos vacíos
                if(producto.isEmpty() || cantidad.isEmpty() || motivo.isEmpty()) {
                    Toast.makeText(MermasActivity.this, "Error: Llena todos los campos", Toast.LENGTH_SHORT).show();
                } else {
                    // Simulamos que se guardó exitosamente con un mensaje
                    String mensajeExito = "Merma registrada: " + cantidad + " de " + producto + " por " + motivo;
                    Toast.makeText(MermasActivity.this, mensajeExito, Toast.LENGTH_LONG).show();

                    // Limpiamos los campos para el siguiente registro
                    etProductoMerma.setText("");
                    etCantidadMerma.setText("");
                    etMotivoMerma.setText("");
                }
            }
        });
    }
}