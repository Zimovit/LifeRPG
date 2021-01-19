package org.zimovit.liferpg;

import android.os.AsyncTask;
import android.util.Log;

import java.util.List;

public class DBAsyncQuery extends AsyncTask<Integer, Void, String[]> {
    //Queries
    public static final int GET_ALL = 0;
    public static final int ADD_ALL = 1;
    private Quest[] toProcess;
    private String [] result;

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        toProcess = OtherFragment.toDeal;
        Log.d(this.getClass().getSimpleName(), "ASQ called");

    }

    @Override
    protected String[] doInBackground(Integer... integers) {
        Log.d(this.getClass().getSimpleName(), "Background process started");
        switch (integers[0]) {
            case GET_ALL:
                Log.d(this.getClass().getSimpleName(), "Case Get_all");
                List<Quest> quests = MainApp.getInstance().getDatabase().dbDao().getAllQuests();
                result = new String[quests.size()];
                for (int i = 0; i < quests.size(); i++){
                    result[i] = quests.get(i).questName;
                }
                return result;
            case ADD_ALL:
                Log.d(this.getClass().getSimpleName(), "Case add_all");
                MainApp.getInstance().getDatabase().dbDao().insertAllQuests(toProcess);
                result = new String[toProcess.length];
                for (int i = 0; i < toProcess.length; i++){
                    result[i] = toProcess[i].questName;
                }
                return result;

        }
        return null;
    }

    @Override
    protected void onPostExecute(String[] questsNames) {
        super.onPostExecute(questsNames);
        OtherFragment.items = questsNames;
        OtherFragment.adapter.notifyDataSetChanged();
        OtherFragment.toDeal = null;
        Log.d(this.getClass().getSimpleName(), "ASQ finished, items array size = " + OtherFragment.items.length);
    }
}
