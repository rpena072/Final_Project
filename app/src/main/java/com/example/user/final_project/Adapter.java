package com.example.user.final_project;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by User on 3/2/2018.
 */

public class Adapter extends RecyclerView.Adapter {
    private String name;
    private String phoneNumber;
    private int count = 0;
    private  ArrayList<Adapter> arr;

    public ArrayList<Adapter> getArr() {
        return arr;
    }



    public Adapter() {
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }


    public Adapter(String name, String phoneNumber) {
        arr = new ArrayList<>();
        this.name = name;
        this.phoneNumber = phoneNumber;


        count++;
    }
    public Adapter getNumber(int pos){
        return arr.get(pos);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Adapter{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
