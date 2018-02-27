package com.app.chihebapp.herome.Activities;


import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v4.app.FragmentManager;
import android.os.Bundle;

import com.app.chihebapp.herome.Fragments.MainFragment;
import com.app.chihebapp.herome.Fragments.MainFragment.OnFragmentInteractionListener;
import com.app.chihebapp.herome.Fragments.PickPowerFragment;
import com.app.chihebapp.herome.R;

public class MainActivity extends AppCompatActivity implements OnFragmentInteractionListener,PickPowerFragment.OnFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //this to load new fragment for the fisrt time :
        //we need that simple test :
        FragmentManager manger=getSupportFragmentManager();
        Fragment fragment=manger.findFragmentById(R.id.fragment_container);

        if (fragment==null)
        {

          fragment=new MainFragment();
          FragmentTransaction transaction =  manger.beginTransaction();
          transaction.add(R.id.fragment_container,fragment);
          transaction.commit();


        }


    }

    public void loadPickPowerScreen ()
    {
        //this to mange loading new fragment :
        PickPowerFragment pickPowerFragment=new PickPowerFragment();
        this.getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,pickPowerFragment).addToBackStack(null).commit();

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
