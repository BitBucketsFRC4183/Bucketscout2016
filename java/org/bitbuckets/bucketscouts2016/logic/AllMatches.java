package org.bitbuckets.bucketscouts2016.logic;

import java.util.ArrayList;

/**
 * Created by BitBuckets on 17/02/2016.
 */
public class AllMatches {
    /** Arraylist that stores all the matches */
    private static ArrayList<Match> matches = new ArrayList<>();

    /**
     * Gets the amount of matches stored.
     *
     * @return The amount of matches in the ArrayList
     */
    public static int getAmount(){
        return matches.size();
    }

    /**
     * Adds a match to the arraylist
     *
     * @param match The match to add to the list
     */
    public static void addMatch(Match match) {
        matches.add(match);
    }

    /**
     * Gets a match at a specified index.
     *
     * @param position The index to get a match from.
     * @return The match at the specified index.
     */
    public static Match getMatch(int position) {
        return matches.get(position);
    }

    public static String getFileName(int position){
        return ("match" + matches.get(position).getMatchNum() + "_team" + matches.get(position).getTeamNum() + ".csv");
    }
}
