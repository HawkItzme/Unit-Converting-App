package com.example.unitconverterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView welcome_text, result_text;
    Button btn;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        welcome_text = findViewById(R.id.tvTitle);
        result_text = findViewById(R.id.tvResult);
        btn = findViewById(R.id.btnCal);
        editText = findViewById(R.id.edText1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double kilos_entered = Double.parseDouble(editText.getText().toString());

                result_text.setText("" +  convertToPounds(kilos_entered) + " lb" );
            }
        });
    }

    public double convertToPounds(double kilos ){
        double pounds_result = kilos*2.20462;
        return pounds_result;
    }
}