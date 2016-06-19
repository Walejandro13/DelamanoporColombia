package com.andorid.proenandroid.delamanoporcolombia;

import android.app.ListActivity;
import android.content.Intent;
import android.database.MatrixCursor;
import android.support.v4.widget.SimpleCursorAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import static com.andorid.proenandroid.delamanoporcolombia.Agencias.getBogota;
import static com.andorid.proenandroid.delamanoporcolombia.Agencias.getCali;
import static com.andorid.proenandroid.delamanoporcolombia.Agencias.getCartagena;
import static com.andorid.proenandroid.delamanoporcolombia.Agencias.getManizales;
import static com.andorid.proenandroid.delamanoporcolombia.Agencias.getMedellin;
import static com.andorid.proenandroid.delamanoporcolombia.Agencias.getSantaMarta;
import static com.andorid.proenandroid.delamanoporcolombia.AgenttActivity.x;

public class ListAgentActivity extends ListActivity {

    private Agencia[] agencias;
    private String ciudad=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_list_agent);

        if (x==0) {
            ciudad = getIntent().getAction();
            switch (ciudad) {
                case "Medellin":
                    agencias = getMedellin();
                    break;
                case "Bogota":
                    agencias = getBogota();
                    break;
                case "Cartagena":
                    agencias = getCartagena();
                    break;
                case "Cali":
                    agencias = getCali();
                    break;
                case "Santamarta":
                    agencias = getSantaMarta();
                    break;
                case "Manizales":
                    agencias = getManizales();
                    break;
            }
        }else{
            switch (ciudad) {
                case "Medellin":
                    agencias = getMedellin();
                    break;
                case "Bogota":
                    agencias = getBogota();
                    break;
                case "Cartagena":
                    agencias = getCartagena();
                    break;
                case "Cali":
                    agencias = getCali();
                    break;
                case "Santamarta":
                    agencias = getSantaMarta();
                    break;
                case "Manizales":
                    agencias = getManizales();
                    break;
            }
        }
        //Simulamos que extraemos los datos de la base de datos a un cursor
        String[] columnasBD = new String[] {"_id", "imagen", "Nombre", "Pagina web"};
        MatrixCursor cursor = new MatrixCursor(columnasBD);
        for (int i=0; i<agencias.length;i++ ){
            cursor.addRow(new Object[]{(""+i+""),agencias[i].getIdImage(),agencias[i].getNombre(),agencias[i].getCorreo()});
        }

        //Añadimos los datos al Adapter y le indicamos donde dibujar cada dato en la fila del Layout
        String[] desdeEstasColumnas = {"imagen", "Nombre", "Pagina web"};
        int[] aEstasViews = {R.id.imageView_imagen, R.id.textView_superior, R.id.textView_inferior};
        SimpleCursorAdapter adapter = new SimpleCursorAdapter(this, R.layout.fragment_item, cursor, desdeEstasColumnas, aEstasViews, 0);

        ListView listado = getListView();
        listado.setAdapter(adapter);

    }
    @Override
    public void onListItemClick(ListView lista, View view, int posicion, long id) {
        // Hacer algo cuando un elemento de la lista es seleccionado
        TextView textoTitulo = (TextView) view.findViewById(R.id.textView_superior);

        CharSequence texto = "Seleccionado: " + textoTitulo.getText();
        Toast.makeText(getApplicationContext(), texto, Toast.LENGTH_LONG).show();
        Intent intent = new Intent(ListAgentActivity.this,AgenttActivity.class);

        intent.putExtra("Nombre", agencias[posicion].getNombre());
        intent.putExtra("Longitud",agencias[posicion].getLongi());
        intent.putExtra("Latitud",agencias[posicion].getLati());
        intent.putExtra("Image",agencias[posicion].getIdImage());
        intent.putExtra("Descrip",agencias[posicion].getDescrip());
        intent.putExtra("Tel",agencias[posicion].getTelefono());
        intent.putExtra("Web",agencias[posicion].getCorreo());
        intent.putExtra("Dir",agencias[posicion].getDireccion());



        intent.setAction(ciudad);
        startActivity(intent);

        }
}
