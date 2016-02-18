package org.bitbuckets.bucketscouts2016;

/**
 * The type that stores all the data for a scouting run.
 * Created by BitBuckets on 14/02/2016.
 */
public class Match {
    private int teamNum = 0;
    private int matchNum = 0;

    public Match(int teamNum, int matchNum) {
        this.teamNum = teamNum;
        this.matchNum = matchNum;
    }

    public int getTeamNum(){
        return teamNum;
    }

    public int getMatchNum() {
        return matchNum;
    }
}
