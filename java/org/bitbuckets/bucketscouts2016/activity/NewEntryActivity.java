package org.bitbuckets.bucketscouts2016.activity;

import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Switch;

import org.bitbuckets.bucketscouts2016.R;
import org.bitbuckets.bucketscouts2016.logic.AllMatches;
import org.bitbuckets.bucketscouts2016.logic.Match;

import java.io.File;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class NewEntryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_entry);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    @Override
    protected void onStop() {
        super.onStop();

        EditText teamNumField = (EditText) findViewById(R.id.teamNumField);
        EditText matchNumField = (EditText) findViewById(R.id.matchNumField);
        Switch teamColor = (Switch) findViewById(R.id.colorSwitch);

        AllMatches.addMatch(new Match(Integer.parseInt(teamNumField.getText().toString()), Integer.parseInt(matchNumField.getText().toString()), teamColor.isChecked() ? 0 : 1));

        if (Environment.MEDIA_MOUNTED.equals(Environment.getExternalStorageState())) {
            File f = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS), AllMatches.getFileName(AllMatches.getAmount()-1));
        }

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
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
