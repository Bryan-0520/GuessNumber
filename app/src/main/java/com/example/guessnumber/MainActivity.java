package com.example.guessnumber;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int correctNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        generateNumber();
        check();
    }

    private void generateNumber() {
        Random random = new Random();
        correctNumber = random.nextInt(10) + 1;
    }

    private void check(){
        EditText inputNumberET = findViewById(R.id.editTextNumber);
        Button button = findViewById(R.id.button);

        button.setOnClickListener(v ->{
                    String input = inputNumberET.getText().toString();
                    int inputNumber = Integer.parseInt(input);
                    if (inputNumber == correctNumber) {

                    }else {

                    }
        });
    }

}