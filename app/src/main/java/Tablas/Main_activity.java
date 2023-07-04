package Tablas;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.ComponentActivity;

import com.example.exa1tl.R;

public class Main_activity extends ComponentActivity {



    Button btningresar, btnlistas;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.pantalla_inicial);

            Activity Button = null;
            btningresar=(Button) .findViewById(R.id.btningresar);
            btnlistas=(Button) findViewById(R.id.btnlistas);

            //BOTON PARA INGRESAR A INGRESAR A CONTACTOS
            btningresar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent pantallaini  = new Intent(getApplicationContext(),Pantalla_inicial.class);
                    startActivity(pantallaini);

                }
            });

            //BOTON PARA INGRESAR A LISTA DE CONTACTOS
            btnlistas.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent paginaLi = new Intent(getApplicationContext(),ActivityLista.class);
                    startActivity(paginaLi);

                }
            });

        }
}
