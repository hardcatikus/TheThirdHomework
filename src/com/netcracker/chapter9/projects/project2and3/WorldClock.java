package com.netcracker.chapter9.projects.project2and3;

public class WorldClock extends Clock{

    private int timeZone ;

    public WorldClock() {
        timeZone = 0;
    }

    public WorldClock(int timeZone) {
        this.timeZone = timeZone;
    }

    @Override
    public String getHours(){
        return String.valueOf(Math.abs(Math.floorMod(Integer.parseInt(super.getHours())+timeZone,24)));
    }

}
