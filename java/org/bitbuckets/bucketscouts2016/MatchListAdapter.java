package org.bitbuckets.bucketscouts2016;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A list adapter for use in this app.
 * Created by BitBuckets on 14/02/2016.
 */
public class MatchListAdapter extends ArrayAdapter<Match> {
    private final Context context;
    private ArrayList<Match> matches;

    public MatchListAdapter(Context context) {
        super(context, -1);
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View listItem = inflater.inflate(R.layout.list_item, parent, false);
        TextView teamNumView = (TextView) listItem.findViewById(R.id.listTeamNum);
        TextView matchNumView = (TextView) listItem.findViewById(R.id.listMatchNum);
        ImageView teamImageView = (ImageView) listItem.findViewById(R.id.listTeamImage);

        teamNumView.setText("Team");
        matchNumView.setText("Match");

        return listItem;
    }
}
