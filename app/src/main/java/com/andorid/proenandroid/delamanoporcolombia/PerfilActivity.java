package com.andorid.proenandroid.delamanoporcolombia;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

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

        //HttpURLConnection conn = null;


        Uri imgUri= Uri.parse(prefs.getString("imageUser",null)  );
        profileImage.setImageURI(null);
        profileImage.setImageURI(imgUri);
        String url= prefs.getString("imageUser",null);

        //profileImage.setImageBitmap(GetURLBitmap(url)));


    }


    }





