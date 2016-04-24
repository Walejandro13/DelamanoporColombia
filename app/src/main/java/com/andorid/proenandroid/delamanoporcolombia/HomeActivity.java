package com.andorid.proenandroid.delamanoporcolombia;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.util.Log;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.plus.Plus;
import com.google.android.gms.plus.model.people.Person;

public class HomeActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener,  GoogleApiClient.ConnectionCallbacks,
        GoogleApiClient.OnConnectionFailedListener,
        View.OnClickListener {


        /* Código de petición utilizado para las interacciones con la identificación del usuario. */
        private static final int RC_SIGN_IN = 0;
         private static final String TAG = "FAIL CONECTION" ;
    /* Cliente utilizado para interactuar con Google APIs. */
        private GoogleApiClient mGoogleApiClient;
        /* Indica si existe una resolución de ConnectionResult pendiente */
        private boolean mIsResolving = false;

        /* Indica si debemos resolver automáticamente ConnectionResults cuando sea posible */
        private boolean mShouldResolve = false;

        /* TextView para mostrar el estado actual (identificado, no identificado, desconectado, etc.) */
        private TextView mStatus;

        private NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //#########################################################################################
        // Crea el objeto GoogleApiClient con acceso a la información básica del perfil
        mGoogleApiClient = new GoogleApiClient.Builder(this)
                .addConnectionCallbacks(this)
                .addOnConnectionFailedListener(this)
                .addApi(Plus.API)
                .addScope(new Scope(Scopes.PROFILE))
                .build();

        // Configuramos el TextView para el estado actual
        mStatus = (TextView) findViewById(R.id.status);
        //####################################################


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

         navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        else if (id==R.id.action_disconect){
            // Limpia la cuenta por defecto de forma que el objeto GoogleApiClient no se
            // intente conectar en el futuro con ella automáticamente.

            if (mGoogleApiClient.isConnected()) {
                Plus.AccountApi.clearDefaultAccount(mGoogleApiClient);
                mGoogleApiClient.disconnect();
            }

            updateUI(false);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_perfil) {

        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_nearagent) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_contacus) {

        }else if (id==R.id.sign_in_button){
            // El usuario hace clic en el botón para autenticarse, de forma que comienza
            // proceso de autenticación y automáticamente se intenta resolver cualquier
            // problema que pueda surgir.
            mStatus.setText("Entrando!!");

            mShouldResolve = true;
            mGoogleApiClient.connect();


        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onClick(View v) {

    }

    @Override
    public void onConnected(Bundle bundle) {
        //El método onConnected indica que una cuenta estaba seleccionada en el dispositivo,
        //que la cuenta seleccionada tiene los permisos necesarios para nuestra aplicación y
        //que podemos establecer una conexión con los servicios de Google Play.
        Log.d(TAG, "onConnected:" + bundle);

        // Muestra la interfaz de identificación
        updateUI(true);
    }

    @Override
    public void onConnectionSuspended(int i) {

    }

    @Override
    public void onConnectionFailed(ConnectionResult connectionResult) {
        Log.d(TAG, "onConnectionFailed:" + connectionResult);

        if (!mIsResolving && mShouldResolve) {
            if (connectionResult.hasResolution()) {
                try {
                    connectionResult.startResolutionForResult(this, RC_SIGN_IN);
                    mIsResolving = true;
                } catch (IntentSender.SendIntentException e) {
                    Log.e(TAG, "No se pudo resolver ConnectionResult.", e);
                    mIsResolving = false;
                    mGoogleApiClient.connect();
                }
            } else {
                // Si no se puede procesar el resultado de la conexión, mostrar al usuario un
                // mensaje de error.
                showErrorDialog(connectionResult);
            }
        } else {
            // Muestra la interfaz de usuario no identificado.
            updateUI(false);
        }
    }
    private void showErrorDialog(ConnectionResult connectionResult) {
        int errorCode = connectionResult.getErrorCode();

        if (GooglePlayServicesUtil.isUserRecoverableError(errorCode)) {
            // Muestra el mensaje de error por defecto de los servicios de Google Play.
            GooglePlayServicesUtil.getErrorDialog(errorCode, this, RC_SIGN_IN,
                    new DialogInterface.OnCancelListener() {
                        @Override
                        public void onCancel(DialogInterface dialog) {
                            mShouldResolve = false;
                            updateUI(false);
                        }
                    }).show();
        } else {
            // Si no existe un mensaje de error por defecto por parte de los servicios de Google
            // Play, mostrar un mensaje al usuario.
            String errorString = "Ocurrio un error !";
            Toast.makeText(this, errorString, Toast.LENGTH_SHORT).show();

            mShouldResolve = false;
            updateUI(false);
        }
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Log.d(TAG, "onActivityResult:" + requestCode + ":" + resultCode + ":" + data);

        if (requestCode == RC_SIGN_IN) {
            // Si la resolución del error no fue satisfactoria no debemos intentar resolver errores sucesivos
            if (resultCode != RESULT_OK) {
                mShouldResolve = false;
            }

            mIsResolving = false;
            mGoogleApiClient.connect();
        }
    }



    private void updateUI(boolean isSignedIn) {
        if (isSignedIn) {
            // Muestra el nombre del usuario identificado
            Person currentPerson = Plus.PeopleApi.getCurrentPerson(mGoogleApiClient);
            if (currentPerson != null) {
                String name = currentPerson.getDisplayName();
                mStatus.setText((name));
            } else {
                //Log.w(TAG, getString(R.string.error_null_person));
                mStatus.setText("Error !!");
            }

            // Modifica la visibilidad del botón
            navigationView.getMenu().getItem(6).setVisible(false);
            findViewById(R.id.action_disconect).setVisibility(View.VISIBLE);
        } else {
            // Muestra el mensaje de no identificado
            mStatus.setText("No actualiza");
            //TODO falta mejorar para la visibiliadad de los items

            navigationView.getMenu().getItem(6).setVisible(true);

            // Modifica la visibilidad del botón
            //findViewById(R.id.sign_in_button).setEnabled(true);
           //findViewById(R.id.sign_in_button).setVisibility(View.VISIBLE);
           //findViewById(R.id.action_disconect).setVisibility(View.GONE);
        }
    }


    @Override
    protected void onStart() {
        super.onStart();
        mGoogleApiClient.connect();
    }

    @Override
    protected void onStop() {
        super.onStop();
        mGoogleApiClient.disconnect();
    }
}
