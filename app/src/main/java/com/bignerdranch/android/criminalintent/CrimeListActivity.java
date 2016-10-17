package com.bignerdranch.android.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by marysia on 10/16/16.
 */
public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment(){
        return new CrimeListFragment();
    }
}

