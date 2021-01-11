package org.zimovit.liferpg;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.ArrayAdapter;

import androidx.fragment.app.ListFragment;

import java.util.List;

public class OtherFragment extends ListFragment {

    public static List<Quest> toDeal;
    public static String [] items = new String[0];
    private static Quest [] quests;
    private static AppDatabase db;
    public static ArrayAdapter<String> adapter;
    DBDao dbDao;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setRetainInstance(true);
        setHasOptionsMenu(true);
        db = DBInstance.getInstance().getDatabase();
        dbDao = db.dbDao();
        refreshQuestList();
    }

    private void refreshQuestList() {
        DBAsyncQuery refreshQueryList = new DBAsyncQuery();
        Log.d("qwerty", "tried to refresh");
        refreshQueryList.execute(0);
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater){
        inflater.inflate(R.menu.actions, menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState){
        super.onViewCreated(view, savedInstanceState);

        adapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1, items);
        setListAdapter(adapter);
    }


}
