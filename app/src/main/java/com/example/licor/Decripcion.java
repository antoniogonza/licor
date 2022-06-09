package com.example.licor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.NumberPicker;
import android.widget.TextView;

public class Decripcion extends AppCompatActivity {


    private NumberPicker picker1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decripcion);
        picker1 = findViewById(R.id.pickanumber);
        picker1.setMaxValue(5);
        picker1.setMinValue(3);

        picker1.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {

            @Override
            public void onValueChange(NumberPicker numberPicker, int i, int i1) {
                int valuePicker1 = picker1.getValue();
            mostrar(valuePicker1);
            }

            private void mostrar(int i) {

                TextView textView4 = findViewById(R.id.textView4);

                textView4.setText("Receta para 3 litros de Licor " +
                        "1 litro de aguardiente blanca\n" +
                        "150 g de café molido mezcla o descafeinado\n" +
                        "500 g de azúcar\n" +
                        "1 cáscara de un limón (opcional)\n" +
                        "1 cáscara de una naranja (opcional)\n" +
                        "1 rama de canela (opcional)\n");

            }
        });



    }

}