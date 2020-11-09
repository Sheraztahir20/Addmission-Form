package com.example.admissionform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioGroup radioGroup;
    RadioButton radioButton;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button)findViewById(R.id.submit);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int selectId = radioGroup.getCheckedRadioButtonId();
                RadioButton radioButton = (RadioButton)findViewById(R.id.radiobutton);
                Toast.makeText(MainActivity.this,radioButton.getText(),Toast.LENGTH_SHORT).show();
            }
        });

    }
}