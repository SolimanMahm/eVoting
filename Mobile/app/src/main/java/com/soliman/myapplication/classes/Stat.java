package com.soliman.myapplication.classes;

public class Stat {
    String NumberOfVote, Percent;
    int image;

    public Stat() {
    }

    public Stat(int image, String numberOfVote, String percent) {
        this.image = image;
        NumberOfVote = numberOfVote;
        Percent = percent;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getNumberOfVote() {
        return NumberOfVote;
    }

    public void setNumberOfVote(String numberOfVote) {
        NumberOfVote = numberOfVote;
    }

    public String getPercent() {
        return Percent;
    }

    public void setPercent(String percent) {
        Percent = percent;
    }
}
