package com.andorid.proenandroid.delamanoporcolombia;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import static com.andorid.proenandroid.delamanoporcolombia.HomeActivity.medio;

public class AgenttActivity extends AppCompatActivity {

    private CollapsingToolbarLayout mtoolbar;
    private double latitud,longitud;
    private String nom;
    private int ima;
    private String info=null;
    public static int x=0;
    private TextView tvno, tvdes,tvtel,tvweb,tvdir;
    private String des;
    private String tel;
    private String web;
    private String dir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agentt);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        mtoolbar= (CollapsingToolbarLayout) findViewById(R.id.toolbar_layout);
        getDatos();

        tvno= (TextView) findViewById(R.id.tvnc2);
        tvno.setText(nom);
        tvdes= (TextView) findViewById(R.id.tvnc1);
        tvdes.setText(des);
        tvtel= (TextView) findViewById(R.id.tv_tf);
        tvtel.setText(tel);
        tvweb= (TextView) findViewById(R.id.tv_corr);
        tvweb.setText(web);
        tvdir= (TextView) findViewById(R.id.tv_dir);
        tvdir.setText(dir);



        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab2);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AgenttActivity.this,MapsAgenActivity.class);
                medio=1;

                intent.putExtra("Latitud", latitud);
                intent.putExtra("Longitud", longitud);
                intent.putExtra("Nombre", nom);

                intent.setAction("Agencia 1");
                startActivity(intent);

                //TODO segun los casos asignar latitud y longitud para enviar al mapa
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_agent, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");

            intent.putExtra(Intent.EXTRA_TEXT, "De la mano por Colombia \n " + info);
            startActivity(Intent.createChooser(intent, "Compartir a través de "));

            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void getDatos(){
        //Todo mandar nombre y demas datos en el intent
        x=1;
        nom= getIntent().getStringExtra("Nombre");
        des=getIntent().getStringExtra("Descrip");
        tel=getIntent().getStringExtra("Tel");
        web=getIntent().getStringExtra("Web");
        dir=getIntent().getStringExtra("Dir");
        longitud = getIntent().getDoubleExtra("Longitud",0);
        latitud = getIntent().getDoubleExtra("Latitud",0);

        ima= getIntent().getIntExtra("Image",R.drawable.fondo1);

//        mtoolbar.setBackgroundResource(ima);
       /* info=nom+"\n"+agencias[agen].getDescrip()+"\n Página web:"
                +agencias[agen].getCorreo()+ "\n Dirección: "+ agencias[agen].getDireccion()+
                "\n"+(agencias[agen].getTelefono()+" ");*/

    }
}
