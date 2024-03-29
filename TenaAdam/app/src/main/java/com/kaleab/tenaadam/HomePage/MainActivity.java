package com.kaleab.tenaadam.HomePage;

import android.content.Intent;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.kaleab.tenaadam.About.MainAbout;
import com.kaleab.tenaadam.Data.CRUD;
import com.kaleab.tenaadam.Data.MotherDbHelper;
import com.kaleab.tenaadam.HomePage.Counter.CountDown;
import com.kaleab.tenaadam.R;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
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
        getMenuInflater().inflate(R.menu.main, menu);
        //TODO setting part
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


    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_baby) {
            Toast.makeText(MainActivity.this, "Baby status is clicked", Toast.LENGTH_SHORT).show();

        } else if (id == R.id.nav_note) {
            Toast.makeText(MainActivity.this, "Note is clicked", Toast.LENGTH_SHORT).show();

        } else if (id == R.id.nav_gallery) {
            Toast.makeText(MainActivity.this, "Gallary is clicked", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.nav_camera) {
            Toast.makeText(MainActivity.this, "Camera is clicked", Toast.LENGTH_SHORT).show();

        } else if (id == R.id.nav_reminder) {
            Toast.makeText(MainActivity.this, "Reminder is clicked", Toast.LENGTH_SHORT).show();

        } else if (id == R.id.nav_about){
            Intent i = new Intent(this, MainAbout.class);
            startActivity(i);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


    @Override
    protected void onStop(){
        super.onStop();


    }

    @Override
    protected void onStart(){
        super.onStart();
    }
}
