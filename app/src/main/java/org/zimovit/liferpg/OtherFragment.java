package org.zimovit.liferpg;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.ArrayAdapter;

import androidx.fragment.app.ListFragment;

import org.zimovit.liferpg.temp.SampleQuestSet;

import java.util.List;

public class OtherFragment extends ListFragment {

    public static Quest[] toDeal;
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
        refreshQuestList(DBAsyncQuery.GET_ALL);
    }

    private void refreshQuestList(int code) {
        DBAsyncQuery refreshQueryList = new DBAsyncQuery();
        Log.d("qwerty", "tried to refresh");
        refreshQueryList.execute(code);
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
        toDeal = SampleQuestSet.generateSetOfQuests();
        refreshQuestList(DBAsyncQuery.ADD_ALL);
    }


}
