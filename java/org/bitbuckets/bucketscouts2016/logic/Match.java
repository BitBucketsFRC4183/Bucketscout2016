package org.bitbuckets.bucketscouts2016.logic;

/**
 * The type that stores all the data for a scouting run.
 * Created by BitBuckets on 14/02/2016.
 */
public class Match {
    private int teamNum = 0;
    private int matchNum = 0;
    private int teamColour = 0;                 //0 for blue, 1 for red

    public Match(int teamNum, int matchNum, int teamColour) {
        this.teamNum = teamNum;
        this.matchNum = matchNum;
        this.teamColour = teamColour;
    }

    public int getTeamNum(){
        return teamNum;
    }

    public int getMatchNum() {
        return matchNum;
    }

    /**
     * Gets the team color as a 0 or a 1. 0 is blue, 1 is red.
     *
     * @return The colour the team was this match.
     */
    public int getTeamColour() {
        return teamColour;
    }
}
