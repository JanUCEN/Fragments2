package com.example.fragments2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.MutableLiveData;

import android.os.Bundle;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public Bundle sampleData() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Ciaran Clifford");
        list.add("Benny Bryant");
        list.add("Georgie Burt");
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("names",list);
        return bundle;
    }

}