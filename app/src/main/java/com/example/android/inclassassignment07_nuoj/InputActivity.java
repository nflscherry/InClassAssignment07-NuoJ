package com.example.android.inclassassignment07_nuoj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

public class InputActivity extends AppCompatActivity {

    private EditText nameText;
    private EditText ageText;
    private CheckBox marriageText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);
        nameText = findViewById(R.id.name_text);
        ageText = findViewById(R.id.age_text);
        marriageText = findViewById(R.id.married);
    }

    public void submit(View view){
        Intent msIntent = new Intent();
        String name = nameText.getText().toString();
        int age = Integer.parseInt(ageText.getText().toString());
        boolean married = marriageText.isChecked();
        People people = new People(name,age,married);
        msIntent.putExtra(Keys.PERSON,people);
        setResult(RESULT_OK,msIntent);
        finish();
    }
}
