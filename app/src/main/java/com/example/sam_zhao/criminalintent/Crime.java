package com.example.sam_zhao.criminalintent;

import java.util.Date;
import java.util.UUID;

public class Crime {
    private UUID Id;
    private String Title;
    private Date Date;
    private boolean Solved;

    public UUID getId() {
        return Id;
    }

    public String getTitle() {
        return Title;
    }

    public Date getDate() {
        return Date;
    }

    public boolean isSolved() {
        return Solved;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public void setDate(Date Date) {
        this.Date = Date;
    }

    public void setSolved(boolean mSolved) {
        this.Solved = mSolved;
    }

    public Crime() {
        Id = UUID.randomUUID();
        Date = new Date();
    }
}
