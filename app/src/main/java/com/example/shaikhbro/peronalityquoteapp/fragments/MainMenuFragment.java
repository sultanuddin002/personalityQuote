package com.example.shaikhbro.peronalityquoteapp.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.shaikhbro.peronalityquoteapp.R;


public class MainMenuFragment extends Fragment implements View.OnClickListener{

    ImageView personalityA, personalityB, personalityC, personalityD;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_main_menu, container, false);
        personalityA = (ImageView) view.findViewById(R.id.personality1);
        personalityB = (ImageView) view.findViewById(R.id.personality2);
        personalityC = (ImageView) view.findViewById(R.id.personality3);
        personalityD = (ImageView) view.findViewById(R.id.personality4);

        final ImageView[] levelArray = {personalityA, personalityB, personalityC, personalityD};
        for (int i = 0; i < levelArray.length; i++) {
            levelArray[i].setOnClickListener(this);
        }
        return view;
    }


    @Override
    public void onClick(View view) {
        FragmentTransaction fragmentManager = getFragmentManager().beginTransaction();

        switch (view.getId()) {
            case R.id.personality1: {
                fragmentManager.replace(R.id.fragment_placeholder, new PersonalityAFragment());
                fragmentManager.addToBackStack(null);
                fragmentManager.commit();
                break;
            }
            case R.id.personality2: {
                fragmentManager.replace(R.id.fragment_placeholder, new PersonalityBFragment());
                fragmentManager.commit();
                break;
            }
            case R.id.personality3: {
                fragmentManager.replace(R.id.fragment_placeholder, new PersonalityCFragment());
                fragmentManager.commit();
                break;
            }
            case R.id.personality4: {
                fragmentManager.replace(R.id.fragment_placeholder, new PersonalityDFragment());
                fragmentManager.commit();
                break;
            }

        }

    }

    public void allowBackPressed(){

    }
}

