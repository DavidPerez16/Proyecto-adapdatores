package com.example.appcarrosrcv;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.appcarrosrcv.adaptadores.CarroAdaptador;
import com.example.appcarrosrcv.clases.carro;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rcv_carros;

    List<carro> listaCarros = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rcv_carros = findViewById(R.id.rcv_carros);

        carro car1 = new carro("https://d3bmp4azzreq60.cloudfront.net/fit-in/2000x2000/vendetunave/images/vehiculos/66eded10eb8e9.webp","$990.000.000","Mercedes Benz G63 AMG","2019");
        carro car2 = new carro("https://d3bmp4azzreq60.cloudfront.net/fit-in/2000x2000/vendetunave/images/vehiculos/66195f94039ea.webp","$520.000.000","BMW X4 M competition","2024");
        carro car3 = new carro("https://d3bmp4azzreq60.cloudfront.net/fit-in/2000x2000/vendetunave/images/vehiculos/66af90b5bb0d3.webp","$640.000.000","Corvette Stingray Coupe","2023");
        carro car4 = new carro("https://d3bmp4azzreq60.cloudfront.net/fit-in/2000x2000/vendetunave/images/vehiculos/66e86001ae4a3.webp","$460.000.000","Porsche 718 Boxter GTS","2018");
        carro car5 = new carro("https://fzautos.co/api/public/images/Vehicles/UAKKBz20240719_204951.webp","$820.000.000","Jaguar F-type R 5.0","2021");
        carro car6 = new carro("https://fzautos.co/api/public/images/Vehicles/499QF220240118_163044.webp","$1.230.000.000","Ferrari Portofino 3.9","2019");




        listaCarros.add(car1);
        listaCarros.add(car2);
        listaCarros.add(car3);
        listaCarros.add(car4);
        listaCarros.add(car5);
        listaCarros.add(car6);




        rcv_carros.setLayoutManager(new LinearLayoutManager(this));
        rcv_carros.setAdapter(new CarroAdaptador(MainActivity.this,listaCarros));
    }
}