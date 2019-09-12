package com.example.reloxo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.provider.AlarmClock;
import android.widget.TextView;
import android.widget.EditText;
import android.view.View.OnClickListener;
import android.content.Intent;
import android.widget.Button;
import android.view.View;

public class AlarmActivity extends AppCompatActivity {

    static int alarm_TypeInt;

    public static final String alarm_tag = "AlarmActivity";

    // @Override create all new instances of values when app is re/started
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm);

        Intent getIntent_From_MainActivity = getIntent();
        String intent_From_MainActivity = getIntent_From_MainActivity.getStringExtra(MainActivity.EXTRA_INTENT);

        if (getSupportFragmentManager().findFragmentByTag(alarm_tag) == null) {
            AlarmFragment alarm_frag = new AlarmFragment();
            FragmentTransaction alarmFragment_FragmentTransaction = getSupportFragmentManager().beginTransaction();
            alarmFragment_FragmentTransaction.add(alarm_frag, alarm_tag);
            alarmFragment_FragmentTransaction.commit();
        } // Creates a new instance of the FragmentManager to allow for the AlarmFragment class to link to AlarmActivity and operate.

        // OnClickListener : Alarm Set Button
        Button button_SetAlarm;
        button_SetAlarm = findViewById(R.id.button_set);
        button_SetAlarm.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                // TODO Auto-generated method stub
                Intent button_Intent = new Intent();
                startActivity(button_Intent);
                button_set();
            }
        });

        Button button_StopAlarm;
        button_StopAlarm = findViewById(R.id.button_stop);
        button_StopAlarm.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent button_Intent = new Intent();
                startActivity(button_Intent);
                button_stop();
            }
        });
    }

    AlarmFragment.button_set button_set, button_set_operation;
    com.example.reloxo.AlarmFragment.button_set button_set() {
        button_set = button_set_operation;
        return button_set_operation;
    }

    AlarmFragment.button_stop button_stop, button_stop_operation;
    com.example.reloxo.AlarmFragment.button_stop button_stop() {
        button_stop = button_stop_operation;
        return button_stop_operation;
    }

}