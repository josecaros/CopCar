package com.idnp.copcar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.util.Log;

import com.google.android.material.tabs.TabLayout;
import com.idnp.copcar.fragments.Chat;
import com.idnp.copcar.fragments.GroupChat;
import com.idnp.copcar.resources.ViewPagerAdapter;

public class VistaInicial extends AppCompatActivity {
    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vista_inicial);
        toolbar = (Toolbar) findViewById(R.id.myToolbar);
        tabLayout= (TabLayout) findViewById(R.id.tablayout);
        viewPager = (ViewPager) findViewById(R.id.myViewPager);

        Log.i("tab","toolbar");
        setSupportActionBar(toolbar);
        Log.i("tab","viewpager");
        setupViewPager(viewPager);
        Log.i("tab","tablayout");
        tabLayout.setupWithViewPager(viewPager);
        Log.i("tab","finMetodo");
    }

    private void setupViewPager(ViewPager viewPager){
        Log.i("tab","metodo");
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.addFragment(new Chat(),"Chat");
        viewPagerAdapter.addFragment(new GroupChat(),"Grupos");
        viewPager.setAdapter(viewPagerAdapter);
    }
}
