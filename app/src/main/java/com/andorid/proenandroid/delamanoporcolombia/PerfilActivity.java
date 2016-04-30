package com.andorid.proenandroid.delamanoporcolombia;

import android.content.SharedPreferences;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class PerfilActivity extends AppCompatActivity {

    private ImageView profileImage;
    private TextView Name;
    private TextView Email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);

        SharedPreferences prefs = getSharedPreferences("UserData", MODE_PRIVATE);
        prefs.getString("imageUser",null);
        profileImage = (ImageView) findViewById(R.id.Improf);
        Name =(TextView) findViewById(R.id.tvname) ;
        Email =(TextView) findViewById(R.id.tvcorreo);
        Name.setText(prefs.getString("nameUser","Estas como invitado"));
        Email.setText(prefs.getString("emailUser","Estas como invitado"));

        profileImage.setImageURI(Uri.parse(prefs.getString("imageUser",null)));

    }
}
