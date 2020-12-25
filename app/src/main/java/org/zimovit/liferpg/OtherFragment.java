package org.zimovit.liferpg;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.ArrayAdapter;

import androidx.fragment.app.ListFragment;

public class OtherFragment extends ListFragment {

    private static final String [] items = { "lorem", "ipsum", "dolor",
            "sit", "amet", "consectetuer", "adipiscing", "elit", "morbi",
            "vel", "ligula", "vitae", "arcu", "aliquet", "mollis", "etiam",
            "vel", "erat", "placerat", "ante", "porttitor", "sodales",
            "pellentesque", "augue", "purus" };

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setRetainInstance(true);
        setHasOptionsMenu(true);
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater){
        inflater.inflate(R.menu.actions, menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState){
        super.onViewCreated(view, savedInstanceState);

        setListAdapter(new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1, items));
    }

}
