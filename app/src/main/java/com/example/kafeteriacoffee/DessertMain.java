package com.example.kafeteriacoffee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DessertMain extends AppCompatActivity {

    private TextView amount_1, //apple pie
                     amount_2; //pear cake

    private Button back_to_menu,
                   increment_1,
                   decrement_1,
                   increment_2,
                   decrement_2;

    int count_1 = 0; //apple pie amount
    int count_2 = 0; // pear cake amount

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dessert_main);

        back_to_menu = findViewById(R.id.back_to_menu);
        amount_1 = findViewById(R.id.amount_1);
        amount_2 = findViewById(R.id.amount_2);
        increment_1 = findViewById(R.id.increment_1);
        increment_2 = findViewById(R.id.increment_2);
        decrement_1 = findViewById(R.id.decrement_1);
        decrement_2 = findViewById(R.id.decrement_2);

        back_to_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DessertMain.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }


    public void decrement_1(View view) {
        if(count_1<=0) count_1 = 0;
        else count_1--;
        amount_1.setText(""+count_1);
    }

    public void increment_1(View view) {
        count_1++;
        amount_1.setText(""+count_1);
    }
    public void decrement_2(View view) {
        if(count_2<=0) count_2 = 0;
        else count_2--;
        amount_2.setText(""+count_2);
    }

    public void increment_2(View view) {
        count_2++;
        amount_2.setText(""+count_2);
    }
}