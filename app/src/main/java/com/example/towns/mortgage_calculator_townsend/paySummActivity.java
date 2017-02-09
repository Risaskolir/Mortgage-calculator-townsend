package com.example.towns.mortgage_calculator_townsend;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class paySummActivity extends AppCompatActivity {

    private TextView monthlyMortTextView;
    private TextView monthlyHOATextView;
    private TextView monthlyTotalTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay_summ);

        Intent payIntent = getIntent();

        String message = payIntent.getStringExtra("monthlyMort");
        monthlyMortTextView = (TextView)findViewById(R.id.monthlyMortgageText);
        monthlyMortTextView.setText(message);

        message = payIntent.getStringExtra("monthlyHOA");
        monthlyHOATextView = (TextView)findViewById(R.id.monthlyHOAText);
        monthlyHOATextView.setText(message);

        message = payIntent.getStringExtra("totalMonthlyPayment");
        monthlyTotalTextView = (TextView)findViewById(R.id.monthlyTotalText);
        monthlyTotalTextView.setText(message);
    }
}
