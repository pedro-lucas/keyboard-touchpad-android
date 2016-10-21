package com.appmania.keyboardtouchpad.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.appmania.keyboardtouchpad.R;

public class KeyboardFragment extends Fragment {

    public static String TAG = "KEYBOARD_FRAGMENT";

    public KeyboardFragment() {

    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment KeyboardFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static KeyboardFragment newInstance() {
        KeyboardFragment fragment = new KeyboardFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_keyboard, container, false);
        view.setTag(TAG);
        return view;
    }


}
