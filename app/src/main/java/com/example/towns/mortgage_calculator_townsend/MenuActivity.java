package com.example.towns.mortgage_calculator_townsend;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MenuActivity extends AppCompatActivity {

    private Float homeVal= new Float(0);
    private Float loanAmtVal= new Float(0);
    private Float loanTermVal= new Float(0);
    private Float insPerVal= new Float(0);
    private Double intRatePerc= new Double(0);
    private Float startDateVal= new Float(0);
    private Double propTaxPerc= new Double(0);
    private Float monthlyHOAVal= new Float(0);
    private EditText homeValEdit;
    private EditText loanAmtEdit;
    private EditText loanTermEdit;
    private EditText insPerEdit;
    private EditText intRateEdit;
    private EditText startDateEdit;
    private EditText propTaxEdit;
    private EditText monthlyHOAEdit;
    private Button mortSummButton;
    private Button paySummButton;
    private View menuActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        homeValEdit = (EditText)findViewById(R.id.textEditHVal);
        loanAmtEdit = (EditText)findViewById(R.id.textEditLVal);
        loanTermEdit = (EditText)findViewById(R.id.textEditTerm);
        insPerEdit = (EditText)findViewById(R.id.textEditInsurance);
        intRateEdit = (EditText)findViewById(R.id.textEditInterest);
        startDateEdit = (EditText)findViewById(R.id.textEditStartDate);
        propTaxEdit = (EditText)findViewById(R.id.textEditPropTax);
        monthlyHOAEdit = (EditText)findViewById(R.id.textEditHOA);

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        homeVal = Float.parseFloat(homeValEdit.getText().toString());
        loanAmtVal = Float.parseFloat(loanAmtEdit.getText().toString());
        loanTermVal = Float.parseFloat(loanTermEdit.getText().toString());
        insPerVal = Float.parseFloat(insPerEdit.getText().toString());
        intRatePerc = Double.parseDouble(intRateEdit.getText().toString());
        startDateVal = Float.parseFloat(startDateEdit.getText().toString());
        propTaxPerc = Double.parseDouble(propTaxEdit.getText().toString());
        monthlyHOAVal = Float.parseFloat(monthlyHOAEdit.getText().toString());

        outState.putFloat("homeValSave",homeVal);
        outState.putFloat("loanAmtSave",loanAmtVal);
        outState.putFloat("loanTermSave",loanTermVal);
        outState.putFloat("insPerSave",insPerVal);
        outState.putDouble("intRateSave",intRatePerc);
        outState.putFloat("startDateSave",startDateVal);
        outState.putDouble("propTaxSave",propTaxPerc);
        outState.putFloat("monthlyHOASave",monthlyHOAVal);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);

        homeVal = savedInstanceState.getFloat("homeValSave");
        loanAmtVal = savedInstanceState.getFloat("loanAmtSave");
        loanTermVal = savedInstanceState.getFloat("loanTermSave");
        insPerVal = savedInstanceState.getFloat("insPerSave");
        intRatePerc = savedInstanceState.getDouble("intRateSave");
        startDateVal = savedInstanceState.getFloat("startDateSave");
        propTaxPerc = savedInstanceState.getDouble("propTaxSave");
        monthlyHOAVal = savedInstanceState.getFloat("monthlyHOASave");

        homeValEdit.setText(homeVal.toString());
        loanAmtEdit.setText(loanAmtVal.toString());
        loanTermEdit.setText(loanTermVal.toString());
        insPerEdit.setText(insPerVal.toString());
        intRateEdit.setText(intRatePerc.toString());
        startDateEdit.setText(startDateVal.toString());
        propTaxEdit.setText(propTaxPerc.toString());
        monthlyHOAEdit.setText(monthlyHOAVal.toString());
    }

}
