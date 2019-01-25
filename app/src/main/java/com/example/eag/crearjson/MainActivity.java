package com.example.eag.crearjson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {
    TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texto = (TextView) findViewById(R.id.texto);

        //Creamos JSONObject de dos personas
        JSONObject persona1 = new JSONObject();
        JSONObject persona2 = new JSONObject();

        //Añadimos los datos al JSON
        try {
            persona1.put("id", 3);
            persona1.put("nombre","Juan");
            persona1.put("cumpleaños", "17/10/1990");

            persona2.put("id", 5);
            persona2.put("nombre","María");
            persona2.put("cumpleaños", "13/11/1991");
        } catch (JSONException e) {
            e.printStackTrace();
        }

        //Creamos JSONArray
        JSONArray personas = new JSONArray();

        personas.put(persona1);
        personas.put(persona2);

        //Creamos JSONObject para añadir un nombre a nuestro array

        JSONObject arraypersonas = new JSONObject();

        try {
            arraypersonas.put("Personas",personas);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        //Mostramos en el TextView el JSONArray
        texto.setText(arraypersonas.toString());

    }
}
