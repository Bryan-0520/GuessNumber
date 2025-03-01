package com.example.guessnumber;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int correctNumber;
    int score = 10;

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
        ImageView result = findViewById(R.id.image_id);
        TextView scoreTx = findViewById(R.id.point);

        button.setOnClickListener(v -> {
            String input = inputNumberET.getText().toString();
            int inputNumber = Integer.parseInt(input);

            if (inputNumber == correctNumber) {
                result.setImageResource(R.drawable.img);
                score = score + 5;
            } else {
                result.setImageResource(R.drawable.img_1);
                score = score - 2;

            }
            scoreTx.setText("Score:" + score);



        });
    }

}