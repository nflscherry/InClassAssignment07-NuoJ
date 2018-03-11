package com.example.android.inclassassignment07_nuoj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private TextView peopleList;
    private String display;
    private String initial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        peopleList = findViewById(R.id.display);
        initial = "";
    }

    public void addPerson(View view){
        Intent mrIntent = new Intent(this,InputActivity.class);
        startActivityForResult(mrIntent,111);
    }

    public void onActivityResult(int requestCode, int resultCode,Intent data){
        if(requestCode == 111 && resultCode == RESULT_OK ){
          People person =  (People)data.getSerializableExtra(Keys.PERSON);
          String name = person.getName();
          int age = person.getAge();
          boolean marriage = person.getMarried();
          display = "Name: " + name + "\nAge: " + age + "\nMarried? " + marriage + "\n" + "\n" + "\n";
          initial = initial + display;
          peopleList.setText(initial);
        }
    }
}
