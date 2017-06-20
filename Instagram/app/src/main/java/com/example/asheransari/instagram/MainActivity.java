package com.example.asheransari.instagram;

import android.content.Context;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabLayout tabLayout = (TabLayout)findViewById(R.id.tabLayout);
        ViewPager viewPager = (ViewPager)findViewById(R.id.viewPager);

        Dashboard_Adapter dashboard_adapter = new Dashboard_Adapter(getSupportFragmentManager(),this);
//        viewPager.setOffscreenPageLimit(5);
        viewPager.setAdapter(dashboard_adapter);
        tabLayout.setupWithViewPager(viewPager);

    }


    public class Dashboard_Adapter extends FragmentPagerAdapter{

        private Context context;
        public Dashboard_Adapter(FragmentManager fm,Context context) {
            super(fm);
            this.context = context;
        }

        @Override
        public Fragment getItem(int position) {
//            return null;
            Toast.makeText(context, ""+position, Toast.LENGTH_SHORT).show();
            switch (position){
                case 0:
                    return new fragmentA();
                case 1:
                    return new FragmentB();
                case 2:
                    return new FragmentC();
                case 3:
                    return new FragmentD();
                case 4:
                    return new FragmentE();
                default:
                    return null;

            }
        }

        @Override
        public CharSequence getPageTitle(int position) {

            switch (position){
                case 0:
                    return "FragmentA";
                case 1:
                    return "FragmentB";
                case 2:
                    return "FragmentC";
                case 3:
                    return "FragmentD";
                case 4:
                    return "FragmentE";
                default:
                    return null;
            }
        }

        @Override
        public int getCount() {
            return 5;
        }
    }
}
