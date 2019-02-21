package com.example.kacper.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculateButtonClick(View v){

        //pola tekstowe do wprowadzania liczb oraz wyswietlania wyniku
        EditText firstNumberView = (EditText)findViewById(R.id.firstNumber);
        EditText secondNumberView = (EditText)findViewById(R.id.secondNumber);
        EditText resultView = (EditText)findViewById(R.id.resultView);

        //zliczby podawane przez uzytkownika do obliczen
        double firstNumber = Double.parseDouble(firstNumberView.getText().toString());
        double secondNumber = Double.parseDouble(secondNumberView.getText().toString());

        //radiobuttony odpowiedzialne za dodawanie, odejmowanie, mnozenie i dzielenie
        RadioButton addRadioButton = (RadioButton)findViewById(R.id.addButton);
        RadioButton substractRadioButton = (RadioButton)findViewById(R.id.substractButton);
        RadioButton multiplyRadioButton = (RadioButton)findViewById(R.id.multiplyButton);
        RadioButton dividyRadioButton = (RadioButton)findViewById(R.id.dividyButton);

        double result = 0.0;  //wynik

        if(addRadioButton.isChecked()){
            result = firstNumber + secondNumber;
        }
        else if(substractRadioButton.isChecked()){
            result = firstNumber - secondNumber;
        }
        else if (multiplyRadioButton.isChecked()){
            result = firstNumber * secondNumber;
        }
        else if (dividyRadioButton.isChecked()){
            result = firstNumber/secondNumber;
        }
        String finalResult = result+""; //konwersja double na string

        EditText resultsView = (EditText)findViewById(R.id.resultView);
        resultsView.setText(finalResult);
    }
    public void clearButtonClick(View v){
        EditText firstNumberView = (EditText)findViewById(R.id.firstNumber);
        EditText secondNumberView = (EditText)findViewById(R.id.secondNumber);
        EditText resultView = (EditText)findViewById(R.id.resultView);

        firstNumberView.setText("");
        secondNumberView.setText("");
        resultView.setText("");
    }
}
