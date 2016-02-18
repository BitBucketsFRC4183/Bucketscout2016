package org.bitbuckets.bucketscouts2016.logic;

import java.util.ArrayList;

/**
 * Created by BitBuckets on 17/02/2016.
 */
public class AllMatches {
    /** Arraylist that stores all the matches */
    private ArrayList<Match> matches;

    /**
     * Constructor. Sets up the arraylist of all the matches.
     */
    public AllMatches() {
        matches = new ArrayList<>();
    }

    /**
     * Gets the amount of matches stored.
     *
     * @return The amount of matches in the ArrayList
     */
    public int getAmount(){
        return matches.size();
    }

    /**
     * Adds a match to the arraylist
     *
     * @param match The match to add to the list
     */
    public void addMatch(Match match) {
        matches.add(match);
    }

    /**
     * Gets a match at a specified index.
     *
     * @param position The index to get a match from.
     * @return The match at the specified index.
     */
    public Match getMatch(int position) {
        return matches.get(position);
    }
}
