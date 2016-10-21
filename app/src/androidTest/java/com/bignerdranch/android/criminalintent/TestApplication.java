package com.bignerdranch.android.criminalintent;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;


/**
 * Created by marysia on 10/19/16.
 */

@RunWith(AndroidJUnit4.class)
public class TestApplication {

    private int year;
    private int month;
    private int day;
    private int hour;
    private int minute;

    @Rule
    public ActivityTestRule<CrimeListActivity> mActivityRule = new ActivityTestRule<CrimeListActivity>(CrimeListActivity.class);

    @Before
    private void initDate(){
        year = 1995;
        month = 12;
        day = 21;
        hour = 11;
        minute = 0;
    }

    @Test
    public void changeDate(){
    }
}
