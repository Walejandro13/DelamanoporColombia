package com.andorid.proenandroid.delamanoporcolombia;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v4.widget.SimpleCursorAdapter;
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

import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

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
    public static String info= null;

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
        //mSectionsPagerAdapter.
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
                    case 10:
                        Snackbar.make(view, "Ahora puedes ver su ubicación en el mapa", Snackbar.LENGTH_LONG)
                                .setAction("Action", null).show();
                        intent.putExtra("Latitud", latitud);
                        intent.putExtra("Longitud", longitud);
                        intent.putExtra("Nombre", agencias[0].getNombre());

                        intent.setAction("Agencia 1");
                        startActivity(intent);

                        break;
                    case 0:
                        medio=0;
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
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");

            intent.putExtra(Intent.EXTRA_TEXT, "De la mano por Colombia \n " + info);
            startActivity(Intent.createChooser(intent, "Compartir con"));

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
        public View onCreateView(final LayoutInflater inflater, final ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_agent, container, false);
            TextView textView = (TextView) rootView.findViewById(R.id.section_label);
           // textView.setText(getString(R.string.section_format, getArguments().getInt(ARG_SECTION_NUMBER)));
            //TODO switch  section number
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
            TextView tv2= (TextView) rootView.findViewById(R.id.tvnc3);
            TextView tf= (TextView) rootView.findViewById(R.id.tv_tf);

            TextView td= (TextView) rootView.findViewById(R.id.tv_dir);
            TextView tcor= (TextView) rootView.findViewById(R.id.tv_corr);

            int section_numb=getArguments().getInt(ARG_SECTION_NUMBER);
            switch (section_numb){
                case 0:
                    Toast.makeText(
                            getActivity(),
                            "Estoy en la posicion "+getArguments().getInt(ARG_SECTION_NUMBER)  ,
                            Toast.LENGTH_LONG).show();
                    break;
                case 1:
                    agen=section_numb-1;
                    medio=0;
                    Toast.makeText(
                            getActivity(),
                            "Estoy en la posicion "+getArguments().getInt(ARG_SECTION_NUMBER)  ,
                            Toast.LENGTH_LONG).show();
                    rootView= inflater.inflate(R.layout.listview_activity,container,false);
                    final ListView listView = (ListView) rootView.findViewById(R.id.list);
                    ArrayList<String> nombres = new ArrayList<String>();

                    for (int i=0; i<agencias.length; i++){
                      nombres.add(agencias[i].getNombre());
                    }

                    ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                            android.R.layout.simple_list_item_1, android.R.id.text1, nombres);
                    listView.setAdapter(adapter);
                    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                    @Override
                    public void onItemClick(AdapterView<?> parent, View view,
                                            int position, long id) {

                        // ListView Clicked item index
                        int itemPosition     = position;

                        // ListView Clicked item value
                        String  itemValue    = (String) listView.getItemAtPosition(position);

                        // Show Alert
                        Toast.makeText(getActivity(),
                                "Position :"+itemPosition+"  ListItem : " +itemValue , Toast.LENGTH_SHORT)
                                .show();
                        if (itemPosition ==4){
                            agen=4;
                            PlaceholderFragment.newInstance(4);
                            View rootView = inflater.inflate(R.layout.fragment_agent, container, false);

                            //PlaceholderFragment.instantiate(this,)

                        }


                    }
                    });
                    break;
                case 2:
                    agen=section_numb-1;
                    tv.setText(agencias[agen].getNombre());
                    tv2.setText(agencias[agen].getDescrip());
                    tcor.setText(agencias[agen].getCorreo());
                    tf.setText(agencias[agen].getTelefono()+" ");
                    latitud= agencias[agen].getLati();
                    longitud=agencias[agen].getLongi();
                    info=agencias[agen].getNombre()+":\n"+agencias[agen].getDescrip()+"\n Página web:"
                            +agencias[agen].getCorreo()+ "\n\n Dirección: "+
                            agencias[agen].getDireccion()+"\n\n Telefono: "+(agencias[agen].getTelefono()+" ");
                    Toast.makeText(
                            getActivity(),
                            "Estoy en la posicion "+getArguments().getInt(ARG_SECTION_NUMBER)                                ,
                            Toast.LENGTH_LONG).show();
                    break;
                case 3:

                    agen=section_numb-1;
                    tv.setText(agencias[agen].getNombre());
                    tv2.setText(agencias[agen].getDescrip());
                    tcor.setText(agencias[agen].getCorreo());
                    tf.setText(agencias[agen].getTelefono()+" ");
                    latitud= agencias[agen].getLati();
                    longitud=agencias[agen].getLongi();
                    info=agencias[agen].getNombre()+"\n"+agencias[agen].getDescrip()+"\n Página web:"
                            +agencias[agen].getCorreo()+ "\n Dirección: "+ agencias[agen].getDireccion()+
                            "\n"+(agencias[agen].getTelefono()+" ");
                    Toast.makeText(
                            getActivity(),
                            "Estoy en la posicion "+getArguments().getInt(ARG_SECTION_NUMBER)                                 ,
                            Toast.LENGTH_LONG).show();
                    break;
                case 4:

                    agen=section_numb-1;
                    tv.setText(agencias[agen].getNombre());
                    tv2.setText(agencias[agen].getDescrip());
                    tcor.setText(agencias[agen].getCorreo());
                    tf.setText(agencias[agen].getTelefono()+" ");
                    latitud= agencias[agen].getLati();
                    longitud=agencias[agen].getLongi();

                    info=agencias[agen].getNombre()+"\n"+agencias[agen].getDescrip()+"\n Página web:"
                            +agencias[agen].getCorreo()+ "\n Dirección: "+ agencias[agen].getDireccion()+
                            "\n"+(agencias[agen].getTelefono()+" ");
                    Toast.makeText(
                            getActivity(),
                            "Estoy en la posicion "+getArguments().getInt(ARG_SECTION_NUMBER)                                 ,
                            Toast.LENGTH_LONG).show();
                    break;
                case 5:
                    agen=section_numb-1;
                    tv.setText(agencias[agen].getNombre());
                    tv2.setText(agencias[agen].getDescrip());
                    tcor.setText(agencias[agen].getCorreo());
                    tf.setText(agencias[agen].getTelefono()+" ");
                    latitud= agencias[agen].getLati();
                    longitud=agencias[agen].getLongi();

                    info=agencias[agen].getNombre()+"\n"+agencias[agen].getDescrip()+"\n"
                            +agencias[agen].getCorreo()+"\n Telefono: "+(agencias[agen].getTelefono()+" ");
                    Toast.makeText(
                            getActivity(),
                            "Estoy en la posicion "+getArguments().getInt(ARG_SECTION_NUMBER) ,
                            Toast.LENGTH_LONG).show();
                    break;
                case 6:
                    agen=section_numb-1;
                    tv.setText(agencias[agen].getNombre());
                    tv2.setText(agencias[agen].getDescrip());
                    tcor.setText(agencias[agen].getCorreo());
                    tf.setText(agencias[agen].getTelefono()+" ");
                    latitud= agencias[agen].getLati();
                    longitud=agencias[agen].getLongi();
                    info=agencias[agen].getNombre()+"\n"+agencias[agen].getDescrip()+"\n Página web:"
                            +agencias[agen].getCorreo()+ "\n Dirección: "+ agencias[agen].getDireccion()+
                            "\n Telefono: "+(agencias[agen].getTelefono()+" ");
                    Toast.makeText(
                            getActivity(),
                            "Estoy en la posicion "+getArguments().getInt(ARG_SECTION_NUMBER)  ,
                            Toast.LENGTH_LONG).show();

                    break;
                case 7:

                    agen=section_numb-1;
                    tv.setText(agencias[agen].getNombre());
                    tv2.setText(agencias[agen].getDescrip());
                    tcor.setText(agencias[agen].getCorreo());
                    tf.setText(agencias[agen].getTelefono()+" ");
                    latitud= agencias[agen].getLati();
                    longitud=agencias[agen].getLongi();
                    info=agencias[agen].getNombre()+"\n"+agencias[agen].getDescrip()+"\n Página web:"
                            +agencias[agen].getCorreo()+ "\n Dirección: "+ agencias[agen].getDireccion()+
                            "\n Telefono: "+(agencias[agen].getTelefono()+" ");
                    Toast.makeText(
                            getActivity(),
                            "Estoy en la posicion " +getArguments().getInt(ARG_SECTION_NUMBER) ,
                            Toast.LENGTH_LONG).show();

                    break;
                case 8:
                    agen=section_numb-1;
                    tv.setText(agencias[agen].getNombre());
                    tv2.setText(agencias[agen].getDescrip());
                    tcor.setText(agencias[agen].getCorreo());
                    tf.setText(agencias[agen].getTelefono()+" ");
                    latitud= agencias[agen].getLati();
                    longitud=agencias[agen].getLongi();
                    info=agencias[agen].getNombre()+"\n"+agencias[agen].getDescrip()+"\n Página web:"
                            +agencias[agen].getCorreo()+ "\n Dirección: "+ agencias[agen].getDireccion()+
                            "\n Telefono: "+(agencias[agen].getTelefono()+" ");

                    Toast.makeText(
                            getActivity(),
                            "Estoy en la posicion "+getArguments().getInt(ARG_SECTION_NUMBER)  ,
                            Toast.LENGTH_LONG).show();

                    break;
                case 9:

                    agen=section_numb-1;
                    tv.setText(agencias[agen].getNombre());
                    tv2.setText(agencias[agen].getDescrip());
                    tcor.setText(agencias[agen].getCorreo());
                    tf.setText(agencias[agen].getTelefono()+" ");
                    latitud= agencias[agen].getLati();
                    longitud=agencias[agen].getLongi();

                    info=agencias[agen].getNombre()+"\n"+agencias[agen].getDescrip()+"\n Página web:"
                            +agencias[agen].getCorreo()+ "\n Dirección: "+ agencias[agen].getDireccion()+
                            "\n Telefono: "+(agencias[agen].getTelefono()+" ");
                    Toast.makeText(
                            getActivity(),
                            "Estoy en la posicion " +getArguments().getInt(ARG_SECTION_NUMBER) ,
                            Toast.LENGTH_LONG).show();
                    break;
                case 10:

                    agen=10;
                    tv.setText(agencias[0].getNombre());
                    tv2.setText(agencias[0].getDescrip());
                    tcor.setText(agencias[0].getCorreo());
                    tf.setText(agencias[0].getTelefono()+" ");
                    latitud= agencias[0].getLati();
                    longitud=agencias[0].getLongi();

                    info=agencias[0].getNombre()+"\n"+agencias[0].getDescrip()+"\n Página web:"
                            +agencias[0].getCorreo()+ "\n Dirección: "+ agencias[0].getDireccion()+
                            "\n Telefono: "+(agencias[0].getTelefono()+" ");
                    Toast.makeText(
                            getActivity(),
                            "Estoy en la posicion "+getArguments().getInt(ARG_SECTION_NUMBER)  ,
                            Toast.LENGTH_LONG).show();
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
            return PlaceholderFragment.newInstance(position + 1);
        }

        @Override
        public int getCount() {
            return 3;
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
                case 10:
                    return "SECTION 10";
            }
            return null;
        }
    }


}
