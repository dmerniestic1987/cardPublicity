package ar.com.betex.cardpublicity.activities;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

import ar.com.betex.cardpublicity.beans.Car;
import ar.com.betex.cardpublicity.fragments.MyCarTabFragment;
import ar.com.betex.cardpublicity.fragments.MyCarsFragment;
import ar.com.betex.cardpublicity.R;

public class MainActivity extends AppCompatActivity implements MyCarsFragment.OnMyCarsFragmentInteractionListener, MyCarTabFragment.OnFragmentInteractionListener
{
    private Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = this;
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle(R.string.app_name);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.navigationView);
        navigationView.bringToFront();
        navigationView.setNavigationItemSelectedListener(this.onNavigationItemSelectedListener);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.bottonNavigation);
        navigation.setOnNavigationItemSelectedListener(this.onButtonNavigationViewItemSelectedListener);

        this.replaceFragment(MyCarsFragment.newInstance(), MyCarsFragment.TAG);

        FloatingActionButton fab = findViewById(R.id.fab_add_main_activity);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, WellcomeChasisActivity.class);
                startActivity(intent);
            }
        });
    }
    protected void replaceFragment(Fragment fragment, String tag){
        FragmentTransaction transaction = this.getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.contentFrameLayout, fragment, tag);
        transaction.commit();
    }

    //Esto es el mensaje para el Button Navigation Item
    private BottomNavigationView.OnNavigationItemSelectedListener onButtonNavigationViewItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            switch (item.getItemId()) {
                case R.id.bottom_navigation_mis_autos:
                    return true;
                case R.id.bottom_navigation_concesionarias:
                    return true;
                case R.id.bottom_navigation_comprar:
                    return true;
                case R.id.bottom_navigation_beneficios:
                    return true;
            }
            return false;
        }
    };

    private NavigationView.OnNavigationItemSelectedListener onNavigationItemSelectedListener
            = new  NavigationView.OnNavigationItemSelectedListener(){

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            int id = item.getItemId();

            if (id == R.id.navigation_mis_autos) {

            } else if (id == R.id.navigation_comprar) {

            }
            DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
            drawer.closeDrawer(GravityCompat.START);
            return true;
        }
    };

    @Override
    public void onMyCarCardSelected(Car car) {
        this.replaceFragment(MyCarTabFragment.newInstance(car), MyCarTabFragment.TAG);
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
