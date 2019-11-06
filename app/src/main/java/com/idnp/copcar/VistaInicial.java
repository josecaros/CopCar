package com.idnp.copcar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.google.android.material.tabs.TabLayout;
import com.idnp.copcar.fragments.Chat;
import com.idnp.copcar.fragments.GroupChat;
import com.idnp.copcar.resources.ViewPagerAdapter;

public class VistaInicial extends AppCompatActivity {
    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    //private DrawerLayout drawerLayout;
    //private ActionBarDrawerToggle newToggle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vista_inicial);
        toolbar = (Toolbar) findViewById(R.id.myToolbar);
        tabLayout= (TabLayout) findViewById(R.id.tablayout);
        viewPager = (ViewPager) findViewById(R.id.myViewPager);
        //drawerLayout = (DrawerLayout) findViewById(R.id.drawer);



        Log.i("tab","toolbar");
        setSupportActionBar(toolbar);
        Log.i("tab","viewpager");
        setupViewPager(viewPager);
        Log.i("tab","tablayout");
        tabLayout.setupWithViewPager(viewPager);
        Log.i("tab","finMetodo");
        /*newToggle = new ActionBarDrawerToggle(this, drawerLayout,R.string.open_a,R.string.close_a);
        drawerLayout.addDrawerListener(newToggle);
        newToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);*/
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }
    /*
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (newToggle.onOptionsItemSelected(item))
            return true;
        return super.onOptionsItemSelected(item);
    }*/

    private void setupViewPager(ViewPager viewPager){
        Log.i("tab","metodo");
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.addFragment(new Chat(),"Chat");
        viewPagerAdapter.addFragment(new GroupChat(),"Grupos");
        viewPager.setAdapter(viewPagerAdapter);
    }
}
