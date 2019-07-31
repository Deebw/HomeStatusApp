package com.expleo.bucharest.homestatus;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import static com.expleo.bucharest.homestatus.Constants.*;

public class MainActivity extends AppCompatActivity {

    ImageButton buton1, buton2, buton3, buton4;
    TextView text1, text2, text3, text4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buton1 = findViewById(R.id.buton_camera_1);
        buton2 = findViewById(R.id.buton_camera_2);
        buton3 = findViewById(R.id.buton_camera_3);
        buton4 = findViewById(R.id.buton_camera_4);
        text1 = findViewById(R.id.untext1);
        text2 = findViewById(R.id.untext2);
        text3 = findViewById(R.id.untext3);
        text4 = findViewById(R.id.untext4);

        buton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //toDO fo to next activity.
                Intent intent = new Intent(getApplicationContext(), RoomActivity.class);
                intent.putExtra("Room",ROOM_1);
                startActivity(intent);
            }
        });
        buton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //todo go to next
                Intent intent = new Intent(getApplicationContext(), RoomActivity.class);
                intent.putExtra("Room",ROOM_2);
                startActivity(intent);
            }
        });
        buton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //todo go to next
                Intent intent = new Intent(getApplicationContext(), RoomActivity.class);
                intent.putExtra("Room",ROOM_3);
                startActivity(intent);
            }
        });
        buton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //todo go to next
                Intent intent = new Intent(getApplicationContext(), RoomActivity.class);
                intent.putExtra("Room",ROOM_4);
                startActivity(intent);

            }
        });


    }
}
