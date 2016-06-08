package com.andorid.proenandroid.delamanoporcolombia;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

import static com.andorid.proenandroid.delamanoporcolombia.Agencias.getBogota;
import static com.andorid.proenandroid.delamanoporcolombia.Agencias.getCali;
import static com.andorid.proenandroid.delamanoporcolombia.Agencias.getCartagena;
import static com.andorid.proenandroid.delamanoporcolombia.Agencias.getManizales;
import static com.andorid.proenandroid.delamanoporcolombia.Agencias.getMedellin;
import static com.andorid.proenandroid.delamanoporcolombia.Agencias.getSantaMarta;

import static com.andorid.proenandroid.delamanoporcolombia.HomeActivity.medio;

public class AgentActivity extends AppCompatActivity {

    private SectionsPagerAdapter mSectionsPagerAdapter;
    private ListView mylist;
    public static Agencia[] agencias, agenciasbo;
    public static int agen = 0;
    private static double latitud=0;
    private static double longitud=0;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;
    private FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agent);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);


         fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setVisibility(View.VISIBLE);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(AgentActivity.this,MapsAgenActivity.class);
                medio=1;
                switch (agen){
                    case 0:
                        Snackbar.make(view, "Ahora puedes ver su ubicación en el mapa", Snackbar.LENGTH_LONG)
                                .setAction("Action", null).show();
                        intent.putExtra("Latitud", latitud);
                        intent.putExtra("Longitud", longitud);
                        intent.putExtra("Nombre", agencias[0].getNombre());

                        intent.setAction("Agencia 1");
                        startActivity(intent);
                        break;
                    case 1:
                        Snackbar.make(view, "Ahora puedes ver su ubicación en el mapa", Snackbar.LENGTH_LONG)
                                .setAction("Action", null).show();
                       // intent.putExtra("Latitud", agencias[1].getLati());
                        //intent.putExtra("Longitud", agencias[1].getLongi());
                        intent.putExtra("Latitud", latitud);
                        intent.putExtra("Longitud", longitud);
                        intent.putExtra("Nombre", agencias[1].getNombre());
                        intent.setAction("Agencia 1");
                        startActivity(intent);
                        break;
                    case 2:
                        Snackbar.make(view, "Ahora puedes ver su ubicación en el mapa", Snackbar.LENGTH_LONG)
                                .setAction("Action", null).show();
                       // intent.putExtra("Latitud", agencias[2].getLati());
                        //intent.putExtra("Longitud", agencias[2].getLongi());
                        intent.putExtra("Latitud", latitud);
                        intent.putExtra("Longitud", longitud);
                        intent.putExtra("Nombre", agencias[2].getNombre());
                        intent.setAction("Agencia 1");
                        startActivity(intent);
                        break;
                    case 3:
                        Snackbar.make(view, "Ahora puedes ver su ubicación en el mapa", Snackbar.LENGTH_LONG)
                                .setAction("Action", null).show();
                        //intent.putExtra("Latitud", agencias[3].getLati());
                        //intent.putExtra("Longitud", agencias[3].getLongi());
                        intent.putExtra("Latitud", latitud);
                        intent.putExtra("Longitud", longitud);
                        intent.putExtra("Nombre", agencias[3].getNombre());
                        intent.setAction("Agencia 1");
                        startActivity(intent);
                        break;
                    case 4:
                        Snackbar.make(view, "Ahora puedes ver su ubicación en el mapa", Snackbar.LENGTH_LONG)
                                .setAction("Action", null).show();
                       // intent.putExtra("Latitud", agencias[4].getLati());
                        //intent.putExtra("Longitud", agencias[4].getLongi());
                        intent.putExtra("Latitud", latitud);
                        intent.putExtra("Longitud", longitud);
                        intent.putExtra("Nombre", agencias[4].getNombre());
                        intent.setAction("Agencia 1");
                        startActivity(intent);
                        break;
                    case 5:
                        Snackbar.make(view, "Ahora puedes ver su ubicación en el mapa", Snackbar.LENGTH_LONG)
                                .setAction("Action", null).show();
                       // intent.putExtra("Latitud", agencias[5].getLati());
                       // intent.putExtra("Longitud", agencias[5].getLongi());
                        intent.putExtra("Latitud", latitud);
                        intent.putExtra("Longitud", longitud);
                        intent.putExtra("Nombre", agencias[5].getNombre());
                        intent.setAction("Agencia 1");
                        startActivity(intent);
                        break;
                    case 6:
                        Snackbar.make(view, "Ahora puedes ver su ubicación en el mapa", Snackbar.LENGTH_LONG)
                                .setAction("Action", null).show();
                       // intent.putExtra("Latitud", agencias[6].getLati());
                        //intent.putExtra("Longitud", agencias[6].getLongi());
                        intent.putExtra("Latitud", latitud);
                        intent.putExtra("Longitud", longitud);
                        intent.putExtra("Nombre", agencias[6].getNombre());
                        intent.setAction("Agencia 1");
                        startActivity(intent);
                        break;
                    case 7:
                        Snackbar.make(view, "Ahora puedes ver su ubicación en el mapa", Snackbar.LENGTH_LONG)
                                .setAction("Action", null).show();
                        //intent.putExtra("Latitud", agencias[7].getLati());
                        //intent.putExtra("Longitud", agencias[7].getLongi());
                        intent.putExtra("Latitud", latitud);
                        intent.putExtra("Longitud", longitud);
                        intent.putExtra("Nombre", agencias[7].getNombre());
                        intent.setAction("Agencia 1");
                        startActivity(intent);
                        break;
                    case 8:
                        Snackbar.make(view, "Ahora puedes ver su ubicación en el mapa", Snackbar.LENGTH_LONG)
                                .setAction("Action", null).show();
                        //intent.putExtra("Latitud", agencias[8].getLati());
                        //intent.putExtra("Longitud", agencias[8].getLongi());
                        intent.putExtra("Latitud", latitud);
                        intent.putExtra("Longitud", longitud);
                        intent.putExtra("Nombre", agencias[8].getNombre());
                        intent.setAction("Agencia 1");
                        startActivity(intent);
                        break;
                    default:
                        break;
                }

            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_agent, menu);
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

        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment implements View.OnClickListener{
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private static final String ARG_SECTION_NUMBER = "section_number";

        public PlaceholderFragment() {
        }

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        public static PlaceholderFragment newInstance(int sectionNumber) {
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_agent, container, false);
            TextView textView = (TextView) rootView.findViewById(R.id.section_label);
           // textView.setText(getString(R.string.section_format, getArguments().getInt(ARG_SECTION_NUMBER)));
            //TODO switch  section number
            RelativeLayout frame1= (RelativeLayout) rootView.findViewById(R.id.frame1);
            String ciudad = getActivity().getIntent().getAction();

            switch (ciudad){
                case "Medellin":
                    agencias=getMedellin();
                    break;
                case "Bogota":
                    agencias=getBogota();
                    break;
                case "Cartagena":
                    agencias=getCartagena();
                    break;
                case "Cali":
                    agencias=getCali();
                    break;
                case "Santamarta":
                    agencias=getSantaMarta();
                    break;
                case "Manizales":
                    agencias=getManizales();
                    break;
            }

            TextView tv= (TextView) rootView.findViewById(R.id.tvnc1);
            tv.setText(ciudad);
            frame1.setOnClickListener(this);
            TextView tv2= (TextView) rootView.findViewById(R.id.tvnc3);
            TextView tf= (TextView) rootView.findViewById(R.id.tv_tf);

            TextView td= (TextView) rootView.findViewById(R.id.tv_dir);
            TextView tcor= (TextView) rootView.findViewById(R.id.tv_corr);

            //Todo deacuerdo a ciudad

            switch (getArguments().getInt(ARG_SECTION_NUMBER)){
                case 1:
                    //todo  llenar fragmento
                    agen=0;
                    tv.setText(agencias[0].getNombre());
                    tv2.setText(agencias[0].getDescrip());
                    tcor.setText(agencias[0].getCorreo());
                    tf.setText(agencias[0].getTelefono()+" ");
                    latitud= agencias[0].getLati();
                    longitud=agencias[0].getLongi();
                    break;
                case 2:
                    //todo  llenar fragmento
                    agen=1;
                   tv.setText(agencias[1].getNombre());
                    tv2.setText(agencias[1].getDescrip());
                    tcor.setText(agencias[1].getCorreo());
                    tf.setText(agencias[1].getTelefono()+" ");
                    latitud= agencias[1].getLati();
                    longitud=agencias[1].getLongi();
                    break;
                case 3:
                    //todo  llenar fragmento
                    agen=2;
                   tv.setText(agencias[2].getNombre());
                    tv2.setText(agencias[2].getDescrip());
                    tcor.setText(agencias[2].getCorreo());
                    tf.setText(agencias[2].getTelefono()+" ");
                    latitud= agencias[2].getLati();
                    longitud=agencias[2].getLongi();
                    break;
                case 4:
                    //todo  llenar fragmento
                    agen=3;
                   tv.setText(agencias[3].getNombre());
                    tv2.setText(agencias[3].getDescrip());
                    tcor.setText(agencias[3].getCorreo());
                    tf.setText(agencias[3].getTelefono()+" ");
                    latitud= agencias[3].getLati();
                    longitud=agencias[3].getLongi();
                    break;
                case 5:
                    //todo  llenar
                    agen=4;
                   tv.setText(agencias[4].getNombre());
                    tv2.setText(agencias[4].getDescrip());
                    tcor.setText(agencias[4].getCorreo());
                    tf.setText(agencias[4].getTelefono()+" ");
                    latitud= agencias[4].getLati();
                    longitud=agencias[4].getLongi();
                    break;
                case 6:
                    //todo  llenar fragmento
                    agen=5;
                   tv.setText(agencias[5].getNombre());
                    tv2.setText(agencias[5].getDescrip());
                    tcor.setText(agencias[5].getCorreo());
                    tf.setText(agencias[5].getTelefono()+" ");
                    latitud= agencias[5].getLati();
                    longitud=agencias[5].getLongi();
                    break;
                case 7:
                    //todo  llenar fragmento
                    agen=6;
                   tv.setText(agencias[6].getNombre());
                    tv2.setText(agencias[6].getDescrip());
                    tcor.setText(agencias[6].getCorreo());
                    tf.setText(agencias[6].getTelefono()+" ");
                    latitud= agencias[6].getLati();
                    longitud=agencias[6].getLongi();
                    break;
                case 8:
                    //todo  llenar fragmento
                    agen=7;
                    tv.setText(agencias[7].getNombre());
                    tv2.setText(agencias[7].getDescrip());
                    tcor.setText(agencias[7].getCorreo());
                    tf.setText(agencias[7].getTelefono()+" ");
                    latitud= agencias[7].getLati();
                    longitud=agencias[7].getLongi();
                    break;
                case 9:
                    //todo  llenar fragmento
                    agen=8;
                    tv.setText(agencias[8].getNombre());
                    tv2.setText(agencias[8].getDescrip());
                    tcor.setText(agencias[8].getCorreo());
                    tf.setText(agencias[8].getTelefono()+" ");
                    latitud= agencias[8].getLati();
                    longitud=agencias[8].getLongi();
                    break;

            }


            return rootView;
        }

        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case (R.id.frame1):


                    break;


            }
        }
    }


    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            // getItem is called to instantiate the fragment for the given page.
            // Return a PlaceholderFragment (defined as a static inner class below).

            // TODO: ACA SE DEBEN ASIGNAR LA INFORMCIÓN DE LA AGENCIA

            return PlaceholderFragment.newInstance(position + 1);
        }

        @Override
        public int getCount() {
            return 9;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "SECTION 1";
                case 1:
                    return "SECTION 2";
                case 2:
                    return "SECTION 3";
                case 3:
                    return "SECTION 4";
                case 4:
                    return "SECTION 5";
                case 5:
                    return "SECTION 6";
                case 6:
                    return "SECTION 7";
                case 7:
                    return "SECTION 8";
                case 8:
                    return "SECTION 9";

            }
            return null;
        }
    }


}
