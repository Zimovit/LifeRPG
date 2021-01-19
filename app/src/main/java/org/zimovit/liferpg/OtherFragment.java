package org.zimovit.liferpg;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.ArrayAdapter;

import androidx.fragment.app.ListFragment;

public class OtherFragment extends ListFragment {

    public static Quest[] toDeal;
    public static String [] items = {"One", "Two", "Three"};
    private static Quest [] quests;
    private static AppDatabase db;
    public static ArrayAdapter<String> adapter;
    DBDao dbDao;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setRetainInstance(true);
        setHasOptionsMenu(true);
        db = MainApp.getInstance().getDatabase();
        dbDao = db.dbDao();
        Log.d(this.getClass().getSimpleName(), "onCreate called");
    }

    private void refreshQuestList(int code) {
        DBAsyncQuery refreshQueryList = new DBAsyncQuery();
        Log.d(this.getClass().getSimpleName(), "tried to refresh");
        refreshQueryList.execute(code);
        Log.d(this.getClass().getSimpleName(), "Refresh AsyncTask started, code is " + code);
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater){
        inflater.inflate(R.menu.actions, menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState){
        super.onViewCreated(view, savedInstanceState);

        if (adapter == null){
            adapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1, items);
            setListAdapter(adapter);
        }
        refreshQuestList(DBAsyncQuery.GET_ALL);

        Log.d(this.getClass().getSimpleName(), "item array size = " + items.length);

        /*toDeal = SampleQuestSet.generateSetOfQuests();
        refreshQuestList(DBAsyncQuery.ADD_ALL);*/
    }


}
