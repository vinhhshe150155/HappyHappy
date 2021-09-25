package model;
public class Notification {
    private int notiID;
    private int userID;
    private String content;
    /*ex: 1 is message, 2 is new request, 3 is money...*/
    private int notiType;
    private int status;
    private String notiTime;

    public Notification(int notiID, int userID, String content, int notiType, int status, String notiTime) {
        this.notiID = notiID;
        this.userID = userID;
        this.content = content;
        this.notiType = notiType;
        this.status = status;
        this.notiTime = notiTime;
    }

    public int getNotiID() {
        return notiID;
    }

    public void setNotiID(int notiID) {
        this.notiID = notiID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getNotiType() {
        return notiType;
    }

    public void setNotiType(int notiType) {
        this.notiType = notiType;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getNotiTime() {
        return notiTime;
    }

    public void setNotiTime(String notiTime) {
        this.notiTime = notiTime;
    }

}
