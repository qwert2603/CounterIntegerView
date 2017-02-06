package com.qwert2603.counter_integer_view_example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.qwert2603.counter_integer_view.CounterIntegerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final CounterIntegerView counterIntegerView = (CounterIntegerView) findViewById(R.id.integer_view);

        findViewById(R.id.plus).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counterIntegerView.setInteger(counterIntegerView.getInteger() + 1, true);
            }
        });

        findViewById(R.id.minus).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counterIntegerView.setInteger(counterIntegerView.getInteger() - 1, true);
            }
        });
    }
}
