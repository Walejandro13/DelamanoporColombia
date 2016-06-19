package com.andorid.proenandroid.delamanoporcolombia;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import java.lang.Math;

import android.location.LocationListener;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.andorid.proenandroid.delamanoporcolombia.Agencias;

import static com.andorid.proenandroid.delamanoporcolombia.Agencias.getBogota;
import static com.andorid.proenandroid.delamanoporcolombia.Agencias.getCali;
import static com.andorid.proenandroid.delamanoporcolombia.Agencias.getCartagena;
import static com.andorid.proenandroid.delamanoporcolombia.Agencias.getManizales;
import static com.andorid.proenandroid.delamanoporcolombia.Agencias.getMedellin;
import static com.andorid.proenandroid.delamanoporcolombia.Agencias.getSantaMarta;
import static com.andorid.proenandroid.delamanoporcolombia.HomeActivity.ciudad;

import static com.andorid.proenandroid.delamanoporcolombia.HomeActivity.medio;

public class MapsAgenActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private LocationManager locationManager;
    private Agencia[] agencias;
    private double dlongi, dlati;
    private int y;
    private LatLng loc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps_agen);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        y = 0;
        getagent();


    }

   @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);

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
        if (medio==0) {

            for (int i = 0; i < 9; i++) {
                LatLng agen = new LatLng(agencias[i].getLati(), agencias[i].getLongi());
                mMap.moveCamera(CameraUpdateFactory.newLatLng(agen));
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(agen, 16.0f));
                //mMap.animateCamera(CameraUpdateFactory.zoomTo(14));
                mMap.addMarker(new MarkerOptions().position(agen).title(agencias[i].getNombre()).snippet("De la mano por colombia"));
            }
        }
       else{
            go();
        }
        locationManager = (LocationManager) this.getSystemService(Context.LOCATION_SERVICE);

        LocationListener locationListener = new LocationListener() {
            @Override
            public void onLocationChanged(Location location) {
                 loc = new LatLng(location.getLatitude(), location.getLongitude());
                //mMarker =
               // makeUseOfNewLocation(location);
               //mMap.addMarker(new MarkerOptions().position(loc).title("Ubicación actual").snippet("De la mano por colombia"));
                if((mMap != null)&&(medio==0)){
                  // mMap.moveCamera(CameraUpdateFactory.newLatLng(loc));
                    mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(loc, 18.0f));
                    double menor=60000, menorlon=1000, d =0, menorla=0;
                    String noma = null;
                    double r = 6378.7;
                    for (int i=0;i<agencias.length;i++){

                        d=r*Math.acos( Math.sin( agencias[i].getLati() )* Math.sin ( location.getLatitude()) +
                                Math.cos( agencias[i].getLati() )*Math.cos( location.getLatitude())
                                *Math.cos(location.getLongitude() - agencias[i].getLongi()));
                        if (d<=menor) {
                            menorla= agencias[i].getLati();
                            noma=agencias[i].getNombre();
                            menorlon=agencias[i].getLongi();
                            menor  = d;
                        }

                    }
                    Toast.makeText(
                            MapsAgenActivity.this,
                            "La agencia mas cercana es:\n" +
                                    noma,
                            Toast.LENGTH_LONG).show();
                    loc= new LatLng(menorla,menorlon);
                    mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(loc, 16.0f));
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
        LatLng actualizado = new LatLng(dlati, dlongi);


        if(y==1){
            mMap.addMarker(new MarkerOptions().position(actualizado).title("Ubicacion Actual").snippet("De la mano por Colombia"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(actualizado));
            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(actualizado, 16.0f));
        }

    }
    public void actual() {
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

    public void go (){
        mMap.clear();
        String nom= getIntent().getStringExtra("Nombre");
        Double longit = getIntent().getDoubleExtra("Longitud",0);
        Double lati = getIntent().getDoubleExtra("Latitud",0);
        dlongi = longit;
        dlati = lati;
        LatLng buscar = new LatLng(dlati, dlongi);
        mMap.addMarker(new MarkerOptions().position(buscar).title(nom).snippet("De la mano por Colombia"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(buscar));
        //mMap.animateCamera(CameraUpdateFactory.zoomTo(buscar,16));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(buscar, 16.0f));
    }


    public  void getagent(){
        //int accion = getParentActivityIntent().getIntExtra("invoca",0);

        switch (ciudad){
            case 0:
                //mmed, mani, marta,cart, bog,cali
                Double[] coord= new Double[]{6.2690007, 5.0744274, 11.0867009,
                        10.40036,4.6486259,3.4109271};
                //actual();
                int menor=(int)dlati;
                switch (menor){
                    case 6:
                        agencias= getMedellin();
                        break;
                    case 5:
                        agencias= getManizales();
                        break;
                    case 11:
                        agencias= getSantaMarta();
                        break;
                    case 10:
                        agencias= getCartagena();
                        break;
                    case 4:
                        agencias= getBogota();
                        break;
                    case 3:
                        agencias= getCali();
                        break;
                    default:
                        agencias= getMedellin();
                }

                break;
            case 1:
                agencias= getMedellin();
                break;
            case 2:
                agencias= getBogota();
                break;

            case 3:
                agencias= getCali();
                break;

            case 4:
                agencias= getManizales();
                break;

            case 5:
                agencias= getSantaMarta();
                break;

            case 6:
                agencias= getCartagena();
                break;


        }

    }

}


