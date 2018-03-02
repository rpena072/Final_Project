package com.example.user.final_project;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

import static com.example.user.final_project.MainActivity.arr;

public class recycler4 extends AppCompatActivity {


    private List<Adapter> artpieces;
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler__view);
        artpieces = new ArrayList<>();
        //poplulateList();

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.Recyvler_View);
        recyvler_view_adapter adapter = new recyvler_view_adapter(arr);
        recyclerView.setAdapter(adapter);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        goBack();
    }


    private void poplulateList(){
        Adapter ap1 = new Adapter("hello", "goodbye");
        arr.add(ap1);
    }
    public void goBack(){
        back = (Button) findViewById(R.id.buttonAddContact2);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(recycler4.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }

}
