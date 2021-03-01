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
        getSupportFragmentManager().beginTransaction()
                .add(R.id.fragment_container_view,ScrollingFragment.class,sampleData(),null)
                .commit();
    }

    public Bundle sampleData() {
        ArrayList<String> list = new ArrayList<>();

        for(int i = 0;i < 100;i++) {
            list.add("Ciaran Clifford "+i);
            list.add("Benny Bryant "+i);
            list.add("Georgie Burt "+i);
        }


        Bundle bundle = new Bundle();
        bundle.putStringArrayList("names",list);
        return bundle;
    }

}