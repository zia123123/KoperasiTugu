package org.d3if4114.koperasitugu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.google.android.material.tabs.TabLayout;

import org.d3if4114.koperasitugu.utama.SectionsPagerDetailAktif;

public class Dashboard extends AppCompatActivity {
    private static final int MY_CAMERA_REQUEST_CODE = 100;

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        if (checkSelfPermission(Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
            requestPermissions(new String[]{Manifest.permission.CAMERA}, MY_CAMERA_REQUEST_CODE);
        }
        SectionsPagerDetailAktif sectionsPagerAdapter = new SectionsPagerDetailAktif(this, getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);
        viewPager.setCurrentItem(1, true);
        TabLayout tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);
        tabs.getTabAt(0).setIcon(R.drawable.qrcode);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.keluar) {
            startActivity(new Intent(Dashboard.this, MainActivity.class));
            Intent intent = new Intent("finish");
            sendBroadcast(intent);
            finish();
        } else{
            startActivity(new Intent(Dashboard.this, MyProfile.class));
            Intent intent = new Intent("finish");
            sendBroadcast(intent);
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}