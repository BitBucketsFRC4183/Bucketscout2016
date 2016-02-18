package org.bitbuckets.bucketscouts2016.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import org.bitbuckets.bucketscouts2016.logic.AllMatches;
import org.bitbuckets.bucketscouts2016.logic.Match;
import org.bitbuckets.bucketscouts2016.R;
import org.bitbuckets.bucketscouts2016.logic.MatchListAdapter;

public class HomeActivity extends AppCompatActivity {
    AllMatches matches;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        matches = new AllMatches();

        ListView list = (ListView) findViewById(R.id.Matches);
        MatchListAdapter adapter = new MatchListAdapter(this, matches);
        adapter.add(new Match(4183, 5));
        adapter.add(new Match(842, 8));
        adapter.add(new Match(1717, 12));
        adapter.add(new Match(1726, 6));
        adapter.add(new Match(2468, 22));
        adapter.add(new Match(254, 11));
//        ArrayAdapter<Match> adapter = new ArrayAdapter<Match>(this, R.layout.list_item, R.id.listMatchNum);
//        adapter.add(new Match());
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });
//
//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Intent intent = new Intent(this, SettingsActivity.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
