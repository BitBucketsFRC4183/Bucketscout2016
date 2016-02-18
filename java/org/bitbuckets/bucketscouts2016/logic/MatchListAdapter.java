package org.bitbuckets.bucketscouts2016.logic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.bitbuckets.bucketscouts2016.logic.Match;
import org.bitbuckets.bucketscouts2016.R;

import java.util.ArrayList;

/**
 * A list adapter for use in this app.
 * Created by BitBuckets on 14/02/2016.
 */
public class MatchListAdapter extends ArrayAdapter<Match> {
    private LayoutInflater inflater;
    private ArrayList<Match> matches;

    public MatchListAdapter(Context context) {
        super(context, R.layout.list_item);
        inflater = LayoutInflater.from(context);
        matches = new ArrayList<Match>();
    }

    @Override
    public void add(Match m) {
        matches.add(m);
    }

    @Override
    public int getCount() {
        return matches.size() + 1;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
//        View listItem = inflater.inflate(R.layout.list_item, parent, false);

        View listItem;

        if (convertView == null) {
            listItem = inflater.inflate(R.layout.list_item, parent, false);
        } else {
            listItem = convertView;
        }

        TextView teamNumView = (TextView) listItem.findViewById(R.id.listTeamNum);
        TextView matchNumView = (TextView) listItem.findViewById(R.id.listMatchNum);
        ImageView teamImageView = (ImageView) listItem.findViewById(R.id.listTeamImage);

        if (position >= matches.size()) {
            teamNumView.setText("");
            matchNumView.setText("");
            teamImageView.setImageResource(R.mipmap.plus_icon);

        } else {
            Match m = matches.get(position);

            teamNumView.setText("Match: " + m.getTeamNum());
            matchNumView.setText("Team: " + m.getMatchNum());
//            teamImageView.setImageResource(R.drawable.tshirt);
        }

        return listItem;
    }
}
