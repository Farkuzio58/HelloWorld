package com.farkuzio58.helloworld;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

/**
 * @author farku
 * @version 1.0
 * Aplicacion simple que dice un par de cosas
 * <ol>
 *     <li>Hemons visto como se crean los recursos en XML</li>
 *     <li>Hemos instanciado en Java un objeto TextView</li>
 *     <li>Se ha personalizado el icono y el nombre de la aplicacion</li>
 * </ol>
 */
//TODO Tengo que mirar el temario en clase sobre las Activity
public class MainActivity extends AppCompatActivity {
    private TextView tvMessageStart;
    private TextView tvMessageEnd;

    //Método que se llama en la creación de una actividad
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvMessageStart=findViewById(R.id.tvMessageStart);
        tvMessageStart.setTextColor(getColor(R.color.black));
        tvMessageEnd=findViewById(R.id.tvMessageEnd);
        tvMessageEnd.setText(R.string.MessageGuay_text);
        tvMessageEnd.setTextColor(getColor(R.color.white));
    }


}