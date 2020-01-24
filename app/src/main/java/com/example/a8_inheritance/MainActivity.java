package com.example.a8_inheritance;

import androidx.appcompat.app.AppCompatActivity;

import people.Doctor;
import people.Person;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView Persons;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Persons = findViewById(R.id.Person);

        Person p1 = new Doctor("Bubba", "Master of all");
    }
}
