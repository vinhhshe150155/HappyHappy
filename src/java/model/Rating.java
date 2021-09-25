package model;
public class Rating {
    private int rateID;
    private int rateAmount;
    private String rateDescription;
    private String rateTime;
    private int mentorID;
    private int menteeID;

    public Rating(int rateID, int rateAmount, String rateDescription, String rateTime, int mentorID, int menteeID) {
        this.rateID = rateID;
        this.rateAmount = rateAmount;
        this.rateDescription = rateDescription;
        this.rateTime = rateTime;
        this.mentorID = mentorID;
        this.menteeID = menteeID;
    }

    public int getRateID() {
        return rateID;
    }

    public void setRateID(int rateID) {
        this.rateID = rateID;
    }

    public int getRateAmount() {
        return rateAmount;
    }

    public void setRateAmount(int rateAmount) {
        this.rateAmount = rateAmount;
    }

    public String getRateDescription() {
        return rateDescription;
    }

    public void setRateDescription(String rateDescription) {
        this.rateDescription = rateDescription;
    }

    public String getRateTime() {
        return rateTime;
    }

    public void setRateTime(String rateTime) {
        this.rateTime = rateTime;
    }

    public int getMentorID() {
        return mentorID;
    }

    public void setMentorID(int mentorID) {
        this.mentorID = mentorID;
    }

    public int getMenteeID() {
        return menteeID;
    }

    public void setMenteeID(int menteeID) {
        this.menteeID = menteeID;
    }
    
}
