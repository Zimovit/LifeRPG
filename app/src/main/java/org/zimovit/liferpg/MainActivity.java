package org.zimovit.liferpg;

import android.os.Bundle;
import android.view.Menu;

import androidx.fragment.app.FragmentActivity;

public class MainActivity extends FragmentActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        if (getSupportFragmentManager().findFragmentById(android.R.id.content) == null){
            getSupportFragmentManager().beginTransaction().add(android.R.id.content, new OtherFragment()).commit();
        }
    }

}
