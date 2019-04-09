package felix.itics.tesoem.edu.examen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class tercerapantalla extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tercerapantalla);
    }

    public void llamarbtn(View v){
        Intent cargar = new Intent(this, suma.class);
        startActivity(cargar);

    }


    public void llamarbtnresta(View v){
        Intent cargar = new Intent(this, resta.class);
        startActivity(cargar);
    }


    public void llamarbtnpotencia(View v){
        Intent cargar = new Intent(this, potencia.class);
        startActivity(cargar);
    }
    public void llamarbtnsalida(View v){

        Intent cargar = new Intent(this, salir.class);
        startActivity(cargar);

    }
    }

