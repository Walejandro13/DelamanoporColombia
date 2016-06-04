package com.andorid.proenandroid.delamanoporcolombia;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import android.location.LocationListener;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.andorid.proenandroid.delamanoporcolombia.Agencias;

import static com.andorid.proenandroid.delamanoporcolombia.Agencias.getMedellin;

public class MapsAgenActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private LocationManager locationManager;
    private Agencia[] agencias;
    private double dlongi, dlati;
    private int y;
    private TextView longi;
    private TextView lati;
    private TextView tView;
    private Button go;
    private Button actual;
    private LatLng loc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps_agen);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        tView = (TextView) findViewById(R.id.tView);
        longi = (EditText) findViewById(R.id.eLon);
        lati = (EditText) findViewById(R.id.eLat);
        go = (Button) findViewById(R.id.bGo);
        actual = (Button) findViewById(R.id.bActual);
        y = 0;
        agencias = getMedellin();


    }

   @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);

        //Activamos la capa o layer MyLocation
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }

        mMap.setMyLocationEnabled(true);
       for (int i = 0; i<9;i++) {
           LatLng agen = new LatLng(agencias[i].getLati(),agencias[i].getLongi());
           mMap.moveCamera(CameraUpdateFactory.newLatLng(agen));
           mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(agen, 16.0f));
           //mMap.animateCamera(CameraUpdateFactory.zoomTo(14));
           mMap.addMarker(new MarkerOptions().position(agen).title(agencias[i].getNombre()).snippet("De la mano por colombia"));
       }
        locationManager = (LocationManager) this.getSystemService(Context.LOCATION_SERVICE);

        LocationListener locationListener = new LocationListener() {
            @Override
            public void onLocationChanged(Location location) {
                 loc = new LatLng(location.getLatitude(), location.getLongitude());
                //mMarker =
               // makeUseOfNewLocation(location);
               //mMap.addMarker(new MarkerOptions().position(loc).title("Ubicación actual").snippet("De la mano por colombia"));
                //TODO falta mejorar para no mover a medida que el usuario lo hace
                if(mMap != null){
                    mMap.moveCamera(CameraUpdateFactory.newLatLng(loc));
                    mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(loc, 16.0f));
                    tView.setText("Longitud: " + location.getLatitude() + location.getLongitude());

                }
            }

            @Override
            public void onStatusChanged(String provider, int status, Bundle extras) {

            }

            @Override
            public void onProviderEnabled(String provider) {

            }

            @Override
            public void onProviderDisabled(String provider) {

            }


        };

       locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER,3000,3000,locationListener);
       //locationManager.requestLocationUpdates(LocationManager.NETWORK_PROVIDER,0,0,locationListener);
       // Location location = locationManager.getLastKnownLocation(LocationManager.GPS_PROVIDER);
        //makeUseOfNewLocation(location);
    }
//TODO realizar cambios para poder implementar esta actividad
    public void makeUseOfNewLocation(Location location) {
        if (location != null) {
        }
        dlati = location.getLatitude();
        dlongi = location.getLongitude();
        tView.setText("Longitud: " + dlongi + "\nLatitud: " + dlati);
        LatLng actualizado = new LatLng(dlati, dlongi);


        if(y==1){
            mMap.addMarker(new MarkerOptions().position(actualizado).title("Marcador actual").snippet("De la mano por Colombia"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(actualizado));
            mMap.animateCamera(CameraUpdateFactory.zoomTo(14));
        }

    }
    public void actual(View v) {
        mMap.clear();
        y = 1;
        makeUseOfNewLocation();
    }

    public void makeUseOfNewLocation() {
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        Location location = locationManager.getLastKnownLocation(LocationManager.GPS_PROVIDER);
        mMap.moveCamera(CameraUpdateFactory.newLatLng(loc));
        makeUseOfNewLocation(location);
    }

    public void go (View v){
        mMap.clear();
        //TODO asegurarse de recibir el intent y comparar accion

        String longit = getParentActivityIntent().getStringExtra("Longitud");
        dlongi = Double.parseDouble(longi.getText().toString());// DOUBLE que viene del intent
        dlati = Double.parseDouble(lati.getText().toString());
        LatLng buscar = new LatLng(dlati, dlongi);
        mMap.addMarker(new MarkerOptions().position(buscar).title("Marcador buscado").snippet("De la mano por Colombia"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(buscar));
        mMap.animateCamera(CameraUpdateFactory.zoomTo(14));
    }
}


