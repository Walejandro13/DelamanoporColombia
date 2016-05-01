package com.andorid.proenandroid.delamanoporcolombia;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
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
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.OptionalPendingResult;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URI;

public class HomeActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener,  GoogleApiClient.ConnectionCallbacks,
        GoogleApiClient.OnConnectionFailedListener,
        View.OnClickListener {


    /* Código de petición utilizado para las interacciones con la identificación del usuario. */
    private static final int RC_SIGN_IN = 0;
    private static final String TAG = "FAIL CONECTION";
    /* Cliente utilizado para interactuar con Google APIs. */
    private GoogleApiClient mGoogleApiClient;
    /* Indica si existe una resolución de ConnectionResult pendiente */
    private boolean mIsResolving = false;

    /* Indica si debemos resolver automáticamente ConnectionResults cuando sea posible */
    private boolean mShouldResolve = false;

    /* TextView para mostrar el estado actual (identificado, no identificado, desconectado, etc.) */
    private TextView mStatus;
    /* Claves para almacenar variables de instancias en savedInstanceState */
    private static final String KEY_IS_RESOLVING = "is_resolving";
    private static final String KEY_SHOULD_RESOLVE = "should_resolve";

    private NavigationView navigationView;
    private ProgressDialog connectionProgressDialog;
    //Manejo de preferencia
    public static final String MyPREF = "UserData";
    public static final String Name = "nameUser";
    public static final String Image = "imageUser";
    public static final String Email = "emailUser";
    private ImageView imgView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Restauramos a partir de los datos almacenados
        if (savedInstanceState != null) {
            mIsResolving = savedInstanceState.getBoolean(KEY_IS_RESOLVING);
            mShouldResolve = savedInstanceState.getBoolean(KEY_SHOULD_RESOLVE);
        }
        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestEmail()
                .build();
        //#########################################################################################
        // Crea el objeto GoogleApiClient con acceso a la información básica del perfil
        mGoogleApiClient = new GoogleApiClient.Builder(this)
                .enableAutoManage(this /* FragmentActivity */, this /* OnConnectionFailedListener */)
                .addApi(Auth.GOOGLE_SIGN_IN_API, gso)
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
        imgView= (ImageView) findViewById(R.id.imagView);
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
                //Plus.AccountApi.clearDefaultAccount(mGoogleApiClient);

                signOut();
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

             Intent intent = new Intent(this,PerfilActivity.class);
            startActivity(intent);

        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_nearagent) {
            Intent intent = new Intent(this,MapsAgenActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_contacus) {

        }else if (id==R.id.sign_in_button){
            // El usuario hace clic en el botón para autenticarse, de forma que comienza
            // proceso de autenticación y automáticamente se intenta resolver cualquier
            // problema que pueda surgir.
            mStatus.setText("Entrando!!");

            mShouldResolve = true;
            // connectionProgressDialog.show();
            signIn();
            updateUI(true);



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
            GoogleSignInResult result = Auth.GoogleSignInApi.getSignInResultFromIntent(data);
            handleSignInResult(result);
            if (resultCode != RESULT_OK) {
                mShouldResolve = false;

            }

            mIsResolving = false;
            //mGoogleApiClient.connect();


        }
    }

    //Manipulacion del resultado
    private void handleSignInResult(GoogleSignInResult result) {
        Log.d(TAG, "handleSignInResult:" + result.isSuccess());
        if (result.isSuccess()) {
            // Signed in successfully, show authenticated UI.

            GoogleSignInAccount acct = result.getSignInAccount();
            String personName = acct.getDisplayName();
            String personEmail = acct.getEmail();
            String personId = acct.getId();
            Uri personPhoto = acct.getPhotoUrl();
            SharedPreferences sharedpreferences = getSharedPreferences(MyPREF, Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = sharedpreferences.edit();
            editor.putString(Name, personName);
            editor.putString(Email, personEmail);
            editor.putString(Image, personPhoto.toString());
            editor.apply();
            String hola= personPhoto.getEncodedSchemeSpecificPart();
           personPhoto.getEncodedQuery();
            mStatus.setText(personName + "\n");
            mStatus.append("\n   " + personEmail);

            mStatus.append("\n" + personPhoto.toString());
            mStatus.append("\n" + personPhoto.getQuery());
          //  descargarImagen(personPhoto.toString());
            //
            //imgView.setImageBitmap(GetURLBitmap());
            updateUI(true);
        } else {
            // Signed out, show unauthenticated UI.
            updateUI(false);
        }
    }
   //// ##################
   private Bitmap descargarImagen (String imageHttpAddress){
       URL imageUrl = null;
       Bitmap imagen = null;
       try{
           imageUrl = new URL(imageHttpAddress);
           HttpURLConnection conn = (HttpURLConnection) imageUrl.openConnection();
           conn.setRequestMethod("GET");
            conn.setDoOutput(true);
          // conn.connect();
           imagen = BitmapFactory.decodeStream(conn.getInputStream());
       }catch(IOException ex){
           ex.printStackTrace();
       }

       return imagen;
   }

    ////////////////////#################3
    public static Bitmap GetURLBitmap(URL url) {
        try {
            URLConnection conn = url.openConnection();
            conn.connect();
            InputStream isCover = conn.getInputStream();
            Bitmap bmpCover = BitmapFactory.decodeStream(isCover);
            isCover.close();
            return bmpCover;
        } catch (Exception e) {
            return null;
        }
    }

    private void updateUI(boolean isSignedIn) {
        if (isSignedIn) {
            // Muestra el nombre del usuario identificado
            // navigationView.getMenu().findItem(R.id.action_disconect).setVisible(true);

            navigationView.getMenu().findItem(R.id.sign_in_button).setVisible(false);
            // findViewById(R.id.action_disconect).setVisibility(View.VISIBLE);
        } else {
            // Muestra el mensaje de no identificado
            mStatus.setText("Sin registrar");
            //TODO falta mejorar para la visibiliadad de los items


            navigationView.getMenu().findItem(R.id.sign_in_button).setVisible(true);
            //navigationView.getMenu().getItem(6).setVisible(true);
            //
            // Modifica la visibilidad del botón
            //findViewById(R.id.sign_in_button).setEnabled(true);
           //findViewById(R.id.sign_in_button).setVisibility(View.VISIBLE);
           //findViewById(R.id.action_disconect).setVisibility(View.GONE);
        }
    }

    private void signIn() {
        Intent signInIntent = Auth.GoogleSignInApi.getSignInIntent(mGoogleApiClient);
        startActivityForResult(signInIntent, RC_SIGN_IN);
    }

    private void signOut() {
        Auth.GoogleSignInApi.signOut(mGoogleApiClient).setResultCallback(
                new ResultCallback<Status>() {
                    @Override
                    public void onResult(Status status) {
                        // [START_EXCLUDE]
                        updateUI(false);
                        // [END_EXCLUDE]
                    }
                });
    }
    @Override
    protected void onStart() {
        super.onStart();

        OptionalPendingResult<GoogleSignInResult> opr = Auth.GoogleSignInApi.silentSignIn(mGoogleApiClient);
        if (opr.isDone()) {
            // If the user's cached credentials are valid, the OptionalPendingResult will be "done"
            // and the GoogleSignInResult will be available instantly.
            Log.d(TAG, "Got cached sign-in");
            GoogleSignInResult result = opr.get();
            handleSignInResult(result);
        } else {
            // If the user has not previously signed in on this device or the sign-in has expired,
            // this asynchronous branch will attempt to sign in the user silently.  Cross-device
            // single sign-on will occur in this branch.
            showProgressDialog();
            opr.setResultCallback(new ResultCallback<GoogleSignInResult>() {
                @Override
                public void onResult(GoogleSignInResult googleSignInResult) {
                    hideProgressDialog();
                    handleSignInResult(googleSignInResult);
                }
            });
        }
    }

    private void showProgressDialog() {
        if (connectionProgressDialog == null) {
            connectionProgressDialog = new ProgressDialog(this);
            connectionProgressDialog.setMessage("Cargando...");
            connectionProgressDialog.setIndeterminate(true);
        }

        connectionProgressDialog.show();
    }

    private void hideProgressDialog() {
        if (connectionProgressDialog != null && connectionProgressDialog.isShowing()) {
            connectionProgressDialog.hide();
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        mGoogleApiClient.disconnect();
    }
}
