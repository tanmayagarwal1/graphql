package com.uhg.gpd.ole;

public class time {
    private String time;

    public time(String time) {
        this.time = time;
    }

    public time() {
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "time{" +
                "time='" + time + '\'' +
                '}';
    }
}
