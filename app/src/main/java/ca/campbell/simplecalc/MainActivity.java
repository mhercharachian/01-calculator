package ca.campbell.simplecalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

//  TODO: the hint for the result widget is hard coded, put it in the strings file

public class MainActivity extends AppCompatActivity {
    EditText etNum1, etNum2;
    TextView result;
    double num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // get a handle on the text fields
        etNum1 = (EditText) findViewById(R.id.num1);
        etNum2 = (EditText) findViewById(R.id.num2);
        result = (TextView) findViewById(R.id.result);
    }  //onCreate()

    public boolean tryParseDouble(String value) {
        try {
            Double.parseDouble(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public void addNums(View v) {
        if(etNum1.getText().toString().equals("") || tryParseDouble(etNum1.getText().toString()) == false)
        {
            result.setText("ERROR");
        }
        else if(etNum2.getText().toString().equals("") || tryParseDouble(etNum2.getText().toString()) == false)
        {
            result.setText("ERROR");
        }
        else{

            num1 = Double.parseDouble(etNum1.getText().toString());
            num2 = Double.parseDouble(etNum2.getText().toString());
            result.setText(Double.toString(num1 + num2));
        }
    }
    public void subtractNums(View v) {
        if(etNum1.getText().toString().equals("") || tryParseDouble(etNum1.getText().toString()) == false)
        {
            result.setText("ERROR");
        }
        else if(etNum2.getText().toString().equals("") || tryParseDouble(etNum2.getText().toString()) == false)
        {
            result.setText("ERROR");
        }
        else{

            num1 = Double.parseDouble(etNum1.getText().toString());
            num2 = Double.parseDouble(etNum2.getText().toString());
            if(num1 < num2)
            {
                result.setText("First number cannot be smaller than the second");
            }
            else{
                result.setText(Double.toString(num1 - num2));
            }
        }
    }
    public void multiplyNums(View v) {
        if(etNum1.getText().toString().equals("") || tryParseDouble(etNum1.getText().toString()) == false)
        {
            result.setText("ERROR");
        }
        else if(etNum2.getText().toString().equals("") || tryParseDouble(etNum2.getText().toString()) == false)
        {
            result.setText("ERROR");
        }
        else{

            num1 = Double.parseDouble(etNum1.getText().toString());
            num2 = Double.parseDouble(etNum2.getText().toString());
            result.setText(Double.toString(num1 * num2));

        }
    }
    public void divideNums(View v) {
        if(etNum1.getText().toString().equals("") || tryParseDouble(etNum1.getText().toString()) == false)
        {
            result.setText("ERROR");
        }
        else if(etNum2.getText().toString().equals("") || tryParseDouble(etNum2.getText().toString()) == false)
        {
            result.setText("ERROR");
        }
        else{

            num1 = Double.parseDouble(etNum1.getText().toString());
            num2 = Double.parseDouble(etNum2.getText().toString());
            if(num2 == 0)
            {
                result.setText("Cannot divide by zero");
            }
            else{
                result.setText(Double.toString(num1 / num2));
            }
        }
    }
    public void clearInput(View v){
        result.setText("The answer will be here");
        etNum1.setText("");
        etNum2.setText("");
    }

}