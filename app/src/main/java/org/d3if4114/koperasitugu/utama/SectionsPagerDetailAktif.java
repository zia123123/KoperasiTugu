package org.d3if4114.koperasitugu.utama;

import android.annotation.SuppressLint;
import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import org.d3if4114.koperasitugu.PembayaranFragment;
import org.d3if4114.koperasitugu.PinjamanFragment;
import org.d3if4114.koperasitugu.Qrcode;
import org.d3if4114.koperasitugu.SimpananFragment;


/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerDetailAktif extends FragmentPagerAdapter {

    @SuppressLint("SupportAnnotationUsage")
    @StringRes
    private final Context mContext;

    public SectionsPagerDetailAktif(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        Fragment fragment = null;
        switch (position){
            case 0:
                fragment = new Qrcode();
                break;
            case 1:
                fragment = new SimpananFragment();
                break;
            case 2:
                fragment = new PinjamanFragment();
                break;
            case 3:
                fragment = new PembayaranFragment();
                break;
        }
        return fragment;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "TUGAS";
            case 1:
                return "UNIT";
            case 2:
                return "COMPONENT";
        }
        return null;
    }

    @Override
    public int getCount() {
        // Show 2 total pages.
        return 3;
    }
}