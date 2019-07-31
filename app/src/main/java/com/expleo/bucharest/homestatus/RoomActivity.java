package com.expleo.bucharest.homestatus;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageButton;
import android.widget.TextView;

import static com.expleo.bucharest.homestatus.Constants.*;

public class RoomActivity extends AppCompatActivity {

    ImageButton buton1, buton2, buton3;
    TextView text1, text2, text3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle bundle = getIntent().getExtras();
        int room = 0;
        if (bundle != null) {
            room = bundle.getInt("Room");
        }
        setContentView(R.layout.activity_room);
        text1 = findViewById(R.id.room_nr);
        text1.setText("ROOM " + room);

        if (text1.getText().toString().equals("ROOM 1")){

        }

    }
}
