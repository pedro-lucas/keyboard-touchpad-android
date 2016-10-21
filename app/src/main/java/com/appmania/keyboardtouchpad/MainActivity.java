package com.appmania.keyboardtouchpad;

import android.os.PersistableBundle;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.appmania.keyboardtouchpad.fragment.KeyboardFragment;
import com.appmania.keyboardtouchpad.fragment.MouseFragment;

public class MainActivity extends AppCompatActivity {

    private static String BUNDLE_MODE = "BUNDLE_MODE";

    private FloatingActionButton switchButton;
    private int mode = 1;

    private static int MODE_MOUSE = 1;
    private static int MODE_KEYBOARD = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        switchButton = (FloatingActionButton)findViewById(R.id.btn_mode_switch);

        if(savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().add(R.id.fragment_container, new MouseFragment()).commit();
        }else{
            mode = savedInstanceState.getInt(BUNDLE_MODE);
            if(mode == MODE_MOUSE) {
                switchButton.setImageResource(R.drawable.ic_keyboard);
            }else{
                switchButton.setImageResource(R.drawable.ic_mouse);
            }
        }

        switchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment;
                if(mode == MODE_MOUSE) {
                    mode = MODE_KEYBOARD;
                    switchButton.setImageResource(R.drawable.ic_mouse);
                    fragment = (Fragment)new KeyboardFragment();
                }else{
                    mode = MODE_MOUSE;
                    switchButton.setImageResource(R.drawable.ic_keyboard);
                    fragment = (Fragment)new MouseFragment();
                }

                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

                transaction.replace(R.id.fragment_container, fragment);
                transaction.addToBackStack(null);

                transaction.commit();

            }
        });

    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        outState.putInt(BUNDLE_MODE, mode);
    }
}
