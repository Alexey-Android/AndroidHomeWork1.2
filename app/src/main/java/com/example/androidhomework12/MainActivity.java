package com.example.androidhomework12;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button buttonSubsribe, buttonClearForm;
    private TextView textView;
    private EditText editTextEnterName, editTextEnterEmail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init() {
        buttonSubsribe = findViewById(R.id.buttonSubscribe);
        buttonClearForm = findViewById(R.id.buttonClearForm);
        textView = findViewById(R.id.textView);
        editTextEnterName = findViewById(R.id.editTextEnterName);
        editTextEnterEmail = findViewById(R.id.editTextEnterEmail);



        buttonSubsribe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String enterName = editTextEnterName.getText().toString();
                final String enterEmail = editTextEnterEmail.getText().toString();
                textView.setText("Подписка на рассылку успешно оформлена для пользователя " + enterName + " на электронный адрес " + enterEmail);

            }
        });

        buttonClearForm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextEnterName.getText().clear();
                editTextEnterEmail.getText().clear();

            }
        });

    }
}
