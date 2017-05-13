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
public class PersonalityDFragment extends Fragment {

    private ListView listView;

    public PersonalityDFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_personality_d, container, false);
        listView = (ListView) view.findViewById(R.id.personality4_listview);

        ListItems items[] = new ListItems[]{
                new ListItems("1. YOU CAN ALWAYS DIE. IT'S LIVING THAT TAKES REAL COURAGE.", "- Himura Kenshin"),
                new ListItems("2. NO MATTER HOW MUCH YOU HATE OR HOW MUCH YOU SUFFER, YOU CANT BRING THE DEAD BACK TO LIFE.", "- Nobuhiru Wastsuki"),
                new ListItems("3. BUSHIDO IS REALIZED IN THE PRESENCE OF DEATH. THIS MEANS CHOOSING DEATH WHENEVER THERE IS A CHOOSE BETWEEN LIFE AND DEATH. THERE IS NO OTHER REASONING", "– Tsunetomo Yamamoto"),
                new ListItems("4. A MAN WHO CANT UPHOLD HIS BELIEF IS PATHETIC DEAD OR ALIVE.", "– Najime Saito")
        };

        CustomAdapter adapter = new CustomAdapter(getActivity(), R.layout.listview_item_layout, items);
        listView.setAdapter(adapter);
        return view;
    }

}
