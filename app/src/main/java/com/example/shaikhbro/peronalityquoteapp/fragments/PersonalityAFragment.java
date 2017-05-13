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
public class PersonalityAFragment extends Fragment {

    private ListView listView;

    public PersonalityAFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_personality_a, container, false);
        listView = (ListView) view.findViewById(R.id.personality1_listview);

        ListItems items[] = new ListItems[]{
                new ListItems("1. PEOPLE NEED DRAMATIC EXAMPLES TO SHAKE THEM OUT OF APATHY AND I CAN’T DO THAT AS BRUCE WAYNE.", "- Bruce Wayne from Batman Begins"),
                new ListItems("2. RACHEL, ALL THIS - IT’S NOT ME, INSIDE, AND I AM...MORE.", "- Bruce Wayne from Batman Begins"),
                new ListItems("3. SOMEONE LIKE YOU, SOMEONE WHO WILL RATTLE THE CAGES.","– Batman, Batman Begins"),
                new ListItems("4. I WON’T KILL YOU, BUT I DON’T HAVE TO SAVE YOU.","– Batman, Batman Begins")
        };

        CustomAdapter adapter = new CustomAdapter(getActivity(), R.layout.listview_item_layout, items);
        listView.setAdapter(adapter);
        return view;
    }

}
