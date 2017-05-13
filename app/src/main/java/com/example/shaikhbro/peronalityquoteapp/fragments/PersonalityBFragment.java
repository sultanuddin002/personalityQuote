package com.example.shaikhbro.peronalityquoteapp.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.shaikhbro.peronalityquoteapp.R;
import com.example.shaikhbro.peronalityquoteapp.utils.CustomAdapter;
import com.example.shaikhbro.peronalityquoteapp.utils.ListItems;


/**
 * A simple {@link Fragment} subclass.
 */
public class PersonalityBFragment extends Fragment {

    private ListView listView;

    public PersonalityBFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_personality_b, container, false);
        listView = (ListView) view.findViewById(R.id.personality2_listview);

        ListItems items[] = new ListItems[]{
                new ListItems("1. I DRIVE MY BMW 1 SERIES CONVERTIBLE. I LOVE MY BEAMER", "- Angela Cope"),
                new ListItems("2. THE HYBRID I HAVE NOW IS ONE OF THE LEAST EXPENSIVE CARS I'VE EVER HAD. I HAD A BMW 318Ii CONVERTIBLE ONCE, THE ULTIMATE DRIVING MACHINE.", "- Sean Austin"),
                new ListItems("3. MY FIRST CAR WAS A BMW. A WHITE BMW", "– Jamie-Lynn Sigler"),
                new ListItems("4. A BMW CANT TAKE YOU AS FAR AS A DIPLOMA.", "– Joyce Meyer")
        };

        CustomAdapter adapter = new CustomAdapter(getActivity(), R.layout.listview_item_layout, items);
        listView.setAdapter(adapter);
        return view;
    }

}
