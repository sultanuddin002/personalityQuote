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
public class PersonalityCFragment extends Fragment {

    private ListView listView;

    public PersonalityCFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_personality_c, container, false);
        listView = (ListView) view.findViewById(R.id.personality3_listview);

        ListItems items[] = new ListItems[]{
                new ListItems("1. TIME SPEND WITH A CAT IS NEVER WASTED.", "- Sigmund Freud"),
                new ListItems("2. THERE ARE TWO MEANS OF REFUGE FROM THE MISERIES OF LIFE: MUSIC AND CATS.", "- Albert Schweitzer"),
                new ListItems("3. IN ANCIENT TIMES CAT WERE WORSHIPPED AS GODS; THEY HAVE NOT FORGOTTEN THIS.", "– Terry Pratchett"),
                new ListItems("4. CATS ARE INQUISITIVE, BUT HATE TO ADMIT IT.", "– Mason Cooley")
        };

        CustomAdapter adapter = new CustomAdapter(getActivity(), R.layout.listview_item_layout, items);
        listView.setAdapter(adapter);
        return view;
    }

}
