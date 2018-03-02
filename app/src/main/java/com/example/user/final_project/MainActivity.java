package com.example.user.final_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;










public class MainActivity extends AppCompatActivity {
    EditText name_INPUT;
    EditText phone_INPUT;
    String name;
    String phone;
    public static ArrayList<Adapter> arr;
    Button view_Contacts;


    Button button_Add;
    Button buttond_View;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        arr = new ArrayList<>();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_Add = (Button) findViewById(R.id.buttonAdd);
        buttond_View = (Button) findViewById(R.id.buttonContacts);
        name_INPUT = (EditText) findViewById(R.id.editTextName);
        phone_INPUT = (EditText) findViewById(R.id.editTextPhoneNumber);
        addButton();
        intent();



    }
    public void intent(){
        buttond_View = (Button) findViewById(R.id.buttonContacts);

        buttond_View.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, recycler4.class);
                startActivity(intent);
            }
        });
    }
    public void addButton(){



        button_Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = name_INPUT.getText().toString();
                phone = phone_INPUT.getText().toString();
               // Adapter adapting = new Adapter();
                Adapter adapt = new Adapter(name,phone);
                arr.add(adapt);
                String allitemts = "";


//                for(Adapter object: arr) {
                 //   allitemts += object + "\n";

               // }

                Toast.makeText(getApplicationContext() ,"Added "+ "'"+name+"'"+" to contacts list" , Toast.LENGTH_SHORT).show();

            }


        });







    }
    public void viewList() {
        buttond_View = (Button) findViewById(R.id.buttonContacts);
        buttond_View.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, recycler4.class);

            }
        });

    }

}
