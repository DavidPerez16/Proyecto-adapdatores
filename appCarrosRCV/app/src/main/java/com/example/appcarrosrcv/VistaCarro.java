package com.example.appcarrosrcv;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.example.appcarrosrcv.clases.carro;
import com.squareup.picasso.Picasso;

public class VistaCarro extends AppCompatActivity {
    TextView txt_nombre_carro,txt_precio;
    ImageView img_carro;
    Button btn_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vista_carro);

        txt_nombre_carro= findViewById(R.id.txt_nombre_carro);
        txt_precio= findViewById(R.id.txt_precio);
        img_carro= findViewById(R.id.img_carro);
        btn_back= findViewById(R.id.btn_back);



        carro carVista= (carro) getIntent().getSerializableExtra("carro");

        txt_nombre_carro.setText(carVista.getNombre());
        txt_precio.setText(carVista.getPrecio());
        Picasso.get().load(carVista.getImagen()).into(img_carro);

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(VistaCarro.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        });

    }
}