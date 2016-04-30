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
import java.net.HttpURLConnection;
import java.net.URL;

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

        URL imageUrl = null;
        try {
            imageUrl = new URL("http://jonsegador.com/wp-content/apezz.png");
            HttpURLConnection conn = (HttpURLConnection) imageUrl.openConnection();
            conn.connect();
            Bitmap loadedImage = BitmapFactory.decodeStream(conn.getInputStream());
            profileImage.setImageBitmap(loadedImage);
        } catch (IOException e) {
            Toast.makeText(getApplicationContext(), "Error cargando la imagen: "+e.getMessage(), Toast.LENGTH_LONG).show();
            e.printStackTrace();
        }
    }

       // profileImage.setImageURI(Uri.parse(prefs.getString("imageUser",null)));


    }

