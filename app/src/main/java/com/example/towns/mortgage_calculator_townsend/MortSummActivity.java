package com.example.towns.mortgage_calculator_townsend;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MortSummActivity extends AppCompatActivity {

    private TextView totalLoanTextView;
    private TextView totalIntTextView;
    private TextView yearlyTaxTextView;
    private TextView totalPaidTextView;
    private TextView taxesPaidTextView;
    private TextView HOAPaidTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mort_summ);

        Intent mortIntent = getIntent();

        String message = mortIntent.getStringExtra("totalLoan");
        totalLoanTextView = (TextView)findViewById(R.id.totalLoanText);
        totalLoanTextView.setText(message);

        message = mortIntent.getStringExtra("totalInterest");
        totalIntTextView = (TextView)findViewById(R.id.totalInterestText);
        totalIntTextView.setText(message);

        message = mortIntent.getStringExtra("yearlyTax");
        yearlyTaxTextView = (TextView)findViewById(R.id.yearlyTaxText);
        yearlyTaxTextView.setText(message);

        message = mortIntent.getStringExtra("totalPaid");
        totalPaidTextView = (TextView)findViewById(R.id.totalPaidText);
        totalPaidTextView.setText(message);

        message = mortIntent.getStringExtra("taxesPaid");
        taxesPaidTextView = (TextView)findViewById(R.id.totalTaxText);
        taxesPaidTextView.setText(message);

        message = mortIntent.getStringExtra("HOAPaid");
        HOAPaidTextView = (TextView)findViewById(R.id.totalHOAText);
        HOAPaidTextView.setText(message);

    }
}
