package com.appmania.keyboardtouchpad.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.appmania.keyboardtouchpad.R;


public class MouseFragment extends Fragment {

    public static String TAG = "MOUSE_FRAGMENT";

    public MouseFragment() {

    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment MouseFragment.
     */
    public static MouseFragment newInstance() {
        MouseFragment fragment = new MouseFragment();
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
        View view = inflater.inflate(R.layout.fragment_mouse, container, false);
        view.setTag(TAG);
        return view;
    }

}
