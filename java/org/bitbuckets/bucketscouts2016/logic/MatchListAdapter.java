package org.bitbuckets.bucketscouts2016.logic;

import android.content.Context;
import android.graphics.Color;
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
    private  AllMatches matches;

    public MatchListAdapter(Context context, AllMatches matcher) {
        super(context, R.layout.list_item);                         //Calls the constructor of the superclass
        inflater = LayoutInflater.from(context);                    //Gets the layout inflator for this context because it's easier now than later
        matches = matcher;                                          //Stores the AllMatches object (pointer) to make life easier
    }

    @Override
    public void add(Match m) {
        matches.addMatch(m);
    }

    @Override
    public int getCount() {
        return matches.getAmount() + 1;
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

        if (position >= matches.getAmount()) {
            teamNumView.setText("");
            matchNumView.setText("");
            teamImageView.setImageResource(R.mipmap.plus_icon);
            listItem.setBackgroundColor(0);

        } else {
            Match m = matches.getMatch(position);

            teamNumView.setText("Match: " + m.getTeamNum());
            matchNumView.setText("Team: " + m.getMatchNum());

            if(m.getTeamColour() > 0){
                listItem.setBackgroundColor(0xFFF44336);
            }else{
                listItem.setBackgroundColor(0xFF2196F3);
            }

//            teamImageView.setImageResource(R.drawable.tshirt);
        }

        return listItem;
    }
}
