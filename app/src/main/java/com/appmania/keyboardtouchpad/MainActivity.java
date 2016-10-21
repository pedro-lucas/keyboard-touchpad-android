package com.appmania.keyboardtouchpad;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.appmania.keyboardtouchpad.view.SlidingTabLayout;

public class MainActivity extends AppCompatActivity {

    private FloatingActionButton switchButton;
    private int mode = 1;

    private static int MODE_MOUSE = 1;
    private static int MODE_KEYBOARD = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        switchButton = (FloatingActionButton)findViewById(R.id.btn_mode_switch);
        switchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mode == MODE_MOUSE) {
                    mode = MODE_KEYBOARD;
                    switchButton.setImageResource(R.drawable.ic_keyboard);
                }else{
                    mode = MODE_MOUSE;
                    switchButton.setImageResource(R.drawable.ic_mouse);
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
