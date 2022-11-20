package com.android.higher_or_lower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int randomNumber;
    public void generateRandomNumber() {
        Random rand = new Random();
        randomNumber = rand.nextInt(20) + 1;
    }
    public void guess(View view)
    {
        EditText editText=(EditText) findViewById(R.id.editTextNumber);
        String message;
        if(editText.getText().toString().isEmpty())
        {
            message="Enter The Number For Playing";
        }

        else {
            int guessValue=Integer.parseInt(editText.getText().toString());

            if (guessValue > randomNumber) {
                message = "Lower";
            }
            else if (guessValue < randomNumber) {
                message = "higher";
            }
            else {
                message = "yups! you got it";
                generateRandomNumber();

            }
        }
        Toast.makeText(this , message , Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random rand=new Random();
        randomNumber=rand.nextInt(20)+1;
    }
}