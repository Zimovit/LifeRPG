package org.zimovit.liferpg;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class ContentFragment extends Fragment implements View.OnClickListener {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View result = inflater.inflate(R.layout.mainfrag, container,false);
        result.findViewById(R.id.button).setOnClickListener(this);
        return (result);
    }

    @Override
    public void onClick(View v) {
        String message = "Test message";
        Toast toast =Toast.makeText(getActivity(), message, Toast.LENGTH_SHORT);
        toast.show();
    }
}
