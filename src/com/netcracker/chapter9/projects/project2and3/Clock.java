package com.netcracker.chapter9.projects.project2and3;

public class Clock {

    public String alarm = "";

    public Clock(){}

    public String getHours(){
        return  java.time.LocalTime.now().toString().substring(0,2);
    }

    public String getMinutes(){
        return  java.time.LocalTime.now().toString().substring(3,5);
    }

    public String getTime(){
        return (alarm.equals("")) ? getHours() + ":" + getMinutes() : getHours() + ":" + getMinutes() + checkTime();

    }

    public void setAlarm(int hours,int minutes){
        if (hours < 0 || minutes < 0 || hours > 24 || minutes > 59) {
            System.out.println("Incorrect input!");
        }
        else {
            alarm = hours + ":" + minutes;
        }
    }

    public String checkTime(){
        if (Integer.parseInt(getHours()) > Integer.parseInt(alarm.substring(0,2))
                || Integer.parseInt(getHours()) == Integer.parseInt(alarm.substring(0,2))
                && Integer.parseInt(getMinutes()) >= Integer.parseInt(alarm.substring(3))){
            return "\nAlarm \u23F0";
        }
        return "";
    }
}
