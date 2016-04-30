package com.andorid.proenandroid.delamanoporcolombia;

import android.content.SharedPreferences;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class PerfilActivity extends AppCompatActivity {

    private ImageView profileImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);

        //SharedPreferences prefs = getSharedPreferences(MyPREF, MODE_PRIVATE);

        profileImage = (ImageView) findViewById(R.id.Improf);
        //profileImage.setImageURI(Uri.parse());

    }
}
