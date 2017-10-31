package com.example.user.bmicalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class BMICaluculator extends AppCompatActivity {
    private EditText editTextWeight;
    private EditText editTextHeight;
    private ImageView imageViewResult;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmicaluculator);

        editTextWeight = (EditText)findViewById(R.id.editTextWeight);
        editTextHeight = (EditText)findViewById(R.id.editTextHeight);
        imageViewResult = (ImageView)findViewById(R.id.imageViewResult);
        textViewResult = (TextView)findViewById(R.id.textViewResult);
    }

    public void calculateBMI(View view){
        double weight, height, bmi;
        weight = Double.parseDouble(editTextWeight.getText().toString());
        height = Double.parseDouble(editTextHeight.getText().toString());

        bmi=weight/(height*height);

        //To change image during run time
        //imageViewResult.setImageResource(R.drawable.normal);

        if(bmi<=18.5){
            imageViewResult.setImageResource(R.drawable.under);
            textViewResult.setText("Underweight");
        }
        else if(bmi<21){
            imageViewResult.setImageResource(R.drawable.normal);
            textViewResult.setText("Normal");
        }
        else{
            imageViewResult.setImageResource(R.drawable.over);
            textViewResult.setText("Overweight");
        }

    }

    public void reset(View view){
        editTextWeight.setText("");
        editTextHeight.setText("");
        imageViewResult.setImageResource(R.drawable.empty);
        textViewResult.setText("Result");
    }
}
