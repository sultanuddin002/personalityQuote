package com.example.shaikhbro.peronalityquoteapp;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import com.example.shaikhbro.peronalityquoteapp.fragments.MainMenuFragment;

public class MainActivity extends AppCompatActivity {

    private final static String TAG_FRAGMENT = "TAG_FRAGMENT";
    private FragmentTransaction fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentManager = getSupportFragmentManager().beginTransaction();
        fragmentManager.replace(R.id.fragment_placeholder, new MainMenuFragment(), TAG_FRAGMENT);
        fragmentManager.addToBackStack(null);
        fragmentManager.commit();

    }

    @Override
    public void onBackPressed() {
        final MainMenuFragment menuFragment = (MainMenuFragment) getSupportFragmentManager().findFragmentByTag(TAG_FRAGMENT);
        if (menuFragment.getTag().equals(TAG_FRAGMENT)) {
            fragmentManager = getSupportFragmentManager().beginTransaction();
            fragmentManager.replace(R.id.fragment_placeholder, new MainMenuFragment());
            fragmentManager.commit();
        } else {
            this.finish();
        }
    }
}
