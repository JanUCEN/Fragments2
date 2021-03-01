package com.example.fragments2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Iterator;

public class ScrollingFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_scrolling, container, false);


        ArrayList users = getArguments().getStringArrayList("names");
        Iterator it = users.iterator();


        LinearLayout layout = view.findViewById(R.id.linearScrollingLayout);

        while(it.hasNext()) {
            TextView text = new TextView(getContext());
            text.setText(it.next().toString());

            layout.addView(text);
        }

        return view;
    }
}