package co.gov.mintic.misiontic.ciclo4.usa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

import co.gov.mintic.misiontic.ciclo4.usa.fragmentos.Fragmento1;
import co.gov.mintic.misiontic.ciclo4.usa.fragmentos.Fragmento2;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirFragmento1(View view) {
        FragmentManager manejadorFrag = getSupportFragmentManager();
        FragmentTransaction transaccion = manejadorFrag.beginTransaction();
        Fragmento1 f = new Fragmento1();
        transaccion.add(R.id.contenedorFrag,f);
        transaccion.commit();
    }

    public void abrirFragmento2(View view) {
        FragmentManager manejadorFrag = getSupportFragmentManager();
        FragmentTransaction transaccion = manejadorFrag.beginTransaction();
        Fragmento2 f = new Fragmento2();
        transaccion.add(R.id.contenedorFrag,f);
        transaccion.commit();
    }
}