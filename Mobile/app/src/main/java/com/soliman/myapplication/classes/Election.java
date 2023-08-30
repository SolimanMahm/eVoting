package com.soliman.myapplication.classes;

public class Election {

    private String Topic, ID, EndDate;

    public Election() {
    }

    public Election(String topic, String ID, String countdown) {
        Topic = topic;
        this.ID = ID;
        EndDate = countdown;
    }

    public String getTopic() {
        return Topic;
    }

    public void setTopic(String topic) {
        Topic = topic;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getEndDate() {
        return EndDate;
    }

    public void setEndDate(String countdown) {
        EndDate = countdown;
    }
}
